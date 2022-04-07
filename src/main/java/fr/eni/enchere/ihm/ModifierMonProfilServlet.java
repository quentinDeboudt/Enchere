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
import fr.eni.enchere.dal.DALException;

/**
 * Servlet implementation class ModifierMonProfilServlet
 */
@WebServlet("/ModifierMonProfilServlet")
public class ModifierMonProfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private UtilisateurManager managerUtilisateur = UtilisateurManagerSing.getIntance();
	private UtilisateurManager manager = UtilisateurManagerSing.getInstance();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierMonProfilServlet() {
        super(); 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UtilisateurModel model = new UtilisateurModel();
		HttpSession session = request.getSession();//recupere la session
		
		Integer numeroUtilisateur = (Integer) session.getAttribute("no_utilisateur");
		String pseudo = (String) session.getAttribute("pseudo");
	
		if (request.getParameter("BT_ENREGISTRER")!=null) {
			Utilisateur utilisateur = new Utilisateur();
			
			if (request.getParameter("newMotDePasse").equals(request.getParameter("confirmation"))) {
				
				utilisateur.setPseudo(request.getParameter("pseudo"));
				utilisateur.setPrenom(request.getParameter("prenom"));
				utilisateur.setTelephone(request.getParameter("telephone"));
				utilisateur.setCodePostal(request.getParameter("codePostal"));
				utilisateur.setMotDePasse(request.getParameter("newMotDePasse")); // Je remplace le  "MotDePasse"  par  "NewMotDePasse"...
				
				utilisateur.setNom(request.getParameter("nom"));
				utilisateur.setEmail(request.getParameter("email"));
				utilisateur.setRue(request.getParameter("rue"));
				utilisateur.setVille(request.getParameter("ville"));
				
				
				session.setAttribute("utilisateur", utilisateur);
				
				
			}else {
				model.setMessage("Le mot de passe de Confirmation n'est pas Correct"); //newMotDePasse == Confirmation |Sinon: Message d'erreur.
			}
				     
			try {
				manager.SetUpDate(numeroUtilisateur);

			} catch (BLLException e) {
				model.setMessage("Erreur !!!! : "+e.getMessage());
			}
			model.setCurrent(utilisateur);
			request.getRequestDispatcher("AccueilConnecterServlet").forward(request, response);
		}
		
		if (request.getParameter("BT_SUPRIMER")!=null) {
			try {
				System.out.println("pseudo:" + pseudo);
				manager.supprimeUtilisateur(pseudo);
			} catch (DALException e) {
				e.printStackTrace();
			} catch (BLLException e) {
				e.printStackTrace();
			}
			request.getRequestDispatcher("/WEB-INF/accueilNonConnecter.jsp").forward(request, response);

		}else {
			request.setAttribute("model", model);
			request.getRequestDispatcher("/WEB-INF/modifierMonProfil.jsp").forward(request, response);
		}
		
	
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
