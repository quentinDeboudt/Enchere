<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/Index.css" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Info ${model.current.pseudo}</title>
</head>

<body>
<p style="color:#F08080">${model.message}</p>

<header>
<div>
<a href="accueilNonConnecter.jsp" style="text-decoration:none; color:black; font-size: 25px; ">Eni-Ench�res</a>
</div>
</header>

<form action="AfficherProfilAutreUtilisateurServlet" method="POST">
<div>
	<label for="pseudo">Pseudo: ${model.current.pseudo}</label><br>
	<label for="nom">Nom: ${model.current.nom}</label><br>		
	<label for="pr�nom">Pr�nom:{model.current.prenom}</label><br>			
	<label for="email">Email: ${model.current.email}</label><br>
	<label for="telephone">T�l�phone:{model.current.telephone}</label><br>
	<label for="rue">Rue:{model.current.rue}</label><br>	
	<label for="codePostal">Code Postal:${model.current.codePostal}</label><br>
	<label for="ville">Ville:${model.current.ville}</label><br>					
</div>

</body>
</html>