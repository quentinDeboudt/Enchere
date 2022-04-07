package fr.eni.enchere.ihm;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.enchere.bll.BLLException;
import fr.eni.enchere.bll.CategorieManager;
import fr.eni.enchere.bll.CategorieManagerSing;
import fr.eni.enchere.bll.EnchereManager;
import fr.eni.enchere.bll.EnchereManagerSing;
import fr.eni.enchere.bo.Enchere;

/**
 * Servlet implementation class ConnecterServlet
 */
@WebServlet("/AccueilConnecterServlet")
public class AccueilConnecterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EnchereManager manager = EnchereManagerSing.getInstance();
	CategorieManager managerCategorie = CategorieManagerSing.getInstance();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilConnecterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArticleVenduModel modelAV = new ArticleVenduModel();
		EnchereModel model = new EnchereModel();
		
		if (request.getParameter("BT_rechercher") != null) {
			Enchere enchere = new Enchere();
			enchere.setNoEnchere(Integer.parseInt(request.getParameter("noEnchere")));
			enchere.setDateEnchere(LocalDate.parse(request.getParameter("dateEnchere")));
			enchere.setMontant_enchere(Integer.parseInt(request.getParameter("montant_enchere")));
			
			try {
				manager.addEnchere(enchere);
			} catch (fr.eni.enchere.bll.BLLException e) {
				model.setMessage("Erreur !!!! : " + e.getMessage());
			}
			model.setCurrent(enchere);
			}

			try {
			model.setLstEnchere(manager.getAllEnchere());
			} catch (BLLException e) {
			model.setMessage("Erreur !!!! : " + e.getMessage());
			}
			
			try {
				model.setLstEnchere(manager.getAllEnchere());
			}
			catch(BLLException e) {
				model.setMessage("Erreur !!!"+e.getMessage());
			}
			
			try {
				//recuperer les categories
				modelAV.setLstCategories(managerCategorie.getAllCategorie());
			} catch (BLLException e1) {
				e1.printStackTrace();
			}

			request.setAttribute("modelAV", modelAV);
			request.setAttribute("model", model);
		
		/*List<Enchere> listeEnchere=new ArrayList<Enchere>();
		try {
			listeEnchere=managerUtilisateur.getAllEnchere();
		} catch (BLLException e) {
			e.printStackTrace();
		}*/
			
		request.getRequestDispatcher("/WEB-INF/accueilConnecter.jsp").forward(request, response);
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
