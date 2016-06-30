<%-- 
    Document   : ajouter_article
    Created on : 29 juin 2016, 21:27:20
    Author     : Pro
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ajout article!</h1>
        <form method="post">
            Nom: <input type="text" name="nom"/>
            <input type="submit" value="creer"/>
            
        </form>
        <c:forEach items="${articles}" var="article">
        <ol>
            <li>${article.nom}</li>
        </ol>
    </c:forEach>
        
    </body>
</html>
