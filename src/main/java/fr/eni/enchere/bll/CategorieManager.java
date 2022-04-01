/**
 * 
 */
package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.dal.DALException;

/**
 * @author qdeboudt2022
 * 31 mars 2022
 */
public interface CategorieManager {
	public void addCategorie(Categorie categorie) throws BLLException;
	public List<Categorie> getAllCategorie() throws BLLException;
	public Categorie getCategorieById(Integer noCategorie) throws BLLException;

}
