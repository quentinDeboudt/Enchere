package fr.eni.enchere2.dal;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere2.bo.Utilisateur2;


public class UtilisateurDAOMock2 implements UtilisateurDAO2{
	
	private static Integer cpt=0;
	private List<Utilisateur2> listeUtilisateur = new ArrayList<>();
	
	@Override
	public void insert(Utilisateur2 utilisateur) {
		utilisateur.setNoUtilisateur(cpt++);
		listeUtilisateur.add(utilisateur);
	}

	
	@Override
	public List<Utilisateur2> selectAll()throws DalException2 {
		if(this.listeUtilisateur.isEmpty()==false) {
			return listeUtilisateur;
		}else {
			throw new DalException2("Erreur de selectAll:la liste que vous esseyez d'affichez est vide!!!");
		}
	}

	
	
	@Override
	public Utilisateur2 selectById(Integer id)throws DalException2{
		
		if(this.listeUtilisateur.isEmpty()==false) {
			Utilisateur2 utilisateur =new Utilisateur2();
			for(Utilisateur2 i:listeUtilisateur) {
				if(i.getNoUtilisateur()==id) {
					utilisateur=i;
					break;
			}	
		}
		return utilisateur;
	}
		else {
			throw new DalException2("Erreur de selectById");
		}
	}
}
