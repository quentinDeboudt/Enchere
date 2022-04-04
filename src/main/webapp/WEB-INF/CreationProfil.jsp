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

<header>
<div>
<a href="AccueilDeconnecte.jsp" style="text-decoration:none; color:black; font-size: 25px; ">Eni-Enchères</a>
</div>
</header>

<div id="titrePage"><h1>Mon profil</h1></div>

<form action="CreationProfilServlet" method="POST">

<div style="display:flex;">
	<div style="display:flex; flex-direction: column; max-width: 20%; margin: 5px;">
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
	<div style="display:flex; flex-direction: column; max-width: 20%; margin: 5px;">
		<label for="nom">Nom:</label>
			<input type="text" name="nom" value="${model.current.nom}"><br>
		<label for="email">Email:</label>
			<input type="email" name="email" value="${model.current.email}"><br>
		<label for="rue">Rue:</label>
			<input type="texte" name="rue" value="${model.current.rue}"><br>
		<label for="ville">Ville:</label>
			<input type="text" name="ville" value="${model.current.ville}"><br>
		<label for="verifMotDePasse">Confirmation:</label>
			<input type="password" name="verifMotDePasse" value="${model.current.motDePasse}"><br>
	</div>
</div>

<div>
	<input type="submit" name="BT_CREER" value="Créer"/>
	<input type="submit" name="BT_ANNULER" value="Annuler"/>
</div>

</body>
</html>