/**
 * 
 */
package fr.eni.enchere2.dal;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere2.bo.ArticleVendu2;
import fr.eni.enchere2.bo.Retrait2;

/**
 * @author qdeboudt2022
 * 29 mars 2022
 */
public class RetraitDAOMock2 implements RetraitDAO2 {
	private List<Retrait2> lstRetrait = new ArrayList<>();
	
	
	@Override
	public void insert(Retrait2 retrait) throws Exception {
		lstRetrait.add(retrait);
	}

	@Override
	public List<Retrait2> selectAll() throws Exception {
		return lstRetrait;
	}

	

	
}
