<%@ page import="bean.PratoBean" %>
<%@ page import="dao.PratoDAO" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*,java.util.*,javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="util.ConnectionFactory" %>

<%
    Connection connection = ConnectionFactory.getConnection();
    PratoDAO pratoDAO = new PratoDAO(connection);
    PratoBean pratoBean = new PratoBean();
    pratoBean.setNome(request.getParameter("nome"));
    pratoBean.setIngredientes(request.getParameter("ingredientes"));
    pratoBean.setTipo(request.getParameter("tipo"));

    try {
        pratoDAO.inserir(pratoBean);
        response.sendRedirect("listaPratos.jsp");
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
