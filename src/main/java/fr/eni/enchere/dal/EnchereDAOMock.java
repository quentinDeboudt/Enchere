package fr.eni.enchere.dal;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Enchere;

public class EnchereDAOMock implements EnchereDAO {
	
	
	List<Enchere> listeEnchere=new ArrayList<Enchere>();
	
	
	@Override
	public void insert(Enchere enchere) {
		this.listeEnchere.add(enchere);
	}

	@Override
	public List<Enchere> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enchere selectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
