/**
 * 
 */
package fr.eni.enchere.dal;

import java.time.LocalDate;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Retrait;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Classe en charge de
 * 
 * @author sforet2022
 * @date 31 mars 2022
 * @version Eni-Encheres2- V0.1
 * @since 31 mars 2022 - 11:30:48
 *
 */
public class ArticleVenduDAOTest {

	private static ArticleVenduDAO dao = DAOFact.getArticleVenduDAO();

	public static void main(String[] args) throws DALException {
		dao.insert(new ArticleVendu("chaise", "magnifique chaise", LocalDate.of(2022, 1, 22),
				LocalDate.of(2022, 2, 22), 5, 40, "vendu",  new Utilisateur(1), new Categorie(1), new Retrait("rue", "ville", "codePostal")));
		//dao.insert(new ArticleVendu("écran", "magnifique écran", LocalDate.of(2021, 3, 22),
				//LocalDate.of(2021, 4, 22), 5, 40, new Utilisateur(2), new Categorie(1)));

		System.out.println(dao.selectAll());

		System.out.println(dao.selectById(2));

	}

}
