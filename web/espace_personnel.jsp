<%-- 
    Document   : espace_personnel
    Created on : 29 juin 2016, 18:44:49
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
            <h1>Espace personnel</h1>
            <div align="left">
                <c:forEach items="${articles}" var="article">
                    ${article.nom} &nbsp&nbsp ${article.prix} &nbsp&nbsp ${article.stock} <a href="mettre_en_session_article?id=${article.id}&nom=${article.nom}"><b>+</b></a> <br/>
                    <%--
                    <form method="post">
                        <button type="submit" class="glyphicon glyphicon-plus" value=""> </button>
                    </form> --%>
                </c:forEach>
            </div>
            <div align="center"><button class="glyphicon glyphicon-shopping-cart"></button><br/> 
                <c:forEach items="${panier}" var="panier">
                    ${panier},
                </c:forEach>
                <br/>
            </div>
        </div>
        <div class="pied">
            <c:import url="_FOOTER.jsp" />
        </div>
    </body>
</html>

