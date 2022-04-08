<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/Index.css" />
		<meta charset="UTF-8">
		<title>Modifier Mon Profil</title>
	</head>
	
	<body>
		<header> 
			<a id="Eni-Enchères" href="<%=request.getContextPath()%>/AccueilConnecterServlet" >Eni-Enchères</a>
		</header>
		
		<div>
			<h2>Mon Profil</h2>
			
				<form action="ModifierMonProfilServlet" method="post" >
				
					<div style="display:flex;">
					
							<div style="display:flex; flex-direction: column; max-width: 20%; margin: 5px;">
								Pseudo: <input type="text" name="Pseudo" value="${sessionScope.pseudo}" /><br>
								
								Prénom: <input type="text" name="prenom" value="${sessionScope.prenom}" /><br>
								
								Teléphone: <input type="text" name="telephone" value="${sessionScope.telephone}" /><br>
								 
								Code postal: <input type="text" name="codePostal" value="${sessionScope.codePostal}" /><br>
								 
								Mot de passe actuel: <input type="password" name="motDePasse" value="${sessionScope.motDePasse}" /><br>
								
								Nouveau mot de passe: <input type="password" name="newMotDePasse" value="${sessionScope.motDePasse}" /><br>
							</div>
							
							<div style="display:flex; flex-direction: column; max-width: 20%; margin: 5px;" >
								Nom: <input type="text" name="nom" value="${sessionScope.nom}" /><br>
								
								Email: <input type="text" name="email" value="${sessionScope.email}" /><br>
								
								Rue: <input type="text" name="rue" value="${sessionScope.rue}" /><br>
								
								ville: <input type="text" name="ville" value="${sessionScope.ville}" /><br>
								
								Confirmation: <input type="password" name="confirmation" value="${sessionScope.motDePasse}" /><br>
							</div>
					</div>
					
					<div>
						<p id="Texte-Credit">Crédit: ${sessionScope.credit}</p>
					</div>
					
					<div>
						<input id="BT_MODIF" type="submit" name="BT_ENREGISTRER" value="Inserer" />
						<input id="BT_MODIF" type="submit" name="BT_SUPRIMER" value="Suprimer mon compte" />
					</div>
					
				</form>
			
			</div>
		
	</body>
</html>