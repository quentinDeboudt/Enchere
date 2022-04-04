package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DAOFact;
import fr.eni.enchere.dal.DALException;
import fr.eni.enchere.dal.UtilisateurDAO;

public class UtilisateurManagerImpl implements UtilisateurManager {
	UtilisateurDAO dao = DAOFact.getUtilisateurDAO();

	@Override
	public void addUtilisateur(Utilisateur utilisateur) throws BLLException {
		try {
			dao.insert(utilisateur);
		} catch (DALException e) {
			throw new BLLException("erreur de addUtilisateur !!! : " + e.getMessage());
		}
	}

	@Override
	public List<Utilisateur> getAll() throws BLLException {
		try {
			dao.selectAll();
			return null;
		} catch (DALException e) {
			throw new BLLException("erreur de getAll !!! : " + e.getMessage());
		}
	}

	@Override
	public Utilisateur getById(Integer id) throws BLLException {

		try {
			return dao.selectById(id);
		} catch (DALException e) {

			throw new BLLException("erreur de getById !!! :" + e.getMessage());
		}
	}
	
	public void UpDate(Integer No_utilisateur) throws BLLException {

		try {
			dao.Update(No_utilisateur);
		} catch (DALException e) {
			throw new BLLException("erreur de Update (UtilisateurManagerImpl) :" + e.getMessage());
		}
	}

}
