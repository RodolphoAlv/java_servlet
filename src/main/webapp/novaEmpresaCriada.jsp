<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
        <c:if test="${ not empty empresa }">
            A empresa ${ empresa } foi cadastrada com sucesso!
        </c:if>

        <c:if test="${ empty empresa }">
            Nenhuma empresa foi cadastrada!
        </c:if>

    </body>
</html>