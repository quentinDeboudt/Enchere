/**
 * 
 */
package fr.eni.enchere2.dal;

import fr.eni.enchere2.bo.ArticleVendu2;
import fr.eni.enchere2.bo.Retrait2;

/**
 * @author qdeboudt2022
 * 29 mars 2022
 */
public class RetraitDAOTest2 {
	private static RetraitDAO2 dao = DAOFact2.getRetraitDAO();

	public static void main(String[] args) throws Exception {
		dao.insert(new Retrait2("rue","code_postal","ville"));
		dao.insert(new Retrait2("blanche","Bouffay","Blanche"));
		dao.insert(new Retrait2("Blonde","Trompe Souris","Blonde"));
		
		dao.selectAll().forEach(System.out::println);
	}

}
