<<<<<<< HEAD
package fr.eni.enchere.ihm;

public class UtilisateurModel {

=======
/**
 * 
 */
package fr.eni.enchere.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Utilisateur;

/**
 * Classe en charge de
 * 
 * @author sforet2022
 * @date 1 avr. 2022
 * @version Eni-Encheres2- V0.1
 * @since 1 avr. 2022 - 12:17:56
 *
 */
public class UtilisateurModel {

	private Utilisateur current;
	private List<Utilisateur> lstUtilisateurs = new ArrayList<Utilisateur>();
	private String message;
	
	/**
	 * Constructeur.
	 */
	public UtilisateurModel() {
		super();
	}
	
	/**
	 * Constructeur.
	 * @param current
	 * @param lstUtilisateurs
	 * @param message
	 */
	public UtilisateurModel(Utilisateur current, List<Utilisateur> lstUtilisateurs, String message) {
		super();
		this.current = current;
		this.lstUtilisateurs = lstUtilisateurs;
		this.message = message;
	}

	public Utilisateur getCurrent() {
		return current;
	}

	public List<Utilisateur> getLstUtilisateurs() {
		return lstUtilisateurs;
	}

	public String getMessage() {
		return message;
	}

	public void setCurrent(Utilisateur current) {
		this.current = current;
	}

	public void setLstUtilisateurs(List<Utilisateur> lstUtilisateurs) {
		this.lstUtilisateurs = lstUtilisateurs;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtilisateurModel [");
		if (current != null) {
			builder.append("current=");
			builder.append(current);
			builder.append(", ");
		}
		if (lstUtilisateurs != null) {
			builder.append("lstUtilisateurs=");
			builder.append(lstUtilisateurs);
			builder.append(", ");
		}
		if (message != null) {
			builder.append("message=");
			builder.append(message);
		}
		builder.append("]");
		return builder.toString();
	}
>>>>>>> 86cbaae712eec1dbfd7227316a7beccbedd2e118
}
