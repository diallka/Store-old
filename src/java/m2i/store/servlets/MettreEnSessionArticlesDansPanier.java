/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.store.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import m2i.store.entities.Article;
import m2i.store.services.ArticleService;

/**
 *
 * @author Pro
 */
@WebServlet(name = "MettreEnSessionArticlesDansPanier", urlPatterns = {"/mettre_en_session_article"})
public class MettreEnSessionArticlesDansPanier extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<Article> mesArticles = new ArticleService().listerArticle();
//        //req.getSession().setAttribute("panier", panier);
//        HttpSession session = req.getSession(true);
//        ArrayList <Article> panier =   (ArrayList<Article>)session.getAttribute("articles");
//        session.setAttribute("articlesChoisi", panier.add());
        //***********************************************************************  
        List contenuPanier = (List) req.getSession().getAttribute("panier");
        if (contenuPanier == null) {
            contenuPanier = new ArrayList();

        }
        contenuPanier.add(req.getParameter("nom"));
        req.getSession().setAttribute("panier", contenuPanier);
        //*************************************************************************
        //Test debug
//          for (Object art : contenuPanier) {
//              System.out.println("Nom art"+((Article) art).getNom());
//            }

//          HttpSession session = req.getSession();
//        Article panier;
//        panier = (Article) session.getAttribute("nom");
//        if(panier == null){
//          panier = new Article();
//          session.setAttribute("panier", panier);
//        }
        //String name = (String) req.getParameter("name");
        //long idArticle = Long.parseLong(req.getParameter("id"));
        //Integer price = Integer.parseInt(req.getParameter("prix"));
        //shoppingCart.addToCart(name, price);
        //session.setAttribute("panier", shoppingCart);
        //Méthode formateur
        //***********************************************************************
//           req.getSession().setAttribute("panier", new ArrayList<Long>()); //On passe par l'i pour recupere l'article
//           
//           long idArticle = Long.parseLong(req.getParameter("id"));
//            List<Long> panier = (List<Long>) req.getSession().getAttribute("panier");
//            panier.add(idArticle);
        //**********************************************************************
        //Méthode perso
//        req.getSession().setAttribute("panier", new ArrayList<Article>());
//        
//        String nom = req.getParameter("nom");
//        List<String> panier = (List<String>) req.getSession().getAttribute("panier");
//        panier.add(nom);
        //**********************************************************************
        //req.getSession()
        //req.setAttribute("articlesChoisi", panier.add());
        //req.getSession().setAttribute("articlesChoisi", (String) (req.getParameter("nom")));
        //On recupere le nom de l'article qu'on souhaite ajouter et on le met en session
        //req.getSession().setAttribute("nomArticleActuel", (String) (req.getParameter("nom")));
        resp.sendRedirect("espace_personnel");
    }

}
