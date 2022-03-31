/**
 * 
 */
package fr.eni.enchere.dal;

import java.util.List;

import fr.eni.enchere.bo.Enchere;

/**
 * Classe en charge de
 * @author sforet2022
 * @date 31 mars 2022
 * @version Eni-Encheres2- V0.1
 * @since  31 mars 2022 - 14:16:09
 *
 */
public interface EnchereDAO {
	
	public void insert (Enchere enchere) throws DalException;
	public List<Enchere> selectAll() throws DalException;

}
