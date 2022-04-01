package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.Utilisateur;

public class UtilisateurDAOTest {

	public static void main(String[] args) throws DALException {
		
		//tout ici est nouvelemnt rajouter
		
		//INSTANCIATION D'UN UtilisateurDAOMock()
				UtilisateurDAO dao=DAOFact.getUtilisateurDAO();
				
				
				//JEUX D'ESSAI A INSERER ET/OU SELECTIONNER
				Utilisateur utilisateur1=new Utilisateur(1,"DINO","MAHAMOUD","Inzoudine","inzoudine.mahamoud2022@campus-eni.fr","06.12.91.93.61","rue de fougères",35700,"RENNES","rennes35",1000,"admin");
				/*Utilisateur utilisateur2=new Utilisateur();
				Utilisateur utilisateur3=new Utilisateur();
				Utilisateur utilisateur4=new Utilisateur();
				Utilisateur utilisateur5=new Utilisateur();*/
				
				
				
				//TEST D'INSERTION
				dao.insert(utilisateur1);
				/*dao.insert(utilisateur2);
				dao.insert(utilisateur3);
				dao.insert(utilisateur4);
				dao.insert(utilisateur5);*/
				
				
				//TEST D'AFFICHAGE
				List<Utilisateur> listeUtilisateur=dao.selectAll();
				
				//1.affichage du contenue de la BddMock dao avec selectAll() de La class UtilisateurDAOMock
				System.out.println("1-------------------------------------------------------------------------------");
				System.out.println(listeUtilisateur);
				
				Utilisateur utilisateur=dao.selectById(1);
				
				//2.affichage de personne avec 1 comme noUtilisateur avec toString() de La class utilisateur
				System.out.println("2---------------------------------------------------------------------------------");
				System.out.println(utilisateur.toString());
				
				
				
			}

}
