package fr.eni.encheres.bll;

import java.sql.SQLException;
import java.util.List;
import fr.eni.encheres.bo.Article;
import fr.eni.encheres.bo.Categorie;
import fr.eni.encheres.dal.ArticleDAO;
import fr.eni.encheres.dal.DALException;
import fr.eni.encheres.dal.DAOFactory;

public class ArticleManager {

	private ArticleDAO articleDAO;

	public ArticleManager() {
		articleDAO = DAOFactory.getArticleDAO();
	}

	/**
<<<<<<< HEAD
	
=======
	 * @author SoGutta
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
	 * @return List<Article>
	 * @throws BLLException
<<<<<<< HEAD
	 * Selectionne tout les articles avec Utilisateur et cat�gorie
=======
	 * Selectionne tout les articles avec Utilisateur et catégorie
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
	 */
	public List<Article> SelectAllArticlesAvecUtilisateurEtCategorie(int utilisateurId, int categorieId) throws BLLException {
		List<Article> listeArticle = null;
		try {
			listeArticle = articleDAO.SelectAllArticlesAvecUtilisateurEtCategorie(utilisateurId, categorieId);
		} catch (DALException e) {
			System.out.println("erreur manager SelectAllArticlesAvecUtilisateurEtCategorie");
			throw new BLLException();
		}
		return listeArticle;

	}
	/**
<<<<<<< HEAD
	 * m�thode d'insertion d'article en bdd
=======
	 * méthode d'insertion d'article en bdd
	 * @author SoGutta
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
	 * @throws BLLException 
	 * @throws SQLException 
	 * @return article
	 */
	public void  insertArticle ( Article article, int utilisateurId, int categorieId) throws BLLException, SQLException {
		try {
			System.out.println("l� ! bll" + article);
			 articleDAO.insertArticle ( article, utilisateurId, categorieId );

		} catch (DALException e) {
			System.out.println("erreur lors de l'insertion de l'article");
			throw new BLLException();
		}
	}
	/**
<<<<<<< HEAD
=======
	 * @author SoGutta
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
	 * @return List<Categorie>
	 * @throws BLLException
<<<<<<< HEAD
	 * Selectionne toutes les cat�gories
=======
	 * Selectionne toutes les catégories
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
	 */
	public List<Categorie> SelectAllCategories() throws BLLException {
		
		List<Categorie> listeCategorie = null;
		
		try {
			listeCategorie = articleDAO.SelectAllCategories();
		} catch (DALException e) {
			System.out.println("Erreur manager SelectAllCategorie");
			throw new BLLException();
		}
		return listeCategorie;	
		
	}
	

	/**
<<<<<<< HEAD
=======
	 * @author SoGutta
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
	 * @return List<Article>
	 * @throws BLLException
<<<<<<< HEAD
	 * Selectionne tout les articles avec Utilisateur et cat�gorie
=======
	 * Selectionne tout les articles avec Utilisateur et catégories
>>>>>>> branch 'master' of https://github.com/Eni-Mugiwara/ENI-Encheres.git
	 */
	public List<Article> SelectAllArticles() throws BLLException {
		List<Article> listeArticle = null;
		try {
			listeArticle = articleDAO.selectAllArticles();
		} catch (DALException e) {
			System.out.println("erreur manager SelectAllArticles");
			throw new BLLException();
		}
		return listeArticle;

	}
	
	public List<Article> selectAllByEtatVente(int etatVente) throws BLLException{
		List<Article> listeArticle = null;
		try {
			listeArticle = articleDAO.selectAllByEtatVente(etatVente);
		} catch (DALException e) {
			System.out.println("erreur manager selectAllByEtatVente");
			throw new BLLException();
		}
		return listeArticle;
	}
	
	public List<Article> selectAllByEtatVenteUtilisateur(int etatVente, int idUtilisateur) throws BLLException{
		List<Article> listeArticle = null;
		try {
			listeArticle = articleDAO.selectAllByEtatVenteUtilisateur(etatVente, idUtilisateur);
		} catch (DALException e) {
			System.out.println("erreur manager selectAllByEtatVenteUtilisateur");
			throw new BLLException();
		}
		return listeArticle;
	}
	
	public List<Article> selectAllByEtatVenteGagne(int etatVente, int idUtilisateur) throws BLLException{
		List<Article> listeArticle = null;
		try {
			listeArticle = articleDAO.selectAllByEtatVenteGagne(etatVente, idUtilisateur);
		} catch (DALException e) {
			System.out.println("erreur manager selectAllByEtatVenteGagne");
			throw new BLLException();
		}
		return listeArticle;
	}
	
	public List<Article> SelectAllEncheresByEtat(int idUtilisateur, int etatVente) throws BLLException{
		List<Article> listeArticle = null;
		try {
			listeArticle = articleDAO.SelectAllEncheresByEtat(idUtilisateur, etatVente);
		} catch (DALException e) {
			System.out.println("erreur manager SelectAllEncheresByEtat");
			throw new BLLException();
		}
		return listeArticle;
	}

	
	public Article selectArticleByID(int idArticle) {
		Article article = null;
		try {
			article = articleDAO.SelectEnchereById(idArticle);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return article;

	}
}
