package fr.eni.enchere2.dal;

/**
 * @author qdeboudt2022
 * 29 mars 2022
 */
public class DAOFact2 {

	public static UtilisateurDAO2 getUtilisateurDAO() {
		return new UtilisateurDAOImpl2();
	}
	
	public static UtilisateurDAO2 getUtilisateurDAOMock() {
		return new UtilisateurDAOMock2();
	}
	
	
	public static ArticleVenduDAO2 getArticleVenduDAO() {
		return new ArticleVenduDAOImpl2();
	}
	
	public static RetraitDAO2 getRetraitDAO() {
		return new RetraitDAOImp2();
	}
	

}

