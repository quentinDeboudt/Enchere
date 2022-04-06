package fr.eni.enchere.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bo.Utilisateur;

/**
 * Servlet implementation class AfficherMonProfilServlet
 */
@WebServlet("/AfficherMonProfilServlet")
public class AfficherMonProfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AfficherMonProfilServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UtilisateurModel model = new UtilisateurModel();
		Utilisateur utilisateur = new Utilisateur();

		// je récupère la session en cours
		HttpSession session = request.getSession();

		// info de la session dont j'ai besoin
		String pseudo = (String) session.getAttribute("pseudo");
		String nom = (String) session.getAttribute("nom");
		String prenom = (String) session.getAttribute("prenom");
		String email = (String) session.getAttribute("email");
		String telephone = (String) session.getAttribute("telephone");
		String rue = (String) session.getAttribute("rue");
		String codePostal = (String) session.getAttribute("codePostal");
		String ville = (String) session.getAttribute("ville");

		// je place les infos de la session dans Utilisateur
		utilisateur.setPseudo(pseudo);
		utilisateur.setNom(nom);
		utilisateur.setPrenom(prenom);
		utilisateur.setEmail(email);
		utilisateur.setTelephone(telephone);
		utilisateur.setRue(rue);
		utilisateur.setCodePostal(codePostal);
		utilisateur.setVille(ville);

		// je place les infos utilisateur dans le model
		model.setCurrent(utilisateur);

		// je fais le lien entre le model et la jsp
		request.setAttribute("model", model);

		// si l'utilisateur clique sur le bouton modifier, il est redirigé vers la page de modification
		if (request.getParameter("BT_MODIF") != null) {
			request.getRequestDispatcher("/WEB-INF/ModifierMonProfilServlet").forward(request, response);
		} else {
			// sinon j'appelle la jsp pour afficher les infos de mon profil
			request.getRequestDispatcher("/WEB-INF/afficherMonProfil.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
