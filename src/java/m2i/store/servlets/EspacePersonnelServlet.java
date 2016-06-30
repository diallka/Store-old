/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.store.servlets;

import java.io.IOException;
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
@WebServlet(name = "EspacePersonnel", urlPatterns = {"/espace_personnel"})
public class EspacePersonnelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Article> mesArticles = new ArticleService().listerArticle();
        req.getSession().setAttribute("articles", mesArticles);

        //HttpSession session = req.getSession();
        //Méthode formateur
        //********************************************************************
//        long idArticle = Long.parseLong(req.getParameter("id"));
//        List<Long> panier = (List<Long>) req.getSession().getAttribute("panier");
//        panier.add(idArticle);
        //********************************************************************
        req.getRequestDispatcher("espace_personnel.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
