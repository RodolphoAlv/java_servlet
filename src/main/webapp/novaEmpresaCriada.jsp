<%
    String nomeEmpresa = (String) request.getAttribute("empresa");
    System.out.println(nomeEmpresa);
%>

<html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
        Nome da empresa é <%= nomeEmpresa %>
    </body>
</html>