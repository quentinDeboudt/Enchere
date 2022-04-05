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
		// Boolean isExistDeja = true;
		try {
			/*
			 * for (Utilisateur item : dao.selectAll()) {
			 * 
			 * // vérifier que le pseudo est unique if
			 * (!utilisateur.getPseudo().equals(item.getPseudo())
			 * 
			 * // vérifier que le pseudo ne contient que des caractères alphanumériques &&
			 * utilisateur.getPseudo().matches("\\p{Alnum}")
			 * 
			 * // vérifier que l'email est unique &&
			 * !utilisateur.getEmail().equals(item.getEmail())) {
			 * 
			 * isExistDeja = false;
			 * 
			 * } }
			 * 
			 * if (isExistDeja) {
			 */
			// initialisation du crédit à 100
			utilisateur.setCredit(100);

			// par défaut, l'utilisateur n'est pas administrateur
			utilisateur.setAdministrateur(false);

			// insertion d'un utilisateur
			dao.insert(utilisateur);
			// }

		} catch (DALException e) {
			throw new BLLException("erreur de addUtilisateur !!! : " + e.getMessage());
		}
	}

	@Override
	public List<Utilisateur> getAll() throws BLLException {
		try {
			return dao.selectAll();
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

	public void UpDate(Integer noUtilisateur) throws BLLException {

		try {
			dao.Update(noUtilisateur);
		} catch (DALException e) {
			throw new BLLException("erreur de Update (UtilisateurManagerImpl) :" + e.getMessage());
		}
	}

	/**
	 * {@inheritedDoc}
	 */
	@Override
	public Utilisateur getByPseudo(String pseudo) throws BLLException {
		try {
			return dao.selectByPseudo(pseudo);
		} catch (DALException e) {
			throw new BLLException("erreur dans la methode getByPseudo :" + e.getMessage());
		}
	}

}
