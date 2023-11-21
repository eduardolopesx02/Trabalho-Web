<%@ page import="bean.PratoBean" %>
<%@ page import="dao.PratoDAO" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adicionar Prato</title>
</head>
<body>
    <h2>Adicionar Prato</h2>
    <form action="inserePrato" method="post">
        Nome: <input type="text" name="nome" required><br>
        Ingredientes: <input type="text" name="ingredientes" required><br>
        Tipo: <input type="text" name="tipo" required><br>
        <input type="submit" value="Adicionar Prato">
    </form>
</body>
</html>