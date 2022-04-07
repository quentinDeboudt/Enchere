package fr.eni.enchere.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bll.UtilisateurManager;
import fr.eni.enchere.bll.UtilisateurManagerSing;


/**
 * Servlet implementation class ConnexionServlet
 */
@WebServlet("/ConnexionServlet")
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UtilisateurManager managerUtilisateur = UtilisateurManagerSing.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConnexionServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String destination = "/WEB-INF/connexion.jsp";

		if (request.getParameter("BT_Connexion") != null) {
			String identifiant = request.getParameter("identifiant");
			String motDePasse = request.getParameter("motDePasse");
			HttpSession session = request.getSession();

			try {
				if (managerUtilisateur.connexion(identifiant, motDePasse) == true) {
	
					session.setAttribute("noUtilisateur", managerUtilisateur.getByPseudo(identifiant).getNoUtilisateur());
					session.setAttribute("Identifiant", identifiant);
					session.setAttribute("Mot de passe", motDePasse);
					session.setAttribute("pseudo", managerUtilisateur.getByPseudo(identifiant).getPseudo());
					session.setAttribute("nom", managerUtilisateur.getByPseudo(identifiant).getNom());
					session.setAttribute("prenom", managerUtilisateur.getByPseudo(identifiant).getPrenom());
					session.setAttribute("email", managerUtilisateur.getByPseudo(identifiant).getEmail());
					session.setAttribute("telephone", managerUtilisateur.getByPseudo(identifiant).getTelephone());
					session.setAttribute("rue", managerUtilisateur.getByPseudo(identifiant).getRue());
					session.setAttribute("codePostal", managerUtilisateur.getByPseudo(identifiant).getCodePostal());
					session.setAttribute("ville", managerUtilisateur.getByPseudo(identifiant).getVille());
					session.setAttribute("credit", managerUtilisateur.getByPseudo(identifiant).getCredit());

					destination = "/AccueilConnecter";

				} else {
					request.setAttribute("error", "Identifiants ou mot de passe incorect");
				}

			} catch (BLLException e) {
				e.printStackTrace();
			}

		}

		request.getRequestDispatcher(destination).forward(request, response);
	}
}
