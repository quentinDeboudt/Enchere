<<<<<<< HEAD
=======
/**
 * 
 */
>>>>>>> 9950017c635bc3cc63cdd8cdbc40c212ab3eced0
package fr.eni.enchere.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Utilisateur;

<<<<<<< HEAD
public class UtilisateurModel {
	private Utilisateur current;
	private List<Utilisateur> lstUtilisateur = new ArrayList<>();
	private String message;

	public UtilisateurModel() {

	}

	public UtilisateurModel(Utilisateur current, List<Utilisateur> lstUtilisateur, String message) {

		this.current = current;
		this.lstUtilisateur = lstUtilisateur;
		this.message = message;
	}

	
=======
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
>>>>>>> 9950017c635bc3cc63cdd8cdbc40c212ab3eced0

	public Utilisateur getCurrent() {
		return current;
	}

<<<<<<< HEAD
	public void setCurrent(Utilisateur current) {
		this.current = current;
	}

	public List<Utilisateur> getLstUtilisateur() {
		return lstUtilisateur;
	}

	public void setLstUtilisateur(List<Utilisateur> lstUtilisateur) {
		this.lstUtilisateur = lstUtilisateur;
	}

=======
>>>>>>> 9950017c635bc3cc63cdd8cdbc40c212ab3eced0
	public String getMessage() {
		return message;
	}

<<<<<<< HEAD
=======
	public List<Utilisateur> getLstUtilisateurs() {
		return lstUtilisateurs;
	}

	public void setCurrent(Utilisateur current) {
		this.current = current;
	}

>>>>>>> 9950017c635bc3cc63cdd8cdbc40c212ab3eced0
	public void setMessage(String message) {
		this.message = message;
	}

<<<<<<< HEAD
=======
	public void setLstUtilisateurs(List<Utilisateur> lstUtilisateurs) {
		this.lstUtilisateurs = lstUtilisateurs;
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

>>>>>>> 9950017c635bc3cc63cdd8cdbc40c212ab3eced0
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtilisateurModel [");
		if (current != null) {
			builder.append("current=");
			builder.append(current);
			builder.append(", ");
		}
<<<<<<< HEAD
		if (lstUtilisateur != null) {
			builder.append("lstUtilisateur=");
			builder.append(lstUtilisateur);
			builder.append(", ");
		}
		if (message != null) {
			builder.append("message=");
			builder.append(message);
=======
		if (message != null) {
			builder.append("message=");
			builder.append(message);
			builder.append(", ");
		}
		if (lstUtilisateurs != null) {
			builder.append("lstUtilisateurs=");
			builder.append(lstUtilisateurs);
>>>>>>> 9950017c635bc3cc63cdd8cdbc40c212ab3eced0
		}
		builder.append("]");
		return builder.toString();
	}

<<<<<<< HEAD
	

=======
>>>>>>> 9950017c635bc3cc63cdd8cdbc40c212ab3eced0
}
