
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import=" java.util.List, servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/removeEmpresa" var="removeEmpresa" />

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <c:if test="${ not empty empresa }">
        A empresa ${ empresa } foi cadastrada com sucesso!
    </c:if>
    Lista de empresas: <br/>

    <ul>
        <c:forEach items="${ empresas }" var="empresa">
            <li>
                ${ empresa.nome } - <fmt:formatDate
                    value="${ empresa.dataAbertura }"
                    pattern="dd/MM/yyyy"
                />
                <a href="${ removeEmpresa }?id=${ empresa.id }">remove</a>
            </li>
        </c:forEach>
    </ul>
</body>
</html>