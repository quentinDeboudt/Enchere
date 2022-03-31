package fr.eni.enchere2.bo;

import java.time.LocalDate;
import java.util.List;

public class ArticleVendu2 {
	
	private Integer noArticle;
	private String nomArticle;
	private String description;
	private LocalDate dateDebutEncheres;
	private LocalDate dateFinEncheres;
	private Integer miseAPrix;
	private Integer prixVente;
	private String etatVente;
	private Retrait2 lieuRetrait;
	private List<Enchere2> lstEncheres;
	
	/**
	 * Constructeur.
	 */
	public ArticleVendu2() {
		super();
	}
	
	/**
	 * Constructeur.
	 * @param noArticle
	 * @param nomArticle
	 * @param description
	 * @param dateDebutEncheres
	 * @param dateFinEncheres
	 * @param miseAPrix
	 * @param prixVente
	 * @param etatVente
	 * @param lieuRetrait
	 * @param lstEncheres
	 */
	public ArticleVendu2(Integer noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,LocalDate dateFinEncheres,
			Integer miseAPrix, Integer prixVente, String etatVente, Retrait2 lieuRetrait,List<Enchere2> lstEncheres) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.lieuRetrait = lieuRetrait;
		this.lstEncheres = lstEncheres;
	}

	/**
	 * Constructeur.
	 * @param noArticle
	 * @param nomArticle
	 * @param description
	 * @param dateDebutEncheres
	 * @param dateFinEncheres
	 * @param miseAPrix
	 * @param prixVente
	 */
	public ArticleVendu2(Integer noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, Integer miseAPrix, Integer prixVente) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
	}

	public Integer getNoArticle() {
		return noArticle;
	}
	public String getNomArticle() {
		return nomArticle;
	}
	public String getDescription() {
		return description;
	}
	public LocalDate getDateDebutEncheres() {
		return dateDebutEncheres;
	}
	public LocalDate getDateFinEncheres() {
		return dateFinEncheres;
	}
	public Integer getMiseAPrix() {
		return miseAPrix;
	}
	public Integer getPrixVente() {
		return prixVente;
	}
	public String getEtatVente() {
		return etatVente;
	}
	public Retrait2 getLieuRetrait() {
		return lieuRetrait;
	}
	public List<Enchere2> getLstEncheres() {
		return lstEncheres;
	}

	public void setNoArticle(Integer noArticle) {
		this.noArticle = noArticle;
	}
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDateDebutEncheres(LocalDate dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}
	public void setDateFinEncheres(LocalDate dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}
	public void setMiseAPrix(Integer miseAPrix) {
		this.miseAPrix = miseAPrix;
	}
	public void setPrixVente(Integer prixVente) {
		this.prixVente = prixVente;
	}
	public void setEtatVente(String etatVente) {
		this.etatVente = etatVente;
	}
	public void setLieuRetrait(Retrait2 lieuRetrait) {
		this.lieuRetrait = lieuRetrait;
	}
	public void setLstEncheres(List<Enchere2> lstEncheres) {
		this.lstEncheres = lstEncheres;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArticleVendu [");
		if (noArticle != null) {
			builder.append("noArticle=");
			builder.append(noArticle);
			builder.append(", ");
		}
		if (nomArticle != null) {
			builder.append("nomArticle=");
			builder.append(nomArticle);
			builder.append(", ");
		}
		if (description != null) {
			builder.append("description=");
			builder.append(description);
			builder.append(", ");
		}
		if (dateDebutEncheres != null) {
			builder.append("dateDebutEncheres=");
			builder.append(dateDebutEncheres);
			builder.append(", ");
		}
		if (dateFinEncheres != null) {
			builder.append("dateFinEncheres=");
			builder.append(dateFinEncheres);
			builder.append(", ");
		}
		if (miseAPrix != null) {
			builder.append("miseAPrix=");
			builder.append(miseAPrix);
			builder.append(", ");
		}
		if (prixVente != null) {
			builder.append("prixVente=");
			builder.append(prixVente);
			builder.append(", ");
		}
		if (etatVente != null) {
			builder.append("etatVente=");
			builder.append(etatVente);
			builder.append(", ");
		}
		if (lieuRetrait != null) {
			builder.append("lieuRetrait=");
			builder.append(lieuRetrait);
			builder.append(", ");
		}
		if (lstEncheres != null) {
			builder.append("lstEncheres=");
			builder.append(lstEncheres);
		}
		builder.append("]");
		return builder.toString();
	}
	
}