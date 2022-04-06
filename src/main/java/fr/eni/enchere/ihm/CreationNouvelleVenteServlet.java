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
	ArticleVenduModel model = new ArticleVenduModel();
	private ArticleVenduManager manager = ArticleVenduManagerSing.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreationNouvelleVenteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// je récupère la session en cours
		HttpSession session = request.getSession();
		// info de la session dont j'ai besoin
		String rue = (String) session.getAttribute("rue");
		String codePostal = (String) session.getAttribute("codePostal");
		String ville = (String) session.getAttribute("ville");
		
		
		if (request.getParameter("BT_ENREGISTRER")!=null) {
			ArticleVendu articleVendu = new ArticleVendu();
			Retrait retrait = new Retrait();
			Categorie categorie = new Categorie();
			
			articleVendu.setNomArticle(request.getParameter("Article"));
			articleVendu.setDescription(request.getParameter("Description"));
			categorie.setLibelle(request.getParameter("Categorie")); //recuperer les categories
			//articleVendu.setImage //insert image 
			articleVendu.setMiseAPrix(Integer.parseInt(request.getParameter("MiseAPrix")));
			
			articleVendu.setDateDebutEncheres(LocalDate.parse(request.getParameter("DateDebutEncheres")));
			articleVendu.setDateFinEncheres(LocalDate.parse(request.getParameter("DateFinEncheres")));
			
			retrait.setRue(request.getParameter("Article"));
			retrait.setCode_postal(request.getParameter("Code_Postal"));
			retrait.setVille(request.getParameter("Ville"));
			
			articleVendu.setLieuRetrait(retrait);
					
		
			session.setAttribute("articleVendu", articleVendu);
			
			
			try {
				manager.addArticleVendu(articleVendu);

			} catch (BLLException e) {
				model.setMessage("Erreur !!!! : "+e.getMessage());
			}
			request.setAttribute("model", model);
			request.getRequestDispatcher("AccueilConnecterServlet").forward(request, response);
		}
		
		
		request.getRequestDispatcher("/WEB-INF/creationNouvelleVente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
