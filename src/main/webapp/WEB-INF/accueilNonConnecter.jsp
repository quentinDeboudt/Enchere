<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil non connecter</title>
</head>
<body>
	<header style="display:flex; flex-direction: rows;">
		<a href="AccueilDeconnecter.jsp" style="text-decoration:none; color:black; font-size: 25px; ">Eni-Enchères</a>
		<a href="" >S'inscrire-Se connecter</a>
	</header>
	
	<h2 style="text-align:center;">Liste des enchères</h2>
	<form action="AccueilNonConnecterServlet" method="post"></form>
	<h2>Filtres :</h2>
	<input type="texte" name="noUtilisateur" value="${model.current.nom}" />
	<h2>Catégorie :</h2>
	<input type="submit" name="BT_Creation" value="Rechercher" />
	<br>
	<p><p><span style="border: 1px solid black;">PC Gamer pour travailler</p></span></p>
	
	

</body>
</html>