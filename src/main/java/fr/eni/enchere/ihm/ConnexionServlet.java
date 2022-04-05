package fr.eni.enchere.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.UtilisateurManager;
import fr.eni.enchere.bll.UtilisateurManagerSing;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class ConnexionServlet
 */
@WebServlet("/ConnexionServlet")
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UtilisateurManager manager = UtilisateurManagerSing.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnexionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String identifiant = request.getParameter("Identifiant");
		String motDePasse = request.getParameter("Mot de passe");
		HttpSession session =request.getSession();
		
		try {
			
		session.setAttribute("noUtilisateur", manager.getByPseudo(identifiant).getNoUtilisateur());
		session.setAttribute("Identifiant", identifiant);
		session.setAttribute("Mot de passe", motDePasse);
		session.setAttribute("pseudo", manager.getByPseudo(identifiant).getPseudo());
		session.setAttribute("nom", manager.getByPseudo(identifiant).getNom());
		session.setAttribute("prenom", manager.getByPseudo(identifiant).getPrenom());
		session.setAttribute("email", manager.getByPseudo(identifiant).getEmail());
		session.setAttribute("telephone", manager.getByPseudo(identifiant).getTelephone());
		session.setAttribute("rue", manager.getByPseudo(identifiant).getRue());
		session.setAttribute("codePostal", manager.getByPseudo(identifiant).getCodePostal());
		session.setAttribute("ville", manager.getByPseudo(identifiant).getVille());
		
		request.getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
<<<<<<< HEAD
		doGet(request, response);
=======
		
		} catch (Exception e) {
			e.getMessage();
		}
		
>>>>>>> 37e2584720a2d7291829a4fb49a3aad4fb07ee39
	}

}
