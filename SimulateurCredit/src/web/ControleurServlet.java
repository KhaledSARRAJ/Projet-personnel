package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CreditMetierImpl;
import metier.ICreditMetier;

@WebServlet(name = "cs", urlPatterns = { "/Controleur", "*.JEE" }) // TABLEAU D'appel

public class ControleurServlet extends HttpServlet {
//4
	private ICreditMetier metier;

	@Override
	public void init() throws ServletException {
	//4
		metier = new CreditMetierImpl();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//9: 
		request.setAttribute("creditModel", new CreditModel());
		request.getRequestDispatcher("VueCredit.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 1 : Lire les donnees de la requête
		double montant = Double.parseDouble(req.getParameter("montant"));// convertir en double
		double taux = Double.parseDouble(req.getParameter("taux"));
		int duree = Integer.parseInt(req.getParameter("duree"));
		//2: Valider les donnees

		//3: Stocker les donnees saisies dans le modéle
		CreditModel model = new CreditModel();
		model.setMontant(montant);
		model.setTaux(taux);
		model.setDuree(duree);
		//4: ICreditMetier metier = new CreditMetierImpl(); on peut le faire ici mais
		// achaque fois ou on va appeler doPost on instancie une couche metier

		//5: faire appel à la couche metier pour effectuer les traitements
		double res = metier.calculerMensulatiteCredit(montant, taux, duree);
		//6: Stocker les resultat dans le modéle
		model.setMensulaite(res);
		
		
		//7: Stocker le modéle dans l'objet request
		req.setAttribute("creditModel", model);
        //8: Faire un forword vers la vue jsp
		req.getRequestDispatcher("VueCredit.jsp").forward(req, resp);

	}
}
