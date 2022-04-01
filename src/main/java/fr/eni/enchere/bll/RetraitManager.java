package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.Retrait;

public interface RetraitManager {
	public void addRetrait(Retrait retrait) throws BLLException;
	public List<Retrait> getAllRetrait() throws BLLException;

}
