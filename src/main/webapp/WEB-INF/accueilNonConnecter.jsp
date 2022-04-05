<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil non connecter</title>
</head>
<body>
	<h1>ENI-Encheres</h1> <p style="text-align:right;"><a href="" >S'inscrire-Se connecter</a></p>
	<h2 style="text-align:center;">Liste des enchères</h2>
	<form action="AccueilNonConnecterServlet" method="post"></form>
	<h2>Filtres :</h2>
	<input type="texte" name="nomArticle" value="${model.current.nom}" />
	<h2>Catégorie : <input type="texte" name="catégorie" value="${model.current.nom}" /></h2>
	<input type="submit" name="BT_Rechercher" value="Rechercher" />
	<br>
	<p><p><span style="border: 1px solid black;">PC Gamer pour travailler</p></span></p>
	
	

</body>
</html>