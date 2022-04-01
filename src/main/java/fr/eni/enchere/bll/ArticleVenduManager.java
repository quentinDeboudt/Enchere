package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;

public interface ArticleVenduManager {

	public void addArticleVendu(ArticleVendu articleVendu) throws BLLException;

	public List<ArticleVendu> getAllArticleVendu() throws BLLException;

	public ArticleVendu getById(Integer noArticleVendu) throws BLLException;

}
