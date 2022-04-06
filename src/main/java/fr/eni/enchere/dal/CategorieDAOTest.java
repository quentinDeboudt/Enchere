/**
 * 
 */
package fr.eni.enchere.dal;

import fr.eni.enchere.bo.Categorie;

/**
 * @author qdeboudt2022
 * 30 mars 2022
 */
public class CategorieDAOTest {
	private static CategorieDAO dao = DAOFact.getCategorieDAO();
	
	public static void main(String[] args) throws Exception {
		dao.insert(new Categorie("Informatique"));
		dao.insert(new Categorie("Ameublement"));
		dao.insert(new Categorie("Vetement"));
		dao.insert(new Categorie("Sport&loisire"));
		
		dao.selectAll().forEach(System.out::println);
	}

}
