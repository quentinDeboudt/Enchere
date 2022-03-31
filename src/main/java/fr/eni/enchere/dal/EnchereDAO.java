package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.Enchere;

public interface EnchereDAO {
	
	public void insert(Enchere enchere);
	public List<Enchere> selectAll();
	public Enchere selectById(Integer id);
	
}
