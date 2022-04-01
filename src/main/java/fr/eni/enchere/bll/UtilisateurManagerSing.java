package fr.eni.enchere.bll;

public class UtilisateurManagerSing {

	public static UtilisateurManager getUtilisateurManager() {
		return new UtilisateurManagerImpl();
	}
}
