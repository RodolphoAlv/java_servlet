
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import=" java.util.List, servlet.Empresa"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    Lista de empresas: <br/>

    <ul>
    <%
    List<Empresa> empresas = (List<Empresa>) request.getAttribute("empresas");
    for(Empresa empresa : empresas) {
    %>
        <li><%= empresa.getNome() %></li>
    <%
    }
    %>
    </ul>
</body>
</html>