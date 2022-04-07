<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Accueil non connecter</title> 
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/Index.css" />
	</head>
	<body>
		<header >
			<div>
				<a id="Eni-Enchères" href="<%=request.getContextPath()%>/AccueilConnecterServlet" ">Eni-Enchères</a>
			</div>
			<div>
				<a id="lien-inscrire" href="<%=request.getContextPath()%>/ConnexionServlet" > S'inscrire-Se connecter </a>
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
			<select name="categorie" >
				<option>Toutes</option>
				<c:forEach items="${modelAV.lstCategories}" var="categorie">
					<option value="${categorie.noCategorie}">${categorie.libelle} </option>
				</c:forEach>
			</select><br>
			<input type="submit" name="BT_Rechercher" value="Rechercher" />
		</div>	
		
		<div>
			<c:forEach items="${model.lstEnchere}" var="enchere">
				<p>${enchere.noEnchere}</p>
				<p>${enchere.dateEnchere}</p>
				<p>${enchere.montant_enchere}</p>
				<p>${enchere.utilisateur}</p>
				<p>${enchere.articleVendu}</p>
			</c:forEach>
		</div>
	
	</body>
</html>