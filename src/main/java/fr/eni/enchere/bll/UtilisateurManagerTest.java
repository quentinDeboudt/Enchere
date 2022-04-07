package fr.eni.enchere.bll;

import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DALException;

public class UtilisateurManagerTest {

	public static void main(String[] args) throws BLLException, DALException {
		UtilisateurManager manager = UtilisateurManagerSing.getInstance();
		/*Utilisateur utilisateur1 = new Utilisateur(1, "DINO", "MAHAMOUD", "Inzoudine",
				"inzoudine.mahamoud2022@campus-eni.fr", "06.12.91.93.61", "rue de fougères", "35700", "RENNES",
				"rennes35", 1000, "admin");*/
		/*try {
			managerUtilisateur.addUtilisateur(utilisateur1);
		} catch (BLLException e) {
			throw new BLLException(e.getMessage());
		}*/

		/*try {
			manager.getAll();
		} catch (BLLException e) {
			throw new BLLException(e.getMessage());
		}

		try {
			manager.getById(1);
		} catch (BLLException e) {
			throw new BLLException(e.getMessage());
		}*/
		manager.supprimeUtilisateur("Pseudo1");
	}

}
