<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page d'acceuil connecter</title>
</head>
<body>
	<form action="AcceuilConnecterServlet" method="post"></form>
		NoUtilisateur:<input type="texte" name="noUtilisateur" value="${model.current.nom}" /><br>
		Pseudo:<input type="texte" name="pseudo" value="${model.current.nom}" /><br>
		Nom:<input type="texte" name="nom" value="${model.current.nom}" /><br>
		Prenom:<input type="texte" name="prenom" value="${model.current.nom}" /><br>
		Email:<input type="texte" name="email" value="${model.current.nom}" /><br>
		Telephone:<input type="texte" name="telephone" value="${model.current.nom}" /><br>
		Rue:<input type="texte" name="rue" value="${model.current.nom}" /><br>
		Code postal:<input type="texte" name="code postal" value="${model.current.nom}" /><br>
		Ville:<input type="texte" name="ville" value="${model.current.nom}" /><br>
		Mot de passe:<input type="texte" name="mot de passe" value="${model.current.nom}" /><br>
		Credit:<input type="texte" name="credit" value="${model.current.nom}" /><br>
		Administrateur:<input type="texte" name="administrateur" value="${model.current.nom}" /><br>
</body>
</html>