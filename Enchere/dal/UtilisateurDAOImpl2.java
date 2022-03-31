package fr.eni.enchere2.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere2.bo.Utilisateur2;
import fr.eni.enchere2.dal.util.ConnectionProvider;



public class UtilisateurDAOImpl2 implements UtilisateurDAO2{
	
	private final String SELECT = "noUtilisateur, pseudo, nom, prenom,email,telephone,rue,codePostal,ville,motDePasse,credit,administrateur, FROM UTILISATEURS";
	private final String INSERT = "INSERT INTO UTILISATEURS (noUtilisateur, pseudo, nom, prenom,email,telephone,rue,codePostal,ville,motDePasse,credit,administrateur,) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
	private final String SELECT_BY_ID= "SELECT * FROM UTILISATEURS WHERE noUtilisateur = ?";
	
	@Override
	public void insert(Utilisateur2 utilisateur) throws DalException2 {//comunication directe avec la bdd ou mock apres le controle bll dans addUtilisateur()
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, utilisateur.getNoUtilisateur());
			stmt.setString(2, utilisateur.getPseudo());
			stmt.setString(3, utilisateur.getNom());
			stmt.setString(4, utilisateur.getPrenom());
			stmt.setString(5, utilisateur.getEmail());
			stmt.setString(6, utilisateur.getTelephone());
			stmt.setString(7, utilisateur.getRue());
			stmt.setInt(8, utilisateur.getCodePostal());
			stmt.setString(9, utilisateur.getVille());
			stmt.setString(10, utilisateur.getMotDePasse());
			stmt.setInt(11, utilisateur.getCredit());
			stmt.setString(12, utilisateur.getAdministrateur());
			int nb = stmt.executeUpdate();
			if(nb>0) {
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					utilisateur.setNoUtilisateur(rs.getInt(1));
				}
			}
		}catch (SQLException e) {
			throw new DalException2("Probl�me de Insert");
		}
	}

	
	

	@Override
	public List<Utilisateur2> selectAll() throws DalException2 {
		List<Utilisateur2> result= new ArrayList<Utilisateur2>();
		try(Connection con = ConnectionProvider.getConnection()) {
			PreparedStatement stmt = con.prepareStatement(SELECT);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Utilisateur2 utilisateur = new Utilisateur2(rs.getInt("noUtilisateur"),rs.getString("pseudo") ,rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getString("telephone"),rs.getString("rue"),rs.getInt("codePostal"),rs.getString("ville"),rs.getString("motDePasse"),rs.getInt("credit"),rs.getString("administrateur"));
				utilisateur.setNoUtilisateur(rs.getInt("noUtilisateur"));
				result.add(utilisateur);
			}
		}catch (SQLException e) {
			throw new DalException2("Probl�me de select");
		}
		return result;
	}




	@Override
	public Utilisateur2 selectById(Integer id) throws DalException2{
		Utilisateur2 result= new Utilisateur2();
		try(Connection con = ConnectionProvider.getConnection()){
			PreparedStatement stmt = con.prepareStatement(SELECT_BY_ID);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Utilisateur2 utilisateur = new Utilisateur2(rs.getInt("noUtilisateur"),rs.getString("pseudo") ,rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getString("telephone"),rs.getString("rue"),rs.getInt("codePostal"),rs.getString("ville"),rs.getString("motDePasse"),rs.getInt("credit"),rs.getString("administrateur"));
				utilisateur.setNoUtilisateur(rs.getInt("noUtilisateur"));
				result=utilisateur;
			}
			return result;
		}
		catch(Exception e) {
			throw new DalException2(e.getMessage());
		}
	}
}