<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/Index.css" />
		<meta charset="UTF-8">
		<title>Connexion</title>
	</head>
	
	<body>
		<header>
			<h1 id="Eni-Enchères">ENI-Encheres</h1>
		</header>
		
		
		
		
		<form action="ConnexionServlet" method="post">
		
			
			
			<p>${error}</p>
			
			<div>
				Identifiant : <input type="text" name="identifiant" value="${identifiant}" /><br>
				Mot de passe :<input type="text" name="motDePasse" value="${motDePasse}" /><br>
			</div>
			
			<p><input id="BT_Connexion" type="submit" name="BT_Connexion" value="Connexion" /></p><br>
		</form>	
		
		<form action="ConnexionServlet" method="post">	
			<p><input id="BT_Connexion" type="submit" name="BT_Création" value="Créer un compte" /></p>
		</form>	
		
	</body>
</html>