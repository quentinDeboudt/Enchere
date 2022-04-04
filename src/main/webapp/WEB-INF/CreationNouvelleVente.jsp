<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Nouvelle Vente</title>
	</head>
	
	<body>
		<header> 
				<a href="AccueilDeconnecter.jsp" style="text-decoration:none; color:black; font-size: 25px; ">Eni-Enchères</a>
		</header>
		
		<div action="CreationNouvelleVente" method="post" style="display:flex;">
		
			<div style="padding: 60px; margin:20px; border: solid; max-height: 20px; max-width: 60px">
				[image]
			</div>
			
			<div>
				<div title="information" >
				
					Article: <input type="text" name="Article" value="${model.current.Article}" /><br>
							
					Description: <input type="text" name="Description" value="${model.current.Description}" /><br>
			
				
					Categorie: 
					<select name="Categorie" >
						<c:forEach items="${Categorie.lstCategorieArticle}" var="Categorie">
							<option value="${CategorieArticle}"></option>
						</c:forEach>
					</select><br>
										
					Photo de larticle: <input type="text" name="PhotoDeLarticle" value="${model.current.PhotoDeLarticle}" /><br>
					 
					Mise à Prix:
					<select name="MiseAPrix" id="MiseAPrix">
						<option value="20">20<option>
					    <option value="30">30</option>
					    <option value="40">40</option>
					    <option value="50">50</option>
					    <option value="80">80</option>
					    <option value="90">90</option>
					    <option value="100">100</option>
					    <option value="125">125</option>
					    <option value="150">150</option>
					    <option value="200">200</option>
					</select><br> 

					Debut Enchere: <input type="date" name="DebutEnchere" value="${model.current.DebutEnchere}" /><br>
					
					Fin Enchere: <input type="date" name="FinEnchere" value="${model.current.FinEnchere}" /><br>
					
				</div>
				
				<div title="Retrait"  style="border: solid; margin-top:10px; padding: 5px;  ">
				
					Rue: <input type="text" name="Rue" value="${Retrait.getRue}" /><br>
					
					Code Postal: <input type="text" name="Code_Postal" value="${Retrait.GetCode_Postal}" /><br>
					
					Ville: <input type="text" name="Ville" value="${Retrait.getVille}" /><br>
									
				</div>
				<br>
				<div title="Bouton">
					<input type="submit" name="BT_ENREGISTRER" value="Enregistrer" />
					<input type="submit" name="BT_ANNULER" value="Annuler" />
				</div>
			
			</div>
		
		
		</div>
	
	
	</body>
</html>