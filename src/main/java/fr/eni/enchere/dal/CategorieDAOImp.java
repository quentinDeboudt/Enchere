/**
 * 
 */
package fr.eni.enchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.dal.util.ConnectionProvider;

/**
 * @author qdeboudt2022 30 mars 2022
 */
public class CategorieDAOImp implements CategorieDAO {
	private final String INSERT = "INSERT INTO CATEGORIES (no_categorie, libelle) VALUES (?,?)";
	private final String SELECT = "SELECT no_categorie, libelle FROM CATEGORIES";
	private final String SelectById = "SELECT no_categorie, libelle FROM CATEGORIES";

	public void insert(Categorie categorie) throws DalException {
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(INSERT);
			stmt.setInt(1, categorie.getNoCategorie());
			stmt.setString(2, categorie.getLibelle());
			stmt.executeUpdate();

		} catch (SQLException e) {
			throw new DalException("Probleme de Insert -> (CategorieDAOImpl)");
		}

	}

	public List<Categorie> selectAll() throws DalException {
		List<Categorie> result= new ArrayList<Categorie>();
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Categorie categorie = new Categorie();
				categorie.setNoCategorie(rs.getInt("no_categorie"));
				categorie.setLibelle(rs.getString("libelle"));
				
		
				result.add(categorie);
			}
		}catch (SQLException e) {
			throw new DalException("Probleme de select -> (CategorieDAOImpl)");
		}
		return result;
	}

	public Categorie selectByNoCategorie() throws DalException {
		Categorie categorie = null;
		try (Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SelectById);
			stmt.setInt(1, categorie.getNoCategorie());
			ResultSet rs = stmt.executeQuery();
			if (rs.next()){
				categorie = new Categorie(
						rs.getInt("no_categorie"),
						rs.getString("libelle")
						);
			}
		} catch (Exception e) {
			throw new DalException("Probleme dans le selectByNoCategorie -> (CategorieDAOImpl)");
		}
		return categorie;

	}

}
