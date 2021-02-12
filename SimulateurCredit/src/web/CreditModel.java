package web;

public class CreditModel {
	private double montant;
	private double taux;
	private int duree;
	private double mensulaite;
	public CreditModel(double montant, double taux, int duree, double mensulaite) {
		super();
		this.montant = montant;
		this.taux = taux;
		this.duree = duree;
		this.mensulaite = mensulaite;
	}
	public CreditModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public double getMensulaite() {
		return mensulaite;
	}
	public void setMensulaite(double mensulaite) {
		this.mensulaite = mensulaite;
	}
	@Override
	public String toString() {
		return "CreditModel [montant=" + montant + ", taux=" + taux + ", duree=" + duree + ", mensulaite=" + mensulaite
				+ "]";
	}

}
