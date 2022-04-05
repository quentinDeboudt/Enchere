package fr.eni.enchere.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bll.UtilisateurManager;
import fr.eni.enchere.bll.UtilisateurManagerImpl;
import fr.eni.enchere.bll.UtilisateurManagerSing;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class AfficherProfilAutreUtilisateurServlet
 */
@WebServlet("/AfficherProfilAutreUtilisateurServlet")
public class AfficherProfilAutreUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UtilisateurManager manager = UtilisateurManagerSing.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficherProfilAutreUtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UtilisateurModel model = new UtilisateurModel();
		
		//aller chercher les informations d'un utilisateur en ayant sélectionner son pseudo
		try {
			model.setCurrent(manager.getByPseudo(model.getCurrent().getPseudo()));
		} catch (BLLException e) {
			model.setMessage(e.getMessage());
		}
		
		
		
		request.getRequestDispatcher("/WEB-INF/afficherProfilAutreUtilisateur.jsp").forward(request, response);
		
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
