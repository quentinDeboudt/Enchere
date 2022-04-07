package fr.eni.enchere.ihm;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.modeler.modules.ModelerSource;

import fr.eni.enchere.bll.ArticleVenduManager;
import fr.eni.enchere.bll.ArticleVenduManagerSing;
import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bll.CategorieManager;
import fr.eni.enchere.bll.CategorieManagerSing;
import fr.eni.enchere.bll.EnchereManager;
import fr.eni.enchere.bll.EnchereManagerSing;
import fr.eni.enchere.bll.UtilisateurManager;
import fr.eni.enchere.bll.UtilisateurManagerSing;
import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Retrait;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class CreationNouvelleVente
 */
@WebServlet("/CreationNouvelleVente")
public class CreationNouvelleVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ArticleVenduManager manager = ArticleVenduManagerSing.getInstance();
	private CategorieManager managerCategorie = CategorieManagerSing.getInstance();
	private UtilisateurManager managerUtilisateur = UtilisateurManagerSing.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreationNouvelleVenteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArticleVenduModel model = initPage(request);
		request.setAttribute("model", model);
		request.getRequestDispatcher("/WEB-INF/creationNouvelleVente.jsp").forward(request, response);
		return;
	}

	/**
	 * Méthode en charge de 
	 * @param request
	 * @return
	 */
	private ArticleVenduModel initPage(HttpServletRequest request) {
		ArticleVenduModel model = new ArticleVenduModel();

		// je récupère la session en cours
		HttpSession session = request.getSession();
		// info de la session dont j'ai besoin
		String rue = (String) session.getAttribute("rue");
		String codePostal = (String) session.getAttribute("codePostal");
		String ville = (String) session.getAttribute("ville");
		String pseudo = (String) session.getAttribute("pseudo");
		
		// je récupère les categories
		try {
			model.setLstCategories(managerCategorie.getAllCategorie());
		} catch (BLLException e1) {
			e1.printStackTrace();
		}
		return model;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArticleVenduModel model = initPage(request);
		request.setAttribute("model", model);
	if (request.getParameter("BT_ENREGISTRER") != null) {
			
			ArticleVendu articleVendu = new ArticleVendu();
			Retrait retrait = new Retrait();
			Categorie categorie = new Categorie();
			Utilisateur utilisateur = new Utilisateur();

			articleVendu.setNomArticle(request.getParameter("Article"));
			articleVendu.setDescription(request.getParameter("Description"));
			articleVendu.setMiseAPrix(Integer.parseInt(request.getParameter("MiseAPrix")));
			System.out.println("coucou");
			articleVendu.setDateDebutEncheres(LocalDate.parse(request.getParameter("DateDebutEncheres")));
			articleVendu.setDateFinEncheres(LocalDate.parse(request.getParameter("DateFinEncheres")));

			retrait.setRue(request.getParameter("Article"));
			retrait.setCode_postal(request.getParameter("Code_Postal"));
			retrait.setVille(request.getParameter("Ville"));

			articleVendu.setLieuRetrait(retrait);


			request.getSession().setAttribute("articleVendu", articleVendu);
			
			//je récupère une categorie grâce au noCategorie sélectionné

			try {
				categorie = managerCategorie.getCategorieById(Integer.parseInt(request.getParameter("noCategorie")));
				articleVendu.setCategorie(categorie);
			} catch (BLLException e1) {
				e1.printStackTrace();
			}
			
			//je récupère le vendeur grâce au pseudo en session
			try {
				utilisateur = managerUtilisateur.getByPseudo(((Utilisateur)request.getSession().getAttribute("utilisateur")).getPseudo());
				articleVendu.setUtilisateur(utilisateur);
			} catch (BLLException e1) {
				e1.printStackTrace();
			}
			
			//j'adapte l'état de vente
			if (articleVendu.getDateDebutEncheres().isAfter(LocalDate.now())) {
				articleVendu.setEtatVente("enchère non débutée");
			}
			if (articleVendu.getDateFinEncheres().isAfter(LocalDate.now())) {
				articleVendu.setEtatVente("enchère en cours");
			}
			if (articleVendu.getDateFinEncheres().isBefore(LocalDate.now())) {
				articleVendu.setEtatVente("enchère terminée");
			}
			
			
			
			try {
				
				manager.addArticleVendu(articleVendu);
				model.setCurrent(articleVendu);
			} catch (BLLException e) {
				model.setMessage("Erreur !!!! : " + e.getMessage());
			}
		}
		request.setAttribute("model", model);
		request.getRequestDispatcher("/WEB-INF/accueilConnecter.jsp").forward(request, response);
		return;
	}

}
