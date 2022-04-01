package fr.eni.enchere.bll;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Enchere;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.DAOFact;
import fr.eni.enchere.dal.EnchereDAO;

public class EnchereManagerImpl implements EnchereManager {

	private EnchereDAO dao = DAOFact.getEnchereDAO();
	private List<Enchere> lstEncheres = new ArrayList<Enchere>();

	/**
	 * {@inheritedDoc}
	 */
	@Override
	public void addEnchere(Enchere enchere) throws BLLException {
		try {
			dao.insert(enchere);
		} catch (DALException e) {
			throw new BLLException(e.getMessage());
		}
	}

	/**
	 * {@inheritedDoc}
	 */
	@Override
	public List<Enchere> getAllEnchere() throws BLLException {
		try {
			dao.selectAll();
		} catch (DALException e) {
			throw new BLLException(e.getMessage());
		}
		return lstEncheres;
	}

}
