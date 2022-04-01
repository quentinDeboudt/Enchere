package fr.eni.enchere.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Utilisateur;

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

	

	public Utilisateur getCurrent() {
		return current;
	}

	public void setCurrent(Utilisateur current) {
		this.current = current;
	}

	public List<Utilisateur> getLstUtilisateur() {
		return lstUtilisateur;
	}

	public void setLstUtilisateur(List<Utilisateur> lstUtilisateur) {
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
		if (lstUtilisateur != null) {
			builder.append("lstUtilisateur=");
			builder.append(lstUtilisateur);
			builder.append(", ");
		}
		if (message != null) {
			builder.append("message=");
			builder.append(message);
		}
		builder.append("]");
		return builder.toString();
	}

	

}
