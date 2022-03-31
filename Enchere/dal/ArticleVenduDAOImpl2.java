/**
 * 
 */
package fr.eni.enchere2.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere2.bo.ArticleVendu2;
import fr.eni.enchere2.bo.Categorie2;
import fr.eni.enchere2.bo.Utilisateur2;
import fr.eni.enchere2.dal.util.ConnectionProvider;

/**
 * Classe en charge de
 * 
 * @author sforet2022
 * @date 29 mars 2022
 * @version ENI-Encheres- V0.1
 * @since 29 mars 2022 - 14:30:29
 *
 */
public class ArticleVenduDAOImpl2 implements ArticleVenduDAO2 {

	private final String INSERT = "INSERT INTO articles_vendus (nom_article, description,"
			+ " date_debut_encheres, date_fin_encheres, prix_initial, prix_vente, no_utilisateur,"
			+ " no_categorie) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	private final String SELECT = "SELECT no_article, nom_article, description, date_debut_encheres,"
			+ " date_fin_encheres, prix_initial, prix_vente, a.no_utilisateur AS 'no_utilisateur', a.no_categorie AS 'no_categorie'"
			+ "FROM articles_vendus AS a " + "JOIN utilisateurs AS u ON a.no_utilisateur = u.no_utilisateur"
			+ "JOIN categories AS c ON a.no_categorie = c.no_categorie";
	private static final String SelectById = "SELECT";

	/**
	 * {@inheritedDoc}
	 * 
	 * @throws DALException
	 */
	@Override
	public void insert(ArticleVendu2 articleVendu) throws DalException2 {
		Utilisateur2 utilisateur = new Utilisateur2();
		Categorie2 categorie = new Categorie2();
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, articleVendu.getNomArticle());
			stmt.setString(2, articleVendu.getDescription());
			stmt.setDate(3, Date.valueOf(articleVendu.getDateDebutEncheres()));
			stmt.setDate(4, Date.valueOf(articleVendu.getDateFinEncheres()));
			stmt.setInt(5, articleVendu.getMiseAPrix());
			stmt.setInt(6, articleVendu.getPrixVente());
			stmt.setInt(7, utilisateur.getNoUtilisateur());
			stmt.setInt(8, categorie.getNoCategorie());
			int nb = stmt.executeUpdate();
			if (nb > 0) {
				ResultSet rs = stmt.getGeneratedKeys();
				if (rs.next()) {
					articleVendu.setNoArticle(rs.getInt(1));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DalException2("Problème d'insert");
		}

	}

	/**
	 * {@inheritedDoc}
	 * 
	 * @throws DALException
	 */
	@Override
	public List<ArticleVendu2> selectAll() throws DalException2 {
		List<ArticleVendu2> result = new ArrayList<ArticleVendu2>();
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				ArticleVendu2 articleVendu = new ArticleVendu2();
				rs.getInt("no_article");
				rs.getString("nom_article");
				rs.getString("description");
				rs.getDate("date_debut_encheres").toLocalDate();
				rs.getDate("date_fin_encheres").toLocalDate();
				rs.getInt("prix_initial");
				rs.getInt("prix_vente");
				result.add(articleVendu);
			}
		} catch (SQLException e) {
			throw new DalException2("Problème de select");
		}
		return result;
	}

	public ArticleVendu2 selectById (int id) throws DalException2 {
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		ArticleVendu2 articleVendu = null;
		return articleVendu;
		
	}
}
