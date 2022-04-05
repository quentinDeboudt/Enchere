package fr.eni.enchere.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.tag.common.fmt.ParseDateSupport;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Enchere;

/**
 * Servlet implementation class detailVenteServlet
 */
@WebServlet("/detailVenteServlet")
public class detailVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public detailVenteServlet() {
        super();
    } 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		if (request.getParameter("BT_ENCHERIR")!=null) {
			ArticleVendu articleVendu = new ArticleVendu();
			
			articleVendu.setPrixVente(Integer.parseInt(request.getParameter("Proposition")));
		}
	
		
		
		request.getRequestDispatcher("/WEB-INF/detailVente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
