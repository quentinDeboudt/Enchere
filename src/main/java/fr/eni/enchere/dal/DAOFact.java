package fr.eni.enchere.dal;


/**
 * @author qdeboudt2022
 * 29 mars 2022
 */
public class DAOFact {
	
	public static RetraitDAO getRetraitDAO() {
		return new RetraitDAOImp();
	}
	
	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOImpl();
	}
	
	//nouvelement ajouter
	public static UtilisateurDAO getUtilisateurDAOMock() {
		return new UtilisateurDAOMock();
	}
	
	public static ArticleVenduDAO getArticleVenduDAO() {
		return new ArticleVenduDAOImpl();
	}
	
	
	public static CategorieDAO getCategorieDAO() {
		return new CategorieDAOImp();
	}
}

