package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bo.Utilisateur;


public interface UtilisateurDAO {
	public void insert(Utilisateur utilisateur) throws DALException;
	public List<Utilisateur> selectAll() throws DALException;
	public Utilisateur selectById(Integer id) throws DALException;
	public void Update(final Integer No_utilisateur) throws DALException;
	public Utilisateur selectByPseudo (String Pseudo) throws DALException;
}
