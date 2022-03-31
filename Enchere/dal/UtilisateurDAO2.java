package fr.eni.enchere2.dal;

import java.util.List;

import fr.eni.enchere2.bo.Utilisateur2;

public interface UtilisateurDAO2 {
	public void insert(Utilisateur2 utilisateur) throws DalException2;
	public List<Utilisateur2> selectAll() throws DalException2;
	public Utilisateur2 selectById(Integer id) throws DalException2;
}
