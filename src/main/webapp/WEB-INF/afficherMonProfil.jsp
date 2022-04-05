<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Info mon profil</title>
</head>

<body>

<header>
<div>
<a href="accueilNonConnecter.jsp" style="text-decoration:none; color:black; font-size: 25px; ">Eni-Enchères</a>
</div>
</header>

<form action="AfficherMonProfilServlet" method="POST">
	<div>
		<label for="pseudo">Pseudo: ${model.current.pseudo}</label><br>
		<label for="nom">Nom: ${model.current.nom}</label><br>		
		<label for="prénom">Prénom: ${model.current.prenom}</label><br>			
		<label for="email">Email: ${model.current.email}</label><br>
		<label for="telephone">Téléphone: ${model.current.telephone}</label><br>
		<label for="rue">Rue: ${model.current.rue}</label><br>	
		<label for="codePostal">Code Postal:${model.current.codePostal}</label><br>
		<label for="ville">Ville: ${model.current.ville}</label><br>					
	</div>
	
	<div>
		<input type="submit" name="BT_MODIF" value="Modifier"/>
	</div>
</body>
</html>