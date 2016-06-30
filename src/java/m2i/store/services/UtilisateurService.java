/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.store.services;

import m2i.store.dao.UtilisateurDAO;
import m2i.store.entities.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurService {

    public Utilisateur rechercheParLoginEtMdp(String login, String mdp) {
   
        return new UtilisateurDAO().rechercheParLoginEtMdp(login, mdp);
    }
    
    
}
