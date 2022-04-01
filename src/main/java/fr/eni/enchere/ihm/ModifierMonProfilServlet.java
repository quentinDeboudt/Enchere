package fr.eni.enchere.ihm;

import java.io.IOException;
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
 * Servlet implementation class ModifierMonProfilServlet
 */
@WebServlet("/ModifierMonProfilServlet")
public class ModifierMonProfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
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
		
		if (request.getParameter("BT_ENREGISTRER")!=null) {
			Utilisateur utilisateur = new Utilisateur();
			
			if (request.getParameter("newMotDePasse").equals(request.getParameter("Confirmation"))) {
			
				utilisateur.setPseudo(request.getParameter("pseudo"));
				utilisateur.setPrenom(request.getParameter("prenom"));
				utilisateur.setTelephone(request.getParameter("telephone"));
				utilisateur.setCodePostal(request.getParameter("codePostal")); //Mettre le code postal en String (suprimer ce massage quand c'est fais)...
				utilisateur.setMotDePasse(request.getParameter("newMotDePasse")); // Je remplace "MotDePasse"  par  "NewMotDePasse"...
				
				utilisateur.setNom(request.getParameter("nom"));
				utilisateur.setEmail(request.getParameter("email"));
				utilisateur.setRue(request.getParameter("rue"));
				utilisateur.setVille(request.getParameter("ville"));
			}else {
				model.setMessage("Le mot de passe de Confirmation n'est pas Correct");
			}
			
			try {
				manager.UpDateUtilisateur(utilisateur);  //Crée une fonction "update" dans UtilisateurManager pour que ca fonctionne...
			} catch (BLLException e) {
				model.setMessage("Erreur !!!! : "+e.getMessage());
			}
			model.setCurrent(utilisateur);
		}
		
		try {
			model.setLstUtilisateurs(manager.getAll());
			
		} catch (BLLException e) {
			model.setMessage("Erreur !!!! : "+e.getMessage());
		}
		
		request.setAttribute("model", model);
		request.getRequestDispatcher("/WEB-INF/ModifierMonProfil.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
