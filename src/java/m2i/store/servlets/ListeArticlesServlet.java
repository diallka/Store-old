/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.store.servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ListeArticlesServlet", urlPatterns = {"/lister_articles"})
public class ListeArticlesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Article> mesArticles = new ArticleService().listerArticle();
        req.getSession().setAttribute("articles", mesArticles);

        //Renvoyer vers  la jsp 
        req.getRequestDispatcher("liste_articles.jsp").forward(req, resp);
    }

}
