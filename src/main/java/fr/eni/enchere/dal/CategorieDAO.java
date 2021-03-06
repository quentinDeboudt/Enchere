/**
 * 
 */
package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.Categorie;

/**
 * @author qdeboudt2022
 * 30 mars 2022
 */
public interface CategorieDAO {
	public void insert(Categorie categorie) throws Exception;
	public List<Categorie> selectAll() throws Exception;
	public Categorie selectByNoCategorie(Integer noCategorie) throws DALException;
}
