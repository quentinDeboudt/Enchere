<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<<<<<<< HEAD
    
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
=======
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/main.css" />
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	
	<title>AccueilConnecter</title>
	</head>
	
	<body>
		<h1>ENI-Encheres</h1> <p style="text-align:right;"><a href="" >Enchères</a> <a href="http://localhost:8080/Projet-ENI-Enchere/CreationNouvelleVente" >Vendre un article</a> <a href="http://localhost:8080/Projet-ENI-Enchere/AfficherMonProfilServlet" >Mon profil</a> <a href="http://localhost:8080/Projet-ENI-Enchere/AcceuilNonConnecter" >Déconnexion</a></p>
		<h2 style="text-align:center;">Liste des enchères</h2>
		<form action="AccueilNonConnecterServlet" method="post"></form>
		<h2>Filtres :</h2>
		<input type="text" name="noUtilisateur" value="${model.current.nom}" />
		<h2>Catégorie :</h2>
		<input type="submit" name="BT_Creation" value="Rechercher" />
		<br>
		<p><p><span style="border: 1px solid black;">PC Gamer pour travailler</p></span></p>
	
	</body>
>>>>>>> f29cb0d2b5be17e93d12abc130623b25332ebbaa
</html>