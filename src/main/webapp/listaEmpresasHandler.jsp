
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<%
String[] empresas = (String[]) request.getAttribute("empresas");
for(String empresa : empresas) {
    out.println("<li>" + empresa + "</li>");
}
%>
</body>
</html>