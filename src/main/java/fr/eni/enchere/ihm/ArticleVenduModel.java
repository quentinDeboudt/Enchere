package fr.eni.enchere.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Enchere;

public class ArticleVenduModel {
	
	private ArticleVendu current;
	private String message;
	private List<Enchere> listEnchere=new ArrayList<Enchere>();
	
	public ArticleVenduModel(){
		
	}
	
	

	public ArticleVenduModel(ArticleVendu current, String message, List<Enchere> listEnchere) {
		this.current = current;
		this.message = message;
		this.listEnchere = listEnchere;
	}



	public ArticleVendu getCurrent() {
		return current;
	}

	public void setCurrent(ArticleVendu current) {
		this.current = current;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Enchere> getListEnchere() {
		return listEnchere;
	}

	public void setListEnchere(List<Enchere> listEnchere) {
		this.listEnchere = listEnchere;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArctileVenduModel [");
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
		if (listEnchere != null) {
			builder.append("listEnchere=");
			builder.append(listEnchere);
		}
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
