<%-- 
    Document   : ajouter_article
    Created on : 29 juin 2016, 21:27:20
    Author     : Pro
--%>


<!--ajouter library jstl sinon $.. ne fonctionne pas-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Template Page</title>
        <c:import url="_STYLESHEET.jsp" />
        <c:import url="_HEADER.jsp" />
    </head>
    <body>
        <div class="titre">
           <c:import url="_TITLE.jsp" /> 
        </div>
        <div class="menu">
            <c:import url="_MENU.jsp" />
        </div>
        <div class="contenu">
            <h1>Ajout article!</h1>
        <form method="post">
            Nom: <input type="text" name="nom"/> <br/><br/>
            Prix: <input type="text" name="prix"/> <br/><br/>
            Stock: <input type="number" name="stock"/> <br/><br/>
            <input type="submit" value="creer"/>

        </form>
            
        <div align="center">
            <h4>Articles existants</h4>
            <table border="3">
                <tr>
                    <th>Désignation</th>
                    <th>Prix(€)</th>
                    <th>Stock</th>		

                </tr>
                <c:forEach items="${articles}" var="article">
                    <tr>
                        <td>${article.nom}</td>
                        <td>${article.prix}</td>
                        <td>${article.stock}</td>
                    </tr>

                </c:forEach>
            </table>

        </div>
        </div>
        <div class="pied">
            <c:import url="_FOOTER.jsp" />
        </div>
    </body>
</html>

