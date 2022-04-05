<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connexion</title>
</head>
<body>
<form action="ConnexionServlet" method="post"></form>
	<h1>ENI-Encheres</h1>
	Identifiant : <input type="texte" name="Identifiant" value="${model.current.nom}" /><br>
	Mot de passe :<input type="texte" name="Mot de passe" value="${model.current.nom}" /><br>
	<p><input type="submit" name="BT_Connexion" value="Connexion" /></p><br>
	<p><input type="submit" name="BT_Création" value="Créer un compte" /></p>
	
</body>
</html>