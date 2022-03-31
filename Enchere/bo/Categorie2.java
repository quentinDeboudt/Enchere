package fr.eni.enchere2.bo;

import java.util.ArrayList;
import java.util.List;

public class Categorie2 {
	private Integer noCategorie;
	private String libelle;
	private List<ArticleVendu2> lstCategorieArticle = new ArrayList<ArticleVendu2>();
	
	/** 
	 * 
	 */
	public Categorie2() {
	}
	/**
	 * @param noCategorie
	 * @param libelle
	 */
	public Categorie2(Integer noCategorie, String libelle) {
		this.noCategorie = noCategorie;
		this.libelle = libelle;
	}
	/**
	 * @return the noCategorie
	 */
	public Integer getNoCategorie() {
		return noCategorie;
	}
	/**
	 * @param noCategorie the noCategorie to set
	 */
	public void setNoCategorie(Integer noCategorie) {
		this.noCategorie = noCategorie;
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Categorie [");
		if (noCategorie != null) {
			builder.append("noCategorie=");
			builder.append(noCategorie);
			builder.append(", ");
		}
		if (libelle != null) {
			builder.append("libelle=");
			builder.append(libelle);
		}
		builder.append("]");
		return builder.toString();
	}
	

}
