package fr.eni.enchere.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String pseudo = (String)session.getAttribute("pseudo");
		String nom = (String)session.getAttribute("nom");
		String prenom = (String)session.getAttribute("prenom");
		String email = (String)session.getAttribute("email");
		String telephone = (String)session.getAttribute("telephone");
		String rue = (String)session.getAttribute("rue");
		String codePostal = (String)session.getAttribute("codePostal");
		String ville = (String)session.getAttribute("ville");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
