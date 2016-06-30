/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.store.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import m2i.store.entities.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurDAO {

    
     //Rechercher utilisateur existant par login et mdp et on le connecte
    public Utilisateur rechercheParLoginEtMdp(String login, String mdp) {
       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:monLogin AND u.mdp=:monMdp");
       query.setParameter("monLogin", login);
       query.setParameter("monMdp", mdp);
       return (Utilisateur) 
               query.getSingleResult();
    }
}
