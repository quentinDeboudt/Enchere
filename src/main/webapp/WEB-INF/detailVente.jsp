<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/Index.css" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<header> 
			<a id="Eni-Enchères" href="<%=request.getContextPath()%>/AccueilConnecterServlet" >Eni-Enchères</a>
		</header>
		
		<div style="display: flex; justify-content: Center;">
			<h2 style="">Detail Vente</h2> 	
		</div>
		
		<form action="detailVenteServlet" method="post" style="display: flex;" >
		
			<div style="padding: 60px; margin:20px; border: solid; max-height: 20px; max-width: 60px; Background-color ;">
				[Image]
			</div>
			
			<div>
				<p>${enchere.articlevendu.Article}</p> <br>
				
				Description: <p>${enchere.articlevendu.Description}</p> <br>
				
				Categorie Article: <p>${enchere.articlevendu.CategorieArticle}</p> <br>
				
				Meilleur Orffre: <p>${enchere.articlevendu.MeilleurOrffre}</p> <br>
				
				Mise à Prix:<p>${enchere.articlevendu.montant_enchere}</p> <br>
				
				Fin Enchere: <p>${enchere.articlevendu.dateEnchere}</p> <br>
				
				Retrait: <p>${enchere.articlevendu.Retrait}</p> <br>
				
				Vendeur :<p>${enchere.articlevendu.utilisateur}</p> <br>
				
				Proposition: <input type="number" name="Proposition" min="${enchere.articlevendu.MeilleurOrffre}" max="${utilisateur.getcredit}">
			
				<div>
					<input id="BT_MODIF" type="submit" name="BT_ENCHERIR" value="Eencherir" />
				</div>
			
			</div>
		
		</form>
		
	</body>
</html>