package fr.eni.encheres.bll;

import java.util.List;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.DALException;
import fr.eni.encheres.dal.DAOFactory;
import fr.eni.encheres.dal.UtilisateurDAO;

public class UtilisateurManager {

	private UtilisateurDAO utilisateurDAO;

	/**
	 * Constructeur utilisateurManager
	 */
	public UtilisateurManager() {
		utilisateurDAO = DAOFactory.getUtilisateurDAO();
	}

	public List<Utilisateur> getAllUtilisateur() throws BLLException {
		List<Utilisateur> listeUtilisateur = null;
		try {
			listeUtilisateur = utilisateurDAO.findAllUtilisateur();
		} catch (DALException e) {
			e.printStackTrace();
			throw new BLLException();
		}
		return listeUtilisateur;
	}

	public void insertUtilisateur(Utilisateur user) throws BLLException {

		try {
			utilisateurDAO.insertUtilisateur(user);
		} catch (DALException e) {
			throw new BLLException();
		}
	}

	/**
<<<<<<< HEAD
=======
	 * @author SoGutta
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
	 * @param id
	 * @return Utilisateur
	 * @throws BLLException
	 * 
<<<<<<< HEAD
	 *                      Selectionne un utilisateur par son ID � l'aide du
	 *                      manager
=======
	 *                      Selectionne un utilisateur par son ID à l'aide du
	 *                     												 Manager
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
	 */
	public Utilisateur selectById(int id) throws BLLException {
		Utilisateur utilisateur = null;
		try {
			utilisateur = utilisateurDAO.selectById(id);

		} catch (DALException e) {
			System.out.println("Erreur selectById manager");
			throw new BLLException();
		}
		return utilisateur;
	};
	
	public Utilisateur selectByPseudo(String pseudo) throws BLLException{
		Utilisateur utilisateur = null;

		try {
			utilisateur = utilisateurDAO.selectByPseudo(pseudo);
		} catch (DALException e) {
			throw new BLLException();
		}
		return utilisateur;
	}
	
	public void updateById(Utilisateur user) throws BLLException{
		try {
			utilisateurDAO.updateById(user);
		} catch (DALException e) {
			throw new BLLException();
		}
	}
	
	public void deleteById(int id) throws BLLException{
		try {
			utilisateurDAO.deleteById(id);
		} catch (DALException e) {
			throw new BLLException();
		}
	}
}
