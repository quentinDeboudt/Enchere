/**
 * 
 */
package fr.eni.enchere.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.util.ConnectionProvider;

/**
 * Classe en charge de
 * 
 * @author sforet2022
 * @date 29 mars 2022
 * @version ENI-Encheres- V0.1
 * @since 29 mars 2022 - 14:30:29
 * 
 */
public class ArticleVenduDAOImpl implements ArticleVenduDAO {

	private final String INSERT = "INSERT INTO articles_vendus (nom_article, description, date_debut_encheres, date_fin_encheres,"
			+ " prix_initial, prix_vente, no_utilisateur, no_categorie) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	private final String SELECT = "SELECT no_article, nom_article, description, date_debut_encheres,"
			+ " date_fin_encheres, prix_initial, prix_vente, a.no_utilisateur AS 'no_utilisateur', a.no_categorie AS 'no_categorie'"
			+ "FROM articles_vendus AS a " + "JOIN utilisateurs AS u ON a.no_utilisateur = u.no_utilisateur"
			+ "JOIN categories AS c ON a.no_categorie = c.no_categorie";

	private static final String SelectById = "SELECT SELECT no_article, nom_article, description, date_debut_encheres,"
			+ " date_fin_encheres, prix_initial, prix_vente, a.no_utilisateur AS 'no_utilisateur', a.no_categorie AS 'no_categorie'"
			+ "FROM articles_vendus AS a JOIN utilisateurs AS u ON a.no_utilisateur = u.no_utilisateur"
			+ "JOIN categories AS c ON a.no_categorie = c.no_categorie WHERE no_article = ?";

	/**
	 * {@inheritedDoc}
	 * 
	 * @throws DALException
	 */
	@Override
	public void insert(ArticleVendu articleVendu) throws DALException {
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, articleVendu.getNomArticle());
			stmt.setString(2, articleVendu.getDescription());
			stmt.setDate(3, Date.valueOf(articleVendu.getDateDebutEncheres()));
			stmt.setDate(4, Date.valueOf(articleVendu.getDateFinEncheres()));
			stmt.setInt(5, articleVendu.getMiseAPrix());
			stmt.setInt(6, articleVendu.getPrixVente());
			stmt.setInt(7, articleVendu.getUtilisateur().getNoUtilisateur());
			stmt.setInt(8, articleVendu.getCategorie().getNoCategorie());
			int nb = stmt.executeUpdate();
			if (nb > 0) {
				ResultSet rs = stmt.getGeneratedKeys();
				if (rs.next()) {
					articleVendu.setNoArticle(rs.getInt(1));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException("Probleme d'insert");
		}

	}

	/**
	 * {@inheritedDoc}
	 * 
	 * @throws DALException
	 */
	@Override
	public List<ArticleVendu> selectAll() throws DALException {
		UtilisateurDAO daoUtilisateur = DAOFact.getUtilisateurDAO();
		CategorieDAO daoCategorie = DAOFact.getCategorieDAO();
		List<ArticleVendu> result = new ArrayList<ArticleVendu>();

		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				ArticleVendu articleVendu = new ArticleVendu();
				articleVendu.setNoArticle(rs.getInt("no_article"));
				articleVendu.setNomArticle(rs.getString("nom_article"));
				articleVendu.setDescription(rs.getString("description"));
				articleVendu.setDateDebutEncheres(rs.getDate("date_debut_encheres").toLocalDate());
				articleVendu.setDateFinEncheres(rs.getDate("date_fin_encheres").toLocalDate());
				articleVendu.setMiseAPrix(rs.getInt("prix_initial"));
				articleVendu.setPrixVente(rs.getInt("prix_vente"));
				articleVendu.setUtilisateur(daoUtilisateur.selectById(rs.getInt("no_utilisateur")));
				articleVendu.setCategorie(daoCategorie.selectByNoCategorie(rs.getInt("no-categorie")));

				result.add(articleVendu);
			}
		} catch (Exception e) {
			throw new DALException("Problème de select");
		}
		return result;
	}

	public ArticleVendu selectById(Integer noArticle) throws DALException {

		UtilisateurDAO daoUtilisateur = DAOFact.getUtilisateurDAO();
		CategorieDAO daoCategorie = DAOFact.getCategorieDAO();
		ArticleVendu articleVendu = new ArticleVendu();
		
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SelectById);
			stmt.setInt(1, noArticle);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				articleVendu.setNoArticle(rs.getInt("no_article"));
				articleVendu.setNomArticle(rs.getString("nom_article"));
				articleVendu.setDescription(rs.getString("description"));
				articleVendu.setDateDebutEncheres(rs.getDate("date_debut_encheres").toLocalDate());
				articleVendu.setDateFinEncheres(rs.getDate("date_fin_encheres").toLocalDate());
				articleVendu.setMiseAPrix(rs.getInt("prix_initial"));
				articleVendu.setPrixVente(rs.getInt("prix_vente"));
				articleVendu.setUtilisateur(daoUtilisateur.selectById(rs.getInt("no_utilisateur")));
				articleVendu.setCategorie(daoCategorie.selectByNoCategorie(rs.getInt("no-categorie")));
			}	
			return articleVendu;
		} catch (Exception e) {
			throw new DALException("Probleme dans le selectById");
		}
	

	}
}
