/**
 * 
 */
package fr.eni.enchere.dal;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Retrait;

/**
 * @author qdeboudt2022
 * 30 mars 2022
 */
public class CategorieDAOMock implements CategorieDAO {
	
	private List<Categorie> lstCategorie = new ArrayList<>();
	private Categorie categorie;
	
	public void insert(Categorie categorie) throws Exception {
		lstCategorie.add(categorie);
	}

	public List<Categorie> selectAll() throws Exception {
		return lstCategorie;
	}

	
	public Categorie selectByNoCategorie(Integer noCategorie) throws DALException {
		return categorie;
	}

	

}
