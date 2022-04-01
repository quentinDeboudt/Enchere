<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Modifier Mon Profil</title>
	</head>
	
	<body>
		<header> 
			<h1>ENI-Enchere</h1>
		</header>
		
		<div>
			<h2>Mon Profil</h2>
			
			<div>
				<form action="ModifierMonProfil" method="post">
					
					<div>
						Pseudo: <input type="text" name="pseudo" value="${model.current.pseudo}" /><br>
						
						Prénom: <input type="text" name="prenom" value="${model.current.prenom}" /><br>
						
						Teléphone: <input type="text" name="telephone" value="${model.current.telephone}" /><br>
						 
						Code postal: <input type="text" name="codePostal" value="${model.current.codePostal}" /><br>
						 
						Mot de passe actuel: <input type="password" name="motDePasse" value="${model.current.motDePasse}" /><br>
						
						Nouveau mot de passe: <input type="password" name="newMotDePasse" value="${model.current.newMotDePasse}" /><br>
					</div>
					
					<div>
						Nom: <input type="text" name="nom" value="${model.current.nom}" /><br>
						
						Email: <input type="text" name="email" value="${model.current.email}" /><br>
						
						Rue: <input type="text" name="rue" value="${model.current.rue}" /><br>
						
						ville: <input type="text" name="ville" value="${model.current.ville}" /><br>
						
						Confirmation: <input type="password" name="confirmation" value="${model.current.confirmation}" /><br>
					</div>
					
					<div>
						<p>Crédit: ${model.current.Credit}</p>
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