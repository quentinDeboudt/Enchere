/**
 * 
 */
package fr.eni.enchere.bll;

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
 * @since 31 mars 2022 - 16:25:14
 *
 */
public class ArticleVenduManagerTest {

	private static ArticleVenduManager manager = ArticleVenduManagerSing.getInstance();

	/**
	 * Méthode en charge de
	 * 
	 * @param args
	 * @throws BLLException 
	 */
	public static void main(String[] args) throws BLLException {

			manager.addArticleVendu(new ArticleVendu("chaise", "magnifique chaise", LocalDate.of(2022, 1, 22),
					LocalDate.of(2022, 2, 22), 5, 40, "vendu",  new Utilisateur(1), new Categorie(1), new Retrait("rue", "ville", "codePostal")));
		
			/*manager.addArticleVendu(new ArticleVendu("chaise", "magnifique chaise", LocalDate.of(2022, 1, 22),
					LocalDate.of(2022, 2, 22), 5, 40, "vendu",  new Utilisateur(1), new Categorie(1), new Retrait("rue", "ville", "codePostal")));*/

		
			System.out.println(manager.getAllArticleVendu());
	}

}
