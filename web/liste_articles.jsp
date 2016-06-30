<%-- 
    Document   : lister_articles
    Created on : 30 juin 2016, 11:09:20
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
            
            <h4>Liste articlespar ordre A-Z <br/>designation/prix/stock</h4>
            <c:forEach items="${articles}" var="article">
                ${article.nom} &nbsp&nbsp ${article.prix} &nbsp&nbsp ${article.stock} <br/>
                
            </c:forEach>
                
        </div>
        <div class="pied">
            <c:import url="_FOOTER.jsp" />
        </div>
    </body>
</html>

