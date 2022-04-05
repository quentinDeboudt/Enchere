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
	<label for="pseudo">Pseudo: ${sessionScope.pseudo}</label><br>
	<label for="nom">Nom: ${sessionScope.nom}</label><br>		
	<label for="prénom">Prénom:{sessionScope.prenom}</label><br>			
	<label for="email">Email: ${sessionScope.email}</label><br>
	<label for="telephone">Téléphone:{sessionScope.telephone}</label><br>
	<label for="rue">Rue:{sessionScope.rue}</label><br>	
	<label for="codePostal">Code Postal:${sessionScope.codePostal}</label><br>
	<label for="ville">Ville:${sessionScope.ville}</label><br>					
</div>
</body>
</html>