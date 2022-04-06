package fr.eni.enchere.ihm;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Retrait;

/**
 * 
 */

/**
 * @author qdeboudt2022 4 avr. 2022
 */
public class NouvelleVenteModel {
	private ArticleVendu current;
	private List<ArticleVendu> lstArticleVendu = new ArrayList<>();
	private String message;
	private Categorie categorie;
	private Retrait retrait;
	
	

	/**
	 * Constructeur.
	 */
	public NouvelleVenteModel() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param current
	 * @param lstArticleVendu
	 * @param message
	 * @param categorie
	 * @param retrait
	 */
	public NouvelleVenteModel(ArticleVendu current, List<ArticleVendu> lstArticleVendu, String message,
			Categorie categorie, Retrait retrait) {
		this.current = current;
		this.lstArticleVendu = lstArticleVendu;
		this.message = message;
		this.categorie = categorie;
		this.retrait = retrait;
	}

	/**
	 * @return the current
	 */
	public ArticleVendu getCurrent() {
		return current;
	}

	/**
	 * @param current the current to set
	 */
	public void setCurrent(ArticleVendu current) {
		this.current = current;
	}

	/**
	 * @return the lstArticleVendu
	 */
	public List<ArticleVendu> getLstArticleVendu() {
		return lstArticleVendu;
	}

	/**
	 * @param lstArticleVendu the lstArticleVendu to set
	 */
	public void setLstArticleVendu(List<ArticleVendu> lstArticleVendu) {
		this.lstArticleVendu = lstArticleVendu;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	/**
	 * @return the retrait
	 */
	public Retrait getRetrait() {
		return retrait;
	}

	/**
	 * @param retrait the retrait to set
	 */
	public void setRetrait(Retrait retrait) {
		this.retrait = retrait;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NouvelleVenteModel [");
		if (current != null) {
			builder.append("current=");
			builder.append(current);
			builder.append(", ");
		}
		if (lstArticleVendu != null) {
			builder.append("lstArticleVendu=");
			builder.append(lstArticleVendu);
			builder.append(", ");
		}
		if (message != null) {
			builder.append("message=");
			builder.append(message);
			builder.append(", ");
		}
		if (categorie != null) {
			builder.append("categorie=");
			builder.append(categorie);
			builder.append(", ");
		}
		if (retrait != null) {
			builder.append("retrait=");
			builder.append(retrait);
		}
		builder.append("]");
		return builder.toString();
	}

}
