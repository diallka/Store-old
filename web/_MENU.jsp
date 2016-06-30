<%-- 
    Document   : _MENU
    Created on : 29 juin 2016, 18:36:24
    Author     : Pro
--%>


<div>
  <table>
    <tr>
      
    
    
    <c:choose>
        <c:when test="${utilConnecte.login==null}">
            <th><a href="connexion_utilisateur">Connexion</a></th>
        </c:when>
        <c:otherwise>
            <a href="deconnexion_utilisateur">Déconnexion</a></th> 
            <c:if test="${utilConnecte.typeUtil == 'ADMIN'}">
                
                <%--Mettre menu admin--%>
            
            </c:if>
        </c:otherwise>
    </c:choose>
    
</tr>
  </table>
</div>