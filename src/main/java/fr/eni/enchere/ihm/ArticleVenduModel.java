package fr.eni.enchere.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Enchere;

public class ArticleVenduModel {
	
	private ArticleVendu current;
	private String message;
	private List<ArticleVendu> listArticleVendu =new ArrayList<ArticleVendu>();
	private List<Enchere> listEnchere=new ArrayList<Enchere>();
	private List<Categorie> lstCategories = new ArrayList<Categorie>();
	
	public ArticleVenduModel(){
		
	}

	/**
	 * Constructeur.
	 * @param current
	 * @param message
	 * @param listEnchere
	 * @param lstCategories
	 */
	public ArticleVenduModel(ArticleVendu current, String message, List<Enchere> listEnchere,
			List<Categorie> lstCategories) {
		super();
		this.current = current;
		this.message = message;
		this.listEnchere = listEnchere;
		this.lstCategories = lstCategories;
	}



	/**
	 * @return the listArticleVendu
	 */
	public List<ArticleVendu> getListArticleVendu() {
		return listArticleVendu;
	}

	/**
	 * @param listArticleVendu the listArticleVendu to set
	 */
	public void setListArticleVendu(List<ArticleVendu> listArticleVendu) {
		this.listArticleVendu = listArticleVendu;
	}

	public ArticleVenduModel(ArticleVendu current, String message, List<Enchere> listEnchere) {
		this.current = current;
		this.message = message;
		this.listEnchere = listEnchere;
	}

	

	public List<Categorie> getLstCategories() {
		return lstCategories;
	}

	public void setLstCategories(List<Categorie> lstCategories) {
		this.lstCategories = lstCategories;
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
		builder.append("ArticleVenduModel [");
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
			builder.append(", ");
		}
		if (lstCategories != null) {
			builder.append("lstCategories=");
			builder.append(lstCategories);
		}
		builder.append("]");
		return builder.toString();
	}
	
	
}
