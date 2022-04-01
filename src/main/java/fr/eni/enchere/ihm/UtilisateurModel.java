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
 * @since 1 avr. 2022 - 14:29:47
 *
 */
public class UtilisateurModel {

	private Utilisateur current;
	private String message;
	private List<Utilisateur> lstUtilisateurs = new ArrayList<Utilisateur>();

	/**
	 * Constructeur.
	 * 
	 * @param current
	 * @param message
	 * @param lstUtilisateurs
	 */
	public UtilisateurModel(Utilisateur current, String message, List<Utilisateur> lstUtilisateurs) {
		super();
		this.current = current;
		this.message = message;
		this.lstUtilisateurs = lstUtilisateurs;
	}

	/**
	 * Constructeur.
	 */
	public UtilisateurModel() {
		super();
	}

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtilisateurModel [");
		if (current != null) {
			builder.append("current=");
			builder.append(current);
			builder.append(", ");
		}
		if (message != null) {
			builder.append("message=");
			builder.append(message);
			builder.append(", ");
		}
		if (lstUtilisateurs != null) {
			builder.append("lstUtilisateurs=");
			builder.append(lstUtilisateurs);
		}
		builder.append("]");
		return builder.toString();
	}

}
