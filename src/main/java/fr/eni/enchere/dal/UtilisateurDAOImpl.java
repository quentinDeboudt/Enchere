package fr.eni.enchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.util.ConnectionProvider;



public class UtilisateurDAOImpl implements UtilisateurDAO{
	
	private final String SELECT = "noUtilisateur, pseudo, nom, prenom,email,telephone,rue,codePostal,ville,motDePasse,credit,administrateur, FROM UTILISATEURS";
	private final String INSERT = "INSERT INTO UTILISATEURS (pseudo, nom, prenom,email,telephone,rue,codePostal,ville,motDePasse,credit,administrateur,) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	private final String SELECT_BY_ID= "SELECT * FROM UTILISATEURS WHERE noUtilisateur = ?";
	private final String UPDATE = "UPDATE UTILISATEURS SET pseudo=?, nom=?, prenom=?, email=?, telephone=?, rue=?, codePostal=?, ville=?, motDePasse=? WHERE noUtilisateur=?";
	
	@Override
	public void insert(Utilisateur utilisateur) throws DALException {//comunication directe avec la bdd ou mock apres le controle bll dans addUtilisateur()
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, utilisateur.getPseudo());
			stmt.setString(2, utilisateur.getNom());
			stmt.setString(3, utilisateur.getPrenom());
			stmt.setString(4, utilisateur.getEmail());
			stmt.setString(5, utilisateur.getTelephone());
			stmt.setString(6, utilisateur.getRue());
			stmt.setString(7, utilisateur.getCodePostal());
			stmt.setString(8, utilisateur.getVille());
			stmt.setString(9, utilisateur.getMotDePasse());
			stmt.setInt(10, utilisateur.getCredit());
			stmt.setString(11, utilisateur.getAdministrateur());
			int nb = stmt.executeUpdate();
			if(nb>0) {
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					utilisateur.setNoUtilisateur(rs.getInt(1));
				}
			}
		}catch (SQLException e) {
			throw new DALException("Probl�me de Insert dans la DAL : "+e.getMessage());
		}
	}

	
	

	@Override
	public List<Utilisateur> selectAll() throws DALException {
		List<Utilisateur> result= new ArrayList<Utilisateur>();
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Utilisateur utilisateur = new Utilisateur(rs.getInt("noUtilisateur"),rs.getString("pseudo") ,rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getString("telephone"),rs.getString("rue"),rs.getString("codePostal"),rs.getString("ville"),rs.getString("motDePasse"),rs.getInt("credit"),rs.getString("administrateur"));
				utilisateur.setNoUtilisateur(rs.getInt("noUtilisateur"));
				result.add(utilisateur);
			}
		}catch (SQLException e) {
			throw new DALException("Probl�me de select Dand la DAL : "+e.getMessage());
		}
		return result;
	}




	@Override
	public Utilisateur selectById(Integer id) throws DALException{
		Utilisateur result= new Utilisateur();
		try(Connection con = ConnectionProvider.getConnection()){
			PreparedStatement stmt = con.prepareStatement(SELECT_BY_ID);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Utilisateur utilisateur = new Utilisateur(rs.getInt("noUtilisateur"),rs.getString("pseudo") ,rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getString("telephone"),rs.getString("rue"),rs.getString("codePostal"),rs.getString("ville"),rs.getString("motDePasse"),rs.getInt("credit"),rs.getString("administrateur"));
				utilisateur.setNoUtilisateur(rs.getInt("noUtilisateur"));
				result=utilisateur;
			}
			return result;
		}
		catch(SQLException e) {
			throw new DALException("erreur de selecById dans la DAL : "+e.getMessage());
		}
	}
	
	public void Update(Integer No_utilisateur) throws DALException{
		Utilisateur utilisateur = new Utilisateur();
		try(Connection con = ConnectionProvider.getConnection()){
			PreparedStatement stmt = con.prepareStatement(UPDATE);
			
			stmt.setString(1, utilisateur.getPseudo());
			stmt.setString(2, utilisateur.getNom());
			stmt.setString(3, utilisateur.getPrenom());
			stmt.setString(4, utilisateur.getEmail());
			stmt.setString(5, utilisateur.getTelephone());
			stmt.setString(6, utilisateur.getRue());
			stmt.setString(7, utilisateur.getCodePostal());
			stmt.setString(8, utilisateur.getVille());
			stmt.setString(9, utilisateur.getMotDePasse());
			stmt.executeUpdate();
		}
		catch(SQLException ex)
		{
			throw new DALException("Erreur dans la fonction update : " + ex.getMessage());
		}
	}

}