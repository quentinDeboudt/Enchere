package fr.eni.enchere.bo;

import java.time.LocalDate;

public class Enchere {
	
	private LocalDate dateEnchere;
	private Integer montant_enchere;
	
	private Utilisateur utilisateur;
	private ArticleVendu articleVendu;
	
	/**
	 * Constructeur.
	 */
	public Enchere() {
		super();
	}

	/**
	 * Constructeur.
	 * @param dateEnchere
	 * @param montant_enchere
	 * @param utilisateur
	 * @param articleVendu
	 */
	public Enchere(LocalDate dateEnchere, Integer montant_enchere, Utilisateur utilisateur, ArticleVendu articleVendu) {
		super();
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
		this.utilisateur = utilisateur;
		this.articleVendu = articleVendu;
	}

	/**
	 * Constructeur.
	 * @param dateEnchere
	 * @param montant_enchere
	 */
	public Enchere(LocalDate dateEnchere, Integer montant_enchere) {
		super();
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
	}

	/**
	 * Constructeur.
	 * @param dateEnchere
	 * @param montant_enchere
	 * @param utilisateur
	 */
	public Enchere(LocalDate dateEnchere, Integer montant_enchere, Utilisateur utilisateur) {
		super();
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
		this.utilisateur = utilisateur;
	}

	public LocalDate getDateEnchere() {
		return dateEnchere;
	}

	public Integer getMontant_enchere() {
		return montant_enchere;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public ArticleVendu getArticleVendu() {
		return articleVendu;
	}

	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public void setMontant_enchere(Integer montant_enchere) {
		this.montant_enchere = montant_enchere;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public void setArticleVendu(ArticleVendu articleVendu) {
		this.articleVendu = articleVendu;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enchere [");
		if (dateEnchere != null) {
			builder.append("dateEnchere=");
			builder.append(dateEnchere);
			builder.append(", ");
		}
		if (montant_enchere != null) {
			builder.append("montant_enchere=");
			builder.append(montant_enchere);
			builder.append(", ");
		}
		if (utilisateur != null) {
			builder.append("utilisateur=");
			builder.append(utilisateur);
			builder.append(", ");
		}
		if (articleVendu != null) {
			builder.append("articleVendu=");
			builder.append(articleVendu);
		}
		builder.append("]");
		return builder.toString();
	}
	
}
