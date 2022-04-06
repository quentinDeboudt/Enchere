<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title for="acheteur">${model.current.utilisateur.pseudo} a remporté la vente</title>
</head>
<body>
	<header> 
		<a href="AccueilConnecter.jsp" style="text-decoration:none; color:black; font-size: 25px; ">Eni-Enchères</a>
	</header>
	
	<div style="display: flex; justify-content: Center;">
			<h2 style="" for="acheteur">${model.current.utilisateur.pseudo} a remporté la vente</h2> 	
	</div>
	
	<form action="jeRemporteVenteServlet" method="post" style="display: flex;" >
	
		<div style="padding: 60px; margin:20px; border: solid; max-height: 20px; max-width: 60px; Background-color ;">
			[Image]
		</div>
		
		<div style="display: flex; justify-content: Center; font-weight:bold;">
		<label for="nomArticle">${model.current.nomArticle}</label><br>
		</div>
		
		<div>
			<label for="description">Description: ${model.current.description}</label><br>		
			<label for="prixVente">Meilleure Offre: ${model.current.prixVente}</label><br>			
			<label for="miseAPrix">Mise à prix: ${model.current.miseAPrix}</label><br>
			<label for="lieuRetrait">Retrait: ${model.current.lieuRetrait}</label><br>
			<label for="utilisateur">Vendeur: ${model.current.utilisateur.pseudo}</label><br>		
			<input type="submit" name="BT_RETRAIT" value="Retrait effectué" />				
		</div>
		
	</form>
	
	
</body>
</html>