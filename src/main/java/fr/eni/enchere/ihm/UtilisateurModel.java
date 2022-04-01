/**
 * 
 */
package fr.eni.enchere.ihm;

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
	private String message;

	/**
	 * Constructeur.
	 * 
	 * @param current
	 * @param message
	 */
	public UtilisateurModel(Utilisateur current, String message) {
		super();
		this.current = current;
		this.message = message;
	}

	/**
	 * Constructeur.
	 */
	public UtilisateurModel() {
		super();
	}

	public Utilisateur getCurrent() {
		return current;
	}

	public String getMessage() {
		return message;
	}

	public void setCurrent(Utilisateur current) {
		this.current = current;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtilisateurModel []");
		return builder.toString();
	}

}
