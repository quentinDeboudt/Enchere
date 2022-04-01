package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.Enchere;

public interface EnchereManager {

	public void addEnchere(Enchere enchere) throws BLLException;

	public List<Enchere> getAllEnchere() throws BLLException;

	
}
