/**
 * 
 */
package fr.eni.enchere.dal;

import java.time.LocalDate;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Classe en charge de
 * @author sforet2022
 * @date 31 mars 2022
 * @version Eni-Encheres2- V0.1
 * @since  31 mars 2022 - 11:30:48
 *
 */
public class ArticleVenduDAOTest {
	
	private static ArticleVenduDAO dao = DAOFact.getArticleVenduDAO();
	
	public static void main(String[] args) throws DalException  {
			dao.insert(new ArticleVendu(1, "chaise", "magnifique chaise", LocalDate.of(2022, 1, 22), LocalDate.of(2022, 2, 22), 5, 40, new Utilisateur(5, "pseudo", "nom", "prenom", "email", "telephone",
					"rue", 35000, "ville", "motDePasse", 50, "administrateur"), new Categorie(5, "Informatique")) );
			dao.insert(new ArticleVendu(2, "écran", "magnifique écran", LocalDate.of(2021, 3, 22), LocalDate.of(2021, 4, 22), 5, 40, new Utilisateur(5, "pseudo", "nom", "prenom", "email", "telephone",
					"rue", 35000, "ville", "motDePasse", 50, "administrateur"), new Categorie(5, "Informatique")));
		
			dao.selectAll();
			
			System.out.println(dao.selectAll());
			
			dao.selectById(5);
			
			System.out.println(dao.selectById(5));
		
	}

}
