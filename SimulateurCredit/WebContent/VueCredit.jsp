<%@page import="web.CreditModel"%>
<%
	CreditModel model = (CreditModel) request.getAttribute("creditModel");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Crédit bancaire</title>
<link rel="stylesheet" type="text/css"
	href="css/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css"
	href="css/style.css" />
</head>
<body>
	<p class="spacer"></p>
	<div class="container">
	<div class="col-md-10 col-xm-12 col-sm-6 col-md-offset-3">
		<div class="panel panel-primary">
			<div class="panel-heading">Simulation du crédit</div>
			<div class="panel-body">
				<form action="calculerMensualite.JEE" method="post">
					<div class="form-group">
						<label class="control-label">Montant:</label> <input
							class="form-control" type="text" name="montant"
							value="<%=model.getMontant()%>" />
					</div>
					<div class="form-group">
						<label class="control-label">Taux:</label> <input
							class="form-control" type="text" name="taux"
							value="<%=model.getTaux()%>" />
					</div>
					<div class="form-group">
						<label class="control-label">Durée:</label> <input
							class="form-control" type="text" name="duree"
							value="<%=model.getDuree()%>" />
					</div>
					<button class="btn btn-danger">Calculer</button>

				</form>
				<div class="spacer">
					<label>Mensualité: </label> <label><%=model.getMensulaite()%></label>

				</div>
			</div>
		</div>
	</div>
</div>


</body>
</html>