package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dal.DALException;

public interface UtilisateurManager {
	public void addUtilisateur(Utilisateur utilisateur) throws BLLException;

	public List<Utilisateur> getAll() throws BLLException;

	public Utilisateur getById(Integer id) throws BLLException;
	
	public void SetUpDate(Integer noUtilisateur) throws BLLException;
	
	public Utilisateur getByPseudo (String pseudo) throws BLLException;

	public Boolean connexion(String identifiant, String moDePasse) throws BLLException;

	public void supprimeUtilisateur(String pseudo) throws DALException, BLLException;
}
