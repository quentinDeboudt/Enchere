package fr.eni.enchere.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Enchere;

public class EnchereModel {
	
	private Enchere current;
	private List<Enchere> lstEnchere=new ArrayList<Enchere>();
	private String message;
	
	public EnchereModel() {
		
	}

	public EnchereModel(Enchere current, List<Enchere> lstEnchere, String message) {
		this.current = current;
		this.lstEnchere = lstEnchere;
		this.message = message;
	}

	public Enchere getCurrent() {
		return current;
	}

	public void setCurrent(Enchere current) {
		this.current = current;
	}

	public List<Enchere> getLstEnchere() {
		return lstEnchere;
	}

	public void setLstEnchere(List<Enchere> lstEnchere) {
		this.lstEnchere = lstEnchere;
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
		builder.append("EnchereModel [");
		if (current != null) {
			builder.append("current=");
			builder.append(current);
			builder.append(", ");
		}
		if (lstEnchere != null) {
			builder.append("lstEnchere=");
			builder.append(lstEnchere);
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
