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
		dao.insert(new Categorie(1,"Informatique"));
		dao.insert(new Categorie(2,"Ameublement"));
		dao.insert(new Categorie(3,"Vetement"));
		dao.insert(new Categorie(4,"Sport&loisire"));
		
		dao.selectAll().forEach(System.out::println);
	}

}
