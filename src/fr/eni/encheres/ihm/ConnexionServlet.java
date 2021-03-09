package fr.eni.encheres.ihm;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.encheres.bll.BLLException;
import fr.eni.encheres.bll.UtilisateurManager;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.ihm.model.ConnexionForm;


/**
 * Servlet implementation class ConnexionServlet
 */
@WebServlet("/Connexion")
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String EMAIL_PATTERN =
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	UtilisateurManager mgr = new UtilisateurManager();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String pseudo = request.getParameter("pseudo");
		String motDePasse = request.getParameter("motDePasse");
		String id = request.getParameter("id");
		
<<<<<<< HEAD
		//reset a zero si il n'y a pas de sessions ouvertes
=======
		//reset � z�ro si pas de session ouverte
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
		if( pseudo == null) pseudo = "";
		if( motDePasse == null) motDePasse = "";
<<<<<<< HEAD
		//controle de la session 
=======
		//contr�le de la session 
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
		HttpSession session = request.getSession( true );
		session.setAttribute("pseudo", pseudo);
		session.setAttribute("motDePasse", motDePasse);
		session.setAttribute("id", id);

		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Connexion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
			//creation de la session
=======
			//cr�ation de la session
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
			HttpSession session = request.getSession();
		try {
<<<<<<< HEAD
			//recuperation de la liste des utilisateurs en bdd et de la saisie des inputs sur la page de connexion
=======
			//r�cup�ration de la liste des utilisateurs en bdd et de la saisie des inputs sur la page de connexion
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
			List<Utilisateur> listeDutilisateur = mgr.getAllUtilisateur();
			
			String erreur = "Tu as fait une faute d'orthographe";
			String pseudo = ConnexionForm.validateInput(request.getParameter("pseudo").trim(), erreur ) ;
			String mdp = request.getParameter("mdp").trim();

			
<<<<<<< HEAD
			//verification du mot de passe
=======
			//v�rification du mot de passe
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
			ConnexionForm.regStringValeur( mdp, "mdp");
			
<<<<<<< HEAD
			//verif de la saisie utilisateur si pseudo est un mail ou un pseudo
			// et filtrer la saisie pour la stocker dans le pseudo
=======
			//v�rif de la saisie utilisateur si pseudo est un mail ou un pseudo
			//e t filtre la saisie pour la stocker dans le pseudo
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
			if (pseudo.matches(EMAIL_PATTERN)) {
			String email = null;
			 email = (String) request.getParameter("pseudo");
			}
		
			String  mdp1 = ConnexionForm.hashMdp(mdp);

<<<<<<< HEAD
			//filtre de recherche si pseudo ou si email existe dans la bdd et si ceux ci-correspondent au mot de passe enregistrer  en bdd
=======
			//filtre de recherche si pseudo ou si email existe dans la bdd et si ceux ci-correspondent au mot de passe enregistr� en bdd
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
			Utilisateur utilisateurConfirmeBDD = 
				listeDutilisateur.stream().filter(
			u -> (u.getPseudo().contains(pseudo) || u.getEmail().contains(pseudo))  && u.getMotDePasse().contains(mdp1)) 
			       .findFirst().orElse(null);
			
			if (utilisateurConfirmeBDD != null) {
				int id= utilisateurConfirmeBDD.getId();
				session.setAttribute("pseudo", pseudo);
				session.setAttribute("id",id);
				session.setAttribute("estConnecte", true);
				response.sendRedirect("ListeEncheres");
				
			} else {
				
				session.setAttribute("estConnecte", false);
				request.setAttribute("erreur", "t'as fait une faute d'orthographe, man'");
				request.getRequestDispatcher("/WEB-INF/pages/Connexion.jsp").forward(request, response);
			}
		} catch (BLLException e) {
			e.printStackTrace();
		}
	}
}



