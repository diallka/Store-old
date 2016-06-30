/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.store.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
@Entity
public class Utilisateur implements Serializable {
    
    //Définition enum UtilType
//    private enum TypeUtil {
//        ADMIN,
//        EQUIPE_EXP,
//        CLIENT,
//        VISITEUR;
//    }
    //********************************
    //Instanciation
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String mdp;
    
//    @Enumerated(EnumType.STRING)
//    public TypeUtil typeUtil;
    
    private String adresseLivraison;
    
    
    @OneToMany(mappedBy="utilisateur")
    private List<Commande> commandes = new ArrayList<>();
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    

    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    //**********************************
    //Getter et Setter
    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    @Override
    public String toString() {
        return "m2i.store.entities.Utilisateur[ id=" + id + " ]";
    }
    
}
