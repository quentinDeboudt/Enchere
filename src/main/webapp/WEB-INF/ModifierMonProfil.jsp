<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Modifier Mon Profil</title>
		<link type="text/css" rel="stylesheet" href="WEB-INF/ModifierMonProfil.CSS" />
	</head>
	
	<body>
		<header> 
			<a href="http://localhost:8080/Projet-ENI-Enchere/AccueilConnecterServlet" style="text-decoration:none; color:black; font-size: 25px; ">Eni-Enchères</a>
		</header>
		
		<div>
			<h2>Mon Profil</h2>
			
				<form action="ModifierMonProfilServlet" method="post" >
				
					<div style="display:flex;">
					
							<div style="display:flex; flex-direction: column; max-width: 20%; margin: 5px;">
								Pseudo: <input type="text" name="Pseudo" placeholder="${sessionScope.pseudo}" value="${model.current.pseudo}" /><br>
								
								Prénom: <input type="text" name="prenom" placeholder="${sessionScope.prenom}" value="${model.current.prenom}" /><br>
								
								Teléphone: <input type="text" name="telephone" placeholder="${sessionScope.telephone}" value="${model.current.telephone}" /><br>
								 
								Code postal: <input type="text" name="codePostal" placeholder="${sessionScope.codePostal}" value="${model.current.codePostal}" /><br>
								 
								Mot de passe actuel: <input type="password" name="motDePasse" placeholder="${sessionScope.motDePasse}" value="${model.current.motDePasse}" /><br>
								
								Nouveau mot de passe: <input type="password" name="newMotDePasse" placeholder="${sessionScope.motDePasse}" value="${model.current.motDePasse}" /><br>
							</div>
							
							<div style="display:flex; flex-direction: column; max-width: 20%; margin: 5px;" >
								Nom: <input type="text" name="nom" placeholder="${sessionScope.nom}" value="${model.current.nom}" /><br>
								
								Email: <input type="text" name="email" placeholder="${sessionScope.email}" value="${model.current.email}" /><br>
								
								Rue: <input type="text" name="rue" placeholder="${sessionScope.rue}" value="${model.current.rue}" /><br>
								
								ville: <input type="text" name="ville" placeholder="${sessionScope.ville}" value="${model.current.ville}" /><br>
								
								Confirmation: <input type="password" name="confirmation" placeholder="${sessionScope.motDePasse}" value="${model.current.motDePasse}" /><br>
							</div>
					</div>
					
					<div>
						<p>Crédit: ${Credit}</p> <!-- chercher credit autre part (créer un fonction) -->

					</div>
					
					<div>
						<input type="submit" name="BT_ENREGISTRER" value="Inserer" />
						<input type="submit" name="BT_SUPRIMER" value="Suprimer mon compte" />
					</div>
					
				</form>
			
			</div>
		
		</div>
		
	</body>
</html>