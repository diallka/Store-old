<%-- 
    Document   : _MENU
    Created on : 29 juin 2016, 18:36:24
    Author     : Pro
--%>



<div>
  <table>
    <tr>
     
    <c:choose>
        <c:when test="${utilConnecte.typeUtil == 'ADMIN'}">
            <th><a href="espace_personnel">Espace perso</a>***</th>
            <th><a href="ajouter_article">Ajouter articles</a>***</th>
            <th><a href="lister_articles">Lister articles</a>***</th>
        </c:when>
       
            <a href="deconnecter_utilisateur">Déconnexion</a></th> 
        
       
    </c:choose>
    
    
</tr>
  </table>
</div>      
            <hr>