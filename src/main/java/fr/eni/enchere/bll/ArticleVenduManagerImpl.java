package fr.eni.enchere.bll;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.dal.ArticleVenduDAO;
import fr.eni.enchere.dal.DAOFact;
import fr.eni.enchere.dal.DALException;

public class ArticleVenduManagerImpl implements ArticleVenduManager {
	private ArticleVenduDAO dao = DAOFact.getArticleVenduDAO();
	private List<ArticleVendu> lstArticlesVendus = new ArrayList<ArticleVendu>();
	private ArticleVendu articleVendu = new ArticleVendu();

	/**
	 * {@inheritedDoc}
	 * @throws BLLException 
	 */
	@Override
	public void addArticleVendu(ArticleVendu articleVendu) throws BLLException {
		try {
			dao.insert(articleVendu);
		} catch (DALException e) {
			throw new BLLException(e.getMessage());
		}
	}

	/**
	 * {@inheritedDoc}
	 * @throws BLLException 
	 */
	@Override
	public List<ArticleVendu> getAllArticleVendu() throws BLLException {
		try {
			dao.selectAll();
		} catch (DALException e) {
			throw new BLLException(e.getMessage());
		}
		return lstArticlesVendus;
	}

	/**
	 * {@inheritedDoc}
	 * @throws BLLException 
	 */
	@Override
	public ArticleVendu getById(Integer noArticleVendu) throws BLLException {
		try {
			dao.selectById(noArticleVendu);
		} catch (Exception e) {
			throw new BLLException(e.getMessage());
			}
		return articleVendu;
	}

}
