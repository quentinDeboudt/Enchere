<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AccueilConnecter</title>
</head>
<body>
	<h1>ENI-Encheres</h1> <p style="text-align:right;"><a href="" >Enchères</a> <a href="" >Vendre un article</a> <a href="" >Mon profil</a> <a href="" >Déconnexion</a></p>
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