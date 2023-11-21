<%@ page import="bean.PedidoBean" %>
<%@ page import="dao.PedidoDAO" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adicionar Pedido</title>
</head>
<body>
    <h2>Adicionar Pedido</h2>
    <form action="inserePedido" method="post">
        Data: <input type="date" name="data" required><br>
        Entrada: <input type="number" name="entrada" required><br>
        Principal: <input type="number" name="principal" required><br>
        Sobremesa: <input type="number" name="sobremesa" required><br>
        <input type="submit" value="Adicionar Pedido">
    </form>
</body>
</html>