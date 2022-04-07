<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil non connecter</title> 
</head>
<body>
	<header >
		<h1 href="AccueilDeconnecter.jsp" style="text-decoration:none; color:black; font-size: 25px; ">Eni-Enchères</h1> 
		<a href="http://localhost:8080/Projet-ENI-Enchere/ConnexionServlet" > S'inscrire-Se connecter </a>
	</header>
	<h2 style="text-align:center;">Liste des enchères</h2>
	<form action="AccueilNonConnecterServlet" method="post"></form>
	<h2>Filtres :</h2>
	<input type="text" name="noEnchere" id="noEnchere" />
	<h2>Catégorie : </h2>
		<select name="categorie" >
			<option>Toutes</option>
			<c:forEach items="${modelAV.lstCategories}" var="categorie">
				<option value="${categorie.noCategorie}">${categorie.libelle} </option>
			</c:forEach>
		</select><br>
	<input type="submit" name="BT_Rechercher" value="Rechercher" />
	<br>
	<p><p><span style="border: 1px solid black;">PC Gamer pour travailler</p></span></p>
	
	
	<c:forEach items="${listeEnchere}" var="enchere">
		<p>${enchere.noEnchere}${enchere.dateEnchere}${enchere.montant_enchere}${enchere.utilisateur}${enchere.articleVendu}</p>
	</c:forEach>
	
	<!-- style="display:flex; flex-direction: rows;" -->

</body>
</html>