package fr.eni.enchere.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.bierotheque.bll.BLLException;
import fr.eni.bierotheque.bo.Biere;
import fr.eni.bierotheque.ihm.BiereModel;
import fr.eni.enchere.bll.UtilisateurManager;
import fr.eni.enchere.bll.UtilisateurManagerSing;
import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class AcceuilNonConnecter
 */
@WebServlet("/AcceuilNonConnecter")
public class AcceuilConnecterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UtilisateurManager manager = UtilisateurManagerSing.getInstance();

	/**
	 * Default constructor.
	 */
	public AcceuilConnecterServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UtilisateurModel model = new UtilisateurModel();
		if (request.getParameter("BT_VALID") != null) {
			Utilisateur utilisateur = new Utilisateur();
			
			utilisateur.setNoUtilisateur(request.getParameter("noUtilisateur"));
			utilisateur.setPseudo(request.getParameter("pseudo"));
			utilisateur.setNom(request.getParameter("nom"));
			utilisateur.setPrenom(request.getParameter("prenom"));
			utilisateur.setEmail(request.getParameter("email"));
			utilisateur.setTelephone(request.getParameter("telephone"));
			utilisateur.setRue(request.getParameter("rue"));
			utilisateur.setCodePostal(request.getParameter("code postal"));
			utilisateur.setVille(request.getParameter("ville"));
			utilisateur.setMotDePasse(request.getParameter("mot de passe"));
			utilisateur.setCredit(request.getParameter("credit"));
			utilisateur.setAdministrateur(request.getParameter("administrateur"));
			
			try {
				manager.addUtilisateur(utilisateur);
			} catch (fr.eni.enchere.bll.BLLException e) {
				model.setMessage("Erreur !!!! : " + e.getMessage());
			}
			model.setCurrent(utilisateur);
		}
		
		try {
			model.setLstUtilisateur(manager.getAll());
		} catch (fr.eni.enchere.bll.BLLException e) {
			model.setMessage("Erreur !!!! : " + e.getMessage());
		}

		request.setAttribute("model", model);
		request.getRequestDispatcher("/WEB-INF/acceuilConnecter.jsp").forward(request, response);
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
