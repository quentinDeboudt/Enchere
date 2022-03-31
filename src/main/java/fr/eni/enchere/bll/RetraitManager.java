package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.Retrait;

public interface RetraitManager {
	public void insert(Retrait retrait) throws Exception;
	public List<Retrait> selectAll() throws Exception;

}
