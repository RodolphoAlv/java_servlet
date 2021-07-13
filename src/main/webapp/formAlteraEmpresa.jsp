<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/alteraEmpresa" var="linkAlteraEmpresa" />

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="${ linkAlteraEmpresa }" method="post">
        Nome: <input type="text" name="nome" value="${ empresa.nome }"/> <br/>
        Data de abertura:
        <input
            type="text" name="data"
            value="<fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy" />"
        /> <br/>
        <input type="hidden" name="id" value="${ empresa.id }"/>
        <input type="submit" />
    </form>
</body>
</html>