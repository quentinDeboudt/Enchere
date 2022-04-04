package fr.eni.enchere.ihm;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Retrait;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class CreationNouvelleVente
 */
@WebServlet("/CreationNouvelleVente")
public class CreationNouvelleVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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

		if (request.getParameter("BT_ENREGISTRER")!=null) {
			ArticleVendu articleVendu = new ArticleVendu();
			
			articleVendu.setNomArticle(request.getParameter("Article"));
			articleVendu.setDescription(request.getParameter("Description"));
			//articleVendu.setCategorie(request.getParameter("Categorie")); //recuperer les categories
			//articleVendu.setImage
			articleVendu.setMiseAPrix(Integer.parseInt(request.getParameter("MiseAPrix")));
			
			articleVendu.setDateDebutEncheres(LocalDate.parse(request.getParameter("DateDebutEncheres")));
			articleVendu.setDateFinEncheres(LocalDate.parse(request.getParameter("DateFinEncheres")));
			/* fonction retrait (par default celui de l'utilisateur)
				articleVendu.setRue(request.getParameter("Article"));
				articleVendu.setCode_Postal(request.getParameter("Code_Postal"));
				articleVendu.setVille(request.getParameter("Ville"));
			*/
			
		}
			
		//request.setAttribute("model", model);
		request.getRequestDispatcher("/WEB-INF/CreationNouvelleVente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
