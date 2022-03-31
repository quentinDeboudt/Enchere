/**
 * 
 */
package fr.eni.enchere2.dal;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere2.bo.ArticleVendu2;

/**
 * Classe en charge de
 * @author sforet2022
 * @date 29 mars 2022
 * @version ENI-Encheres- V0.1
 * @since  29 mars 2022 - 12:01:45
 *
 */
public class ArticleVenduDAOMock2 implements ArticleVenduDAO2 {

	private List<ArticleVendu2> lstArticleVendu = new ArrayList<ArticleVendu2>();	
	/**
	*{@inheritedDoc}
	*/
	@Override
	public void insert(ArticleVendu2 articleVendu) {
		lstArticleVendu.add(articleVendu);
	}

	/**
	*{@inheritedDoc}
	*/
	@Override
	public List<ArticleVendu2> selectAll() {
		return lstArticleVendu;
	}

	@Override
	public ArticleVendu2 selectById(int id) throws DalException2 {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
