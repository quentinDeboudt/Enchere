package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.Retrait;
import fr.eni.enchere.dal.DAOFact;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.RetraitDAO;

public class RetraitManagerImpl implements RetraitManager {
	private RetraitDAO dao = DAOFact.getRetraitDAO();

	@Override
	public void addRetrait(Retrait retrait) throws BLLException {

		try {
			dao.insert(retrait);
		} catch (Exception e) {
			throw new BLLException("Probleme a l'insertion de bll Retrait");
		}

	}

	@Override
	public List<Retrait> getAllRetrait() throws BLLException {
		try {
			return dao.selectAll();
		} catch (Exception e) {
			throw new BLLException("Probl�me � la selection des bi�res");
		}
	}

}
