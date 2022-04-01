/**
 * 
 */
package fr.eni.enchere.bll;

/**
 * @author qdeboudt2022
 * 31 mars 2022
 */
public class CategorieManagerSing {
	private static CategorieManager instance;
	public static CategorieManager getInstance() {
		if(instance==null) {
			instance = new CategorieManagerImp();
		}
		return instance;
	}

}
