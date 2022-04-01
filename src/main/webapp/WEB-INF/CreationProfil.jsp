<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mon profil</title>
</head>
<body>
<p style="color:#F08080">${model.message}</p>

<div id="titrePage"><h1>Mon profil</h1></div>

<form action="CreationProfilServlet" method="POST">
<div>
	<label for="pseudo">Pseudo:</label>
		<input type="text" name="pseudo" value="${model.current.pseudo}"><br>
	<label for="prénom">Prénom:</label>
		<input type="text" name="prenom" value="${model.current.prenom}"><br>
	<label for="telephone">Téléphone:</label>
		<input type="text" name="telephone" value="${model.current.telephone}"><br>
	<label for="codePostal">Code Postal:</label>
		<input type="text" name="codePostal" value="${model.current.codePostal}"><br>
	<label for="motDePasse">Mot de Passe:</label>
		<input type="password" name="motDePasse" value="${model.current.motDePasse}"><br>
</div>

</body>
</html>