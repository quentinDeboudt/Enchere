/**
 * 
 */
package fr.eni.enchere2.dal;

import java.util.List;

import fr.eni.enchere2.bo.ArticleVendu2;

/**
 * Classe en charge de
 * @author sforet2022
 * @date 29 mars 2022
 * @version ENI-Encheres- V0.1
 * @since  29 mars 2022 - 11:53:23
 *
 */
public interface ArticleVenduDAO2 {
	
	public void insert (ArticleVendu2 articleVendu) throws DalException2;
	public List<ArticleVendu2> selectAll() throws DalException2;
	public ArticleVendu2 selectById (int id) throws DalException2;

}
