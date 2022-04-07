<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/Index.css" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil non connecter</title> 
</head>
<body>
	<header >
		<div>
			<a href="<%=request.getContextPath()%>/AccueilConnecterServlet" style="text-decoration:none; color:black; font-size: 25px; ">Eni-Enchères</a>
		</div>
		<div>
			<a href="<%=request.getContextPath()%>/ConnexionServlet" > S'inscrire-Se connecter </a>
		</div>
	</header>
	
	<div>
		<h2 style="text-align:center;">Liste des enchères</h2>
	</div>
	
	
	<div>
		<form action="AccueilNonConnecterServlet" method="post"></form>                      
		<h2>Filtres :</h2>
		<input type="text" name="noUtilisateur" value="${model.current.nom}" />
		<h2>Catégorie :</h2>
		<input type="submit" name="BT_Creation" value="Rechercher" />
	</div>	
	<br>
	<p><p><span style="border: 1px solid black;">PC Gamer pour travailler</p></span></p>
	
	
	<c:forEach items="${listeEnchere}" var="enchere">
		<p>${enchere.noEnchere}${enchere.dateEnchere}${enchere.montant_enchere}${enchere.utilisateur}${enchere.articleVendu}</p>
	</c:forEach>
	
	<!-- style="display:flex; flex-direction: rows;" -->

</body>
</html>