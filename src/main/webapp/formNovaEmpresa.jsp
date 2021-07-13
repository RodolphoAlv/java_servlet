<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkNovaEmpresaCriada" />

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="${ linkNovaEmpresaCriada }" method="post">
        Nome: <input type="text" name="nome" /> <br/>
        Data de abertura: <input type="text" name="data" /> <br/>
        <input type="submit" />
    </form>
</body>
</html>