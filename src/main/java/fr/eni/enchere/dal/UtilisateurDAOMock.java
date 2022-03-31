package fr.eni.enchere.dal;

import java.util.ArrayList;
import java.util.List;
import fr.eni.enchere.bo.Utilisateur;


public class UtilisateurDAOMock implements UtilisateurDAO{
	
	//private static Integer cpt=0;//cacher car le noUtilisateur est ajouter directement par le contructeur la class Utilisateur
	private List<Utilisateur> listeUtilisateur = new ArrayList<>();
	
	@Override
	public void insert(Utilisateur utilisateur) {
		//utilisateur.setNoUtilisateur(cpt++);//cacher car le noUtilisateur est ajouter directement par le contructeur la class Utilisateur
		listeUtilisateur.add(utilisateur);
	}

	
	@Override
	public List<Utilisateur> selectAll()throws DalException {
		if(this.listeUtilisateur.isEmpty()==false) {
			return listeUtilisateur;
		}else {
			throw new DalException("Erreur de selectAll:la liste que vous esseyez d'affichez est vide!!!");
		}
	}

	
	
	@Override
	public Utilisateur selectById(Integer id)throws DalException{
		
		if(this.listeUtilisateur.isEmpty()==false) {
			Utilisateur utilisateur =new Utilisateur();
			for(Utilisateur i:listeUtilisateur) {
				if(i.getNoUtilisateur()==id) {
					utilisateur=i;
					break;
			}	
		}
		return utilisateur;
	}
		else {
			throw new DalException("Erreur de selectById : la liste a parcourir pour avoir id est vide !!!");
		}
	}
}
