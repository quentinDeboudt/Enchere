package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.Utilisateur;

public interface UtilisateurManager {
	public void addUtilisateur(Utilisateur utilisateur) throws BLLException;

	public List<Utilisateur> getAll() throws BLLException;

	public Utilisateur getById(Integer id) throws BLLException;
}
