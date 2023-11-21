package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import bean.PedidoBean;

public class PedidoDAO {

    private Connection connection;

    public PedidoDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserir(PedidoBean pedido) throws SQLException {
        String sql = "INSERT INTO pedido (data, entrada, principal, sobremesa) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDate(1, new Date(pedido.getData().getTime()));
            statement.setInt(2, pedido.getEntrada());
            statement.setInt(3, pedido.getPrincipal());
            statement.setInt(4, pedido.getSobremesa());
            statement.executeUpdate();
        }
    }

    public List<PedidoBean> listar() throws SQLException {
        String sql = "SELECT * FROM pedido";
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            List<PedidoBean> pedidos = new ArrayList<>();
            while (resultSet.next()) {
                PedidoBean pedido = new PedidoBean();
                pedido.setId(resultSet.getInt("id"));
                pedido.setData(resultSet.getDate("data"));
                pedido.setEntrada(resultSet.getInt("entrada"));
                pedido.setPrincipal(resultSet.getInt("principal"));
                pedido.setSobremesa(resultSet.getInt("sobremesa"));
                pedidos.add(pedido);
            }
            return pedidos;
        }
    }

    public PedidoBean buscarPorId(Integer id) throws SQLException {
        String sql = "SELECT * FROM pedido WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    PedidoBean pedido = new PedidoBean();
                    pedido.setId(resultSet.getInt("id"));
                    pedido.setData(resultSet.getDate("data"));
                    pedido.setEntrada(resultSet.getInt("entrada"));
                    pedido.setPrincipal(resultSet.getInt("principal"));
                    pedido.setSobremesa(resultSet.getInt("sobremesa"));
                    return pedido;
                }
            }
        }
        return null;
    }

    public void atualizar(PedidoBean pedido) throws SQLException {
        String sql = "UPDATE pedido SET data = ?, entrada = ?, principal = ?, sobremesa = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDate(1, new Date(pedido.getData().getTime()));
            statement.setInt(2, pedido.getEntrada());
            statement.setInt(3, pedido.getPrincipal());
            statement.setInt(4, pedido.getSobremesa());
            statement.setInt(5, pedido.getId());
            statement.executeUpdate();
        }
    }

    public void remover(Integer id) throws SQLException {
        String sql = "DELETE FROM pedido WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}