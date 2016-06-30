/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.store.servlets;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import m2i.store.entities.Article;
import m2i.store.services.ArticleService;

/**
 *
 * @author Pro
 */
@WebServlet(name = "AjouterArticleServlet", urlPatterns = {"/ajout_article"})
public class AjouterArticleServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //On crée un article
      Article art = new Article(); 
        
        art.setNom(req.getParameter("nom"));
        ArticleService articleService = new ArticleService();
        
        new ArticleService().creerArticle(art);
        
        resp.sendRedirect("ajout_article");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
//        List<Article> mesArticles = new ArticleService().listerArticle();
//        req.setAttribute("articles", mesArticles);
        
        //Renvoyer vers  la jsp 
        req.getRequestDispatcher("ajouter_article.jsp").forward(req, resp);
    }

    
    
}
