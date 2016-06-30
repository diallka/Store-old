/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.store.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pro
 */
@WebServlet(name = "DeconnexionServlet", urlPatterns = {"/deconnecter_utilisateur"})
public class DeconnexionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //On efface la session de l'utilisateur quand il se deconnecte
        req.getSession().removeAttribute("utilConnecte");

        //On vide le panier qand Déconnexion
        req.getSession().removeAttribute("panier");

        resp.sendRedirect("connecter_utilisateur");
    }

}
