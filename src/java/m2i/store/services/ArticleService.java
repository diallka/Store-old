/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.store.services;

import java.util.List;
import m2i.store.dao.ArticleDAO;
import m2i.store.entities.Article;

/**
 *
 * @author Pro
 */
public class ArticleService {

    

    public void creerArticle(Article art){
         ArticleDAO dao = new ArticleDAO();
         dao. creer(art);
     }
     //

    public List<Article> listerArticle() {
        return new ArticleDAO().lister();
    }
    
    
}
