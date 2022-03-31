/**
 * 
 */
package fr.eni.enchere.dal;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Enchere;

/**
 * Classe en charge de
 * @author sforet2022
 * @date 31 mars 2022
 * @version Eni-Encheres2- V0.1
 * @since  31 mars 2022 - 14:23:54
 *
 */
public class EnchereDAOMock implements EnchereDAO {

	private List <Enchere> lstEnchere = new ArrayList<Enchere>();
	private Enchere enchere;
	/**
	*{@inheritedDoc}
	*/
	@Override
	public void insert(Enchere enchere) throws DalException {
		lstEnchere.add(enchere);
	}

	/**
	*{@inheritedDoc}
	*/
	@Override
	public List<Enchere> selectAll() throws DalException {
		return lstEnchere;
	}
	
	

}
