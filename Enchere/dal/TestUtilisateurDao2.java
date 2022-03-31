package fr.eni.enchere2.dal;

import java.util.List;

import fr.eni.enchere2.bo.Utilisateur2;

public class TestUtilisateurDao2 {

	public static void main(String[] args) throws DalException2 {
		
		//INSTANCIATION D'UN UtilisateurDAOMock()
		UtilisateurDAO2 dao=DAOFact2.getUtilisateurDAOMock();
		
		
		//JEUX D'ESSAI A INSERER ET/OU SELECTIONNER
		Utilisateur2 utilisateur1=new Utilisateur2();
		Utilisateur2 utilisateur2=new Utilisateur2();
		Utilisateur2 utilisateur3=new Utilisateur2();
		Utilisateur2 utilisateur4=new Utilisateur2();
		Utilisateur2 utilisateur5=new Utilisateur2();
		
		//TEST D'INSERTION
		dao.insert(utilisateur1);
		dao.insert(utilisateur2);
		dao.insert(utilisateur3);
		dao.insert(utilisateur4);
		dao.insert(utilisateur5);
		
		
		//TEST D'AFFICHAGE
		List<Utilisateur2> listeUtilisateur=dao.selectAll();
		Utilisateur2 utilisateur=dao.selectById(1);
		System.out.println(listeUtilisateur);
		System.out.println(utilisateur.toString());
		
		
		
	}

}
