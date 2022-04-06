<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AccueilConnecter</title>
</head>
<body>
	<h1>ENI-Encheres</h1> <p style="text-align:right;"><a href="" >Enchères</a> <a href="CreationNouvelleVente.jsp" >Vendre un article</a> <a href="afficherMonProfil.jsp" >Mon profil</a> <a href="accueilNonConnecter.jsp" >Déconnexion</a></p>
	<h2 style="text-align:center;">Liste des enchères</h2>
	<form action="AccueilNonConnecterServlet" method="post"></form>
	<h2>Filtres :</h2>
	<input type="texte" name="noUtilisateur" value="${model.current.nom}" />
	<h2>Catégorie :</h2>
	<input type="submit" name="BT_Creation" value="Rechercher" />
	<br>
	<p><p><span style="border: 1px solid black;">PC Gamer pour travailler</p></span></p>
	
	
	<c:forEach items="${model.lstEnchere}" var="enchere">
		<p>${enchere.noEnchere}${enchere.dateEnchere}${enchere.montant_enchere}${enchere.utilisateur}${enchere.articleVendu}</p>
	</c:forEach>

</body>
</html>