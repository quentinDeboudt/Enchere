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

		if (request.getParameter("BT_Connexion") != null) {
			String identifiant = request.getParameter("identifiant");
			String motDePasse = request.getParameter("motDePasse");
			HttpSession session = request.getSession();

			try {
				if (manager.connexion(identifiant, motDePasse) == true) {
	
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
					session.setAttribute("credit", manager.getByPseudo(identifiant).getCredit());

					request.getRequestDispatcher("AccueilConnecterServlet").forward(request, response);

				} else {
					request.setAttribute("error", "Identifiants ou mot de passe incorect");
				}

			} catch (BLLException e) {
				e.printStackTrace();
			}

		}

		request.getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
	}
}
