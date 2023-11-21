<%@ page import="bean.PedidoBean" %>
<%@ page import="dao.PedidoDAO" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*,java.util.*,javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="util.ConnectionFactory" %>

<%
    Connection connection = ConnectionFactory.getConnection();
    PedidoDAO pedidoDAO = new PedidoDAO(connection);
    PedidoBean pedidoBean = new PedidoBean();
    pedidoBean.setData(new Date());
    pedidoBean.setEntrada(Integer.parseInt(request.getParameter("entrada")));
    pedidoBean.setPrincipal(Integer.parseInt(request.getParameter("principal")));
    pedidoBean.setSobremesa(Integer.parseInt(request.getParameter("sobremesa")));

    try {
        pedidoDAO.inserir(pedidoBean);
        response.sendRedirect("listaPedidos.jsp");
    } catch (SQLException e) {
        throw new ServletException(e);
    } finally {
        // Certifique-se de fechar a conexão após o uso
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
%>
