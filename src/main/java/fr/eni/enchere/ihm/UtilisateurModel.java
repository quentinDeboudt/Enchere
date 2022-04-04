
package fr.eni.enchere.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Utilisateur;


public class UtilisateurModel {

	private Utilisateur current;
	private String message;
	private List<Utilisateur> lstUtilisateur = new ArrayList<Utilisateur>();

	/**
	 * Constructeur.
	 * 
	 * @param current
	 * @param message
	 * @param lstUtilisateurs
	 */
	public UtilisateurModel(Utilisateur current, String message, List<Utilisateur> lstUtilisateurs) {
		this.current = current;
		this.message = message;
		this.lstUtilisateur = lstUtilisateurs;
	}

	/**
	 * Constructeur.
	 */
	public UtilisateurModel() {
	}

	public Utilisateur getCurrent() {
		return current;
	}
	
	public void setCurrent(Utilisateur current) {
		this.current = current;
	}

	public List<Utilisateur> getLstUtilisateur() {
		return lstUtilisateur;
	}
	
	public void setLstUtilisateurs(List<Utilisateur> lstUtilisateurs) {
		this.lstUtilisateur = lstUtilisateur;
	}
	
	public String getMessage() {
		return message;
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
		if (message != null) {
			builder.append("message=");
			builder.append(message);
			builder.append(", ");
		}
		if (lstUtilisateur != null) {
			builder.append("lstUtilisateur=");
			builder.append(lstUtilisateur);
		}
		builder.append("]");
		return builder.toString();
	}
	


}
