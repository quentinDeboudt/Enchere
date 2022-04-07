<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/main.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/Index.css" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	
		<title>Nouvelle Vente</title>
	</head>
	
	<body>
		<header> 
				<a id="Eni-Enchères" href="<%=request.getContextPath()%>/AccueilConnecterServlet" >Eni-Enchères</a>
		</header>
		
		<div action="CreationNouvelleVenteServlet" method="post" style="display:flex;">
		
			<div style="padding: 60px; margin:20px; border: solid; max-height: 20px; max-width: 60px">
				[image]
			</div>
			
			<div>
				<div title="information" >
				
					Article: <input type="text" name="Article" value="${model.current.Article}" /><br>
							
					Description: <input type="text" name="Description" value="${model.current.Description}" /><br>
			
				
					Categorie: 
					<select name="categorie" >
						<c:forEach items="${model.lstCategories}" var="categorie">
							<option value="${categorie.noCategorie}">${categorie.libelle} </option>
						</c:forEach>
					</select><br>
				
					Photo de larticle: <input type="image" name="PhotoDeLarticle" value="${model.current.PhotoDeLarticle}" /><br>
					 
					Mise à Prix:
					<input type="number"  name="MiseAPrix:" min="10" max="100"><br>

					Debut Enchere: <input type="date" name="DebutEnchere" value="${model.current.DebutEnchere}" /><br>
					
					Fin Enchere: <input type="date" name="FinEnchere" value="${model.current.FinEnchere}" /><br>
					
				</div>
				
				<div title="Retrait"  style="border: solid; margin-top:10px; padding: 5px;  ">
				
					Rue: <input for="rue" type="text" name="Rue" value="${Retrait.getRue}" placeholder="${sessionScope.rue}"  /><br>
					
					Code Postal: <input type="text" name="Code_Postal" value="${Retrait.GetCode_Postal}" placeholder="${sessionScope.codePostal}" /><br>
					
					Ville: <input type="text" name="Ville" value="${Retrait.getVille}" placeholder="${sessionScope.ville}" /><br>
									
				</div>
				<br>
				<div title="Bouton">
					<input id="BT_MODIF" type="submit" name="BT_ENREGISTRER" value="Enregistrer" />
					<input id="BT_MODIF" type="delete" name="BT_ANNULER" value="Annuler" />
				</div>
			
			</div>
		
		
		</div>
	
	
	</body>
</html>