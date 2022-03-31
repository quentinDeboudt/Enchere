/**
 * 
 */
package fr.eni.enchere2.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import fr.eni.enchere2.bo.ArticleVendu2;
import fr.eni.enchere2.bo.Retrait2;
import fr.eni.enchere2.dal.util.ConnectionProvider;


/**
 * @author qdeboudt2022
 * 29 mars 2022
 */
public class RetraitDAOImp2 implements RetraitDAO2 {
	private final String SELECT = "SELECT no_article, rue, code_postal, ville FROM RETRAITS";
	private final String INSERT = "INSERT INTO RETRAITS (no_article,rue,code_postal,ville) VALUES (?,?,?,?)";
	private final String recupe = "SELECT no_article FROM ARTICLES_VENDUS"
			+ " join ARTICLES_VENDUS on RETRAITS.no_article = ARTICLES_VENDUS.no_article";
	
	
	public void insert(Retrait2 retrait) throws Exception {
		ArticleVendu2 articleVendu = new ArticleVendu2();
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(INSERT);
			stmt.setInt(1, articleVendu.getNoArticle());
			stmt.setString(2, retrait.getRue());
			stmt.setString(3, retrait.getCode_postal());
			stmt.setString(4, retrait.getVille());
			stmt.executeUpdate();
			
	
		}catch (SQLException e) {
			throw new Exception("Probleme de Insert -> (RetraitDAOImpl)");
		}
	}
	
	//commentaire de me***
	
	public void teste_a_suprimer() {
		
	}
	
	
	
	
	
	
	
	
	public List<Retrait2> selectAll() throws Exception {
		List<Retrait2> result= new ArrayList<Retrait2>();
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Retrait2 retrait = new Retrait2(rs.getString("rue") ,rs.getString("code_postal"),rs.getString("ville") );
				result.add(retrait);
			}
		}catch (SQLException e) {
			throw new Exception("Probleme de select -> (RetraitDAOImpl)");
		}
		return result;
	}





}
