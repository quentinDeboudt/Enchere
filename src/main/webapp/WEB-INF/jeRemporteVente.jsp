<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vous avez remporté l'enchère</title>
</head>
<body>
	<header> 
		<a href="AccueilConnecter.jsp" style="text-decoration:none; color:black; font-size: 25px; ">Eni-Enchères</a>
	</header>
	
	<div style="display: flex; justify-content: Center;">
			<h2 style="">Vous avez remporté la vente</h2> 	
	</div>
	
	<form action="jeRemporteVenteServlet" method="post" style="display: flex;" >
	
		<div style="padding: 60px; margin:20px; border: solid; max-height: 20px; max-width: 60px; Background-color ;">
			[Image]
		</div>
		
		<div style="display: flex; justify-content: Center; font-weight:bold;">
			<label for="nomArticle">${model.current.nomArticle}</label><br>
		</div>
		
		<div>
			<label for="description">Description: ${sessionScope.description}</label><br>		
			<label for="prixVente">Meilleure Offre: ${sessionScope.prixVente}</label><br>			
			<label for="miseAPrix">Mise à prix: ${sessionScope.miseAPrix}</label><br>
			<label for="lieuRetrait">Retrait: ${sessionScope.lieuRetrait}</label><br>
			<label for="utilisateur">Vendeur: ${sessionScope.utilisateur.pseudo}</label><br>	
			<label for="telephone">Tel: ${sessionScope.utilisateur.telephone}</label><br>	
			<input type="submit" name="BT_BACK" value="Back" />				
		</div>
		
	</form>
	
	
</body>
</html>