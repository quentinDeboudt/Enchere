package fr.eni.enchere.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Retrait;

/**
 * Servlet implementation class JeRemporteVenteServlet
 */
@WebServlet("/JeRemporteVenteServlet")
public class JeRemporteVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JeRemporteVenteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		NouvelleVenteModel model = new NouvelleVenteModel();
		ArticleVendu articleVendu = new ArticleVendu();

		// je récupère la session en cours
		HttpSession session = request.getSession();
		
		
		model.setCurrent(articleVendu);
		
		// je fais le lien entre le model et la jsp
		request.setAttribute("model", model);
		request.getRequestDispatcher("/WEB-INF/jeRemporteVente.jsp").forward(request, response);

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
