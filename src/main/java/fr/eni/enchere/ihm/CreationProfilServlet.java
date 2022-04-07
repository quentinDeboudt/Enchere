package fr.eni.enchere.ihm;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bll.UtilisateurManager;
import fr.eni.enchere.bll.UtilisateurManagerSing;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class CreationProfilServlet
 */
@WebServlet("/CreationProfilServlet")
public class CreationProfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurManager manager = UtilisateurManagerSing.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreationProfilServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UtilisateurModel model = new UtilisateurModel();
		
		
		if (request.getParameter("BT_CREER") != null) {

			if (request.getParameter("motDePasse").equals(request.getParameter("verifMotDePasse"))) {

				Utilisateur utilisateur = new Utilisateur();
				utilisateur.setPseudo(request.getParameter("pseudo"));
				utilisateur.setPrenom(request.getParameter("prenom"));
				utilisateur.setTelephone(request.getParameter("telephone"));
				utilisateur.setCodePostal(request.getParameter("codePostal"));
				utilisateur.setMotDePasse(request.getParameter("motDePasse"));
				utilisateur.setNom(request.getParameter("nom"));
				utilisateur.setEmail(request.getParameter("email"));
				utilisateur.setRue(request.getParameter("rue"));
				utilisateur.setVille(request.getParameter("ville"));
				utilisateur.setCredit(utilisateur.getCredit());
				utilisateur.setAdministrateur(utilisateur.getAdministrateur());

				try {
					manager.addUtilisateur(utilisateur);
					model.setCurrent(utilisateur);
					request.getRequestDispatcher("AccueilConnecter").forward(request, response);
				} catch (BLLException e) {
					model.setMessage(e.getMessage());
				}
			}
			
		}
		
		if (request.getParameter("BT_ANNULER") != null) {
			request.getRequestDispatcher("/WEB-INF/accueilNonConnecter.jsp").forward(request, response);
		}
		
			request.setAttribute("model", model);
			request.getRequestDispatcher("/WEB-INF/creationProfil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
