package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.Retrait;
import fr.eni.enchere.dal.DAOFact;
import fr.eni.enchere.dal.DalException;
import fr.eni.enchere.dal.RetraitDAO;

public class RetraitManagerImpl implements RetraitManager {
	private RetraitDAO dao = DAOFact.getRetraitDAO();

	@Override
	public void addRetrait(Retrait retrait) throws BllException {

		try {
			dao.insert(retrait);
		} catch (Exception e) {
			throw new BllException("Probleme a l'insertion de bll Retrait");
		}

	}

	@Override
	public List<Retrait> getAllRetrait() throws BllException {
		try {
			return dao.selectAll();
		} catch (Exception e) {
			throw new BllException("Probl�me � la selection des bi�res");
		}
	}

}
