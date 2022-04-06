/**
 * 
 */
package fr.eni.enchere.bll;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.dal.CategorieDAO;
import fr.eni.enchere.dal.DAOFact;
import fr.eni.enchere.dal.DALException;

/**
 * @author qdeboudt2022 31 mars 2022
 */
public class CategorieManagerImp implements CategorieManager {
	private CategorieDAO dao = DAOFact.getCategorieDAO();

	@Override
	public void addCategorie() throws BLLException {
		try {
			if (dao.selectAll().isEmpty()) {
				Categorie informatique = new Categorie("Informatique");
				Categorie ameublement = new Categorie("Ameublement");
				Categorie vêtement = new Categorie("Vêtement");
				Categorie sportEtLoisirs = new Categorie("Sport&Loisirs");

				dao.insert(informatique);
				dao.insert(ameublement);
				dao.insert(vêtement);
				dao.insert(sportEtLoisirs);
			}
		} catch (Exception e) {
 
		}

	}

	@Override
	public List<Categorie> getAllCategorie() throws BLLException {
		try {
			return dao.selectAll();
		} catch (Exception e) {
			throw new BLLException("Probleme a la selection des Categorie");
		}

	}

	@Override
	public Categorie getCategorieById(Integer noCategorie) throws BLLException {
		try {
			return dao.selectByNoCategorie(noCategorie);
		} catch (Exception e) {
			throw new BLLException("Probleme a la selection des Categorie");
		}

	}

}
