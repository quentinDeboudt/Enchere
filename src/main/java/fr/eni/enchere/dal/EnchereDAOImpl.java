/**
 * 
 */
package fr.eni.enchere.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Enchere;
import fr.eni.enchere.dal.util.ConnectionProvider;

/**
 * Classe en charge de
 * @author sforet2022
 * @date 31 mars 2022
 * @version Eni-Encheres2- V0.1
 * @since  31 mars 2022 - 14:26:43
 *
 */
public class EnchereDAOImpl implements EnchereDAO {

	private final String INSERT = "INSERT INTO encheres (no_enchere, date_enchere,"
			+ " montant_enchere, no_article, no_utilisateur) VALUES (?, ?, ?, ?, ?)";
	
	private final String SELECT = "SELECT no_enchere, date_enchere, montant_enchere,"
			+ "e.no_article AS 'no_article', e.no_utilisateur AS 'no_utilisateur"
			+ "FROM encheres AS e"
			+ "JOIN articles AS a ON e.no_article = a.no_article"
			+ "JOIN utilisateurs AS u ON e.no_utilisateur = u.no_utilisateur";
	
	/**
	*{@inheritedDoc}
	*/
	@Override
	public void insert(Enchere enchere) throws DALException {
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			stmt.setDate(1, Date.valueOf(enchere.getDateEnchere()));
			stmt.setInt(2, enchere.getMontant_enchere());
			stmt.setInt(3, enchere.getArticleVendu().getNoArticle());
			stmt.setInt(4, enchere.getUtilisateur().getNoUtilisateur());
			int nb = stmt.executeUpdate();
			if (nb > 0) {
				ResultSet rs = stmt.getGeneratedKeys();
				if (rs.next()) {
					enchere.setNoEnchere(rs.getInt(1));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DALException("Probleme d'insert");		}
	}

	/**
	*{@inheritedDoc}
	*/
	@Override
	public List<Enchere> selectAll() throws DALException {
		List<Enchere> result = new ArrayList<Enchere>();
		UtilisateurDAO daoUtilisateur = DAOFact.getUtilisateurDAO();
		ArticleVenduDAO daoArticleVendu = DAOFact.getArticleVenduDAO();
		
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Enchere enchere = new Enchere();
				enchere.setNoEnchere(rs.getInt("no_enchere"));
				enchere.setDateEnchere(rs.getDate("date_enchere").toLocalDate());
				enchere.setMontant_enchere(rs.getInt("montant_enchere"));
				enchere.setArticleVendu(daoArticleVendu.selectById(rs.getInt("no_article")));
				enchere.setUtilisateur(daoUtilisateur.selectById(rs.getInt("no_utilisateur")));
				
				result.add(enchere);
			}
			} catch (Exception e) {
				throw new DALException("Problème de select");
			}
			return result;
	}

}
	
