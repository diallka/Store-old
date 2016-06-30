/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.store.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import m2i.store.entities.Article;

/**
 *
 * @author Pro
 */
public class ArticleDAO {

    public void creer(Article art) {
       
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin(); //Au debut sinon n'inserre pas dans la table
    
        em.persist(art); //persister l'article
        em.getTransaction().commit();//A la fin
       
    }

    public List<Article> lister() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.createQuery("SELECT a FROM Article a ORDER BY a.nom").getResultList();
    }

    
    
}
