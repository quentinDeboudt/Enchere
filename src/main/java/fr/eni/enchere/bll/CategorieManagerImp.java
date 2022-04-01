/**
 * 
 */
package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.dal.CategorieDAO;
import fr.eni.enchere.dal.DAOFact;
import fr.eni.enchere.dal.DalException;

/**
 * @author qdeboudt2022 31 mars 2022
 */
public class CategorieManagerImp implements CategorieManager {
	private CategorieDAO dao = DAOFact.getCategorieDAO();

	@Override
	public void addCategorie(Categorie categorie) throws BllException {

		try {
			dao.insert(categorie);
		} catch (Exception e) {
			throw new DalException("Probleme a l'insertion de bll Categorie");
		}
		
	}

	@Override
	public List<Categorie> getAllCategorie() throws BllException {
		try {
			return dao.selectAll();
		} catch (Exception e) {
			throw new DalException("Probleme a la selection des Categorie");
		}
		
	}

	@Override
	public Categorie getCategorieById(Integer noCategorie) throws BllException {
		try {
			return dao.selectByNoCategorie(noCategorie);
		} catch (Exception e) {
			throw new DalException("Probleme a la selection des Categorie");
		}
		
	}
	
}
