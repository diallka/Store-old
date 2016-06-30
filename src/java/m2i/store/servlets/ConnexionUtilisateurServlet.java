/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.store.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import m2i.store.entities.Utilisateur;
import m2i.store.services.UtilisateurService;

/**
 *
 * @author Pro
 */
@WebServlet(name = "ConnexionUtilisateurServlet", urlPatterns = {"/connecter_utilisateur"})
public class ConnexionUtilisateurServlet extends HttpServlet {

    @Override
    //Méthode doPost envoie des données
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Récuperer params formulaire
        String login = request.getParameter("login");
        String mdp = request.getParameter("mdp");

        //Récuperer l'utilisateur correspondant en BDD
        //new UtilisateurService().rechercheParLoginEtMdp(login, mdp);
        Utilisateur util = new UtilisateurService().rechercheParLoginEtMdp(login, mdp);

        request.getSession().setAttribute("utilConnecte", util);

        //response.sendRedirect("espace_personnel?connecte=vrai");
        response.sendRedirect("espace_personnel?connecte=vrai");

    }

    @Override
    //Méthode doGet recupère des données
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Renvoyer vers  la jsp "form.jso"
        request.getRequestDispatcher("connexion_utilisateur.jsp").forward(request, response);
    }

}
