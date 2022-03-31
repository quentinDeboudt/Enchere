/**
 * 
 */
package fr.eni.enchere2.dal;

import java.util.List;

import fr.eni.enchere2.bo.ArticleVendu2;
import fr.eni.enchere2.bo.Retrait2;

/**
 * @author qdeboudt2022
 * 29 mars 2022
 */
public interface RetraitDAO2 {
	public void insert(Retrait2 retrait) throws Exception;
	public List<Retrait2> selectAll() throws Exception;
	
}
