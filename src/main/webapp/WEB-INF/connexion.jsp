<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Connexion</title>
	</head>
	
	<body>
		<form action="ConnexionServlet" method="post">
		
			<h1>ENI-Encheres</h1>
			
			<p>${error}</p>
			
			<div>
				Identifiant : <input type="text" name="identifiant" value="${identifiant}" /><br>
				Mot de passe :<input type="text" name="motDePasse" value="${motDePasse}" /><br>
			</div>
			
			<div>
				<p><input type="submit" name="BT_Connexion" value="Connexion" /></p><br>
				<p><input type="submit" name="BT_Création" value="Créer un compte" /></p>
			</div>
		
		</form>
	</body>
</html>