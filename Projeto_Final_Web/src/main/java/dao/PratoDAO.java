package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.PratoBean;

public class PratoDAO {

    private Connection connection;

    public PratoDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserir(PratoBean prato) throws SQLException {
        String sql = "INSERT INTO prato (nome, ingredientes, tipo) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, prato.getNome());
            statement.setString(2, prato.getIngredientes());
            statement.setString(3, prato.getTipo());
            statement.executeUpdate();
        }
    }

    public List<PratoBean> listar() throws SQLException {
        String sql = "SELECT * FROM prato";
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            List<PratoBean> pratos = new ArrayList<>();
            while (resultSet.next()) {
                PratoBean prato = new PratoBean();
                prato.setId(resultSet.getInt("id"));
                prato.setNome(resultSet.getString("nome"));
                prato.setIngredientes(resultSet.getString("ingredientes"));
                prato.setTipo(resultSet.getString("tipo"));
                pratos.add(prato);
            }
            return pratos;
        }
    }

    public PratoBean buscarPorId(Integer id) throws SQLException {
        String sql = "SELECT * FROM prato WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    PratoBean prato = new PratoBean();
                    prato.setId(resultSet.getInt("id"));
                    prato.setNome(resultSet.getString("nome"));
                    prato.setIngredientes(resultSet.getString("ingredientes"));
                    prato.setTipo(resultSet.getString("tipo"));
                    return prato;
                }
            }
        }
        return null;
    }

    public void atualizar(PratoBean prato) throws SQLException {
        String sql = "UPDATE prato SET nome = ?, ingredientes = ?, tipo = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, prato.getNome());
            statement.setString(2, prato.getIngredientes());
            statement.setString(3, prato.getTipo());
            statement.setInt(4, prato.getId());
            statement.executeUpdate();
        }
    }

    public void remover(Integer id) throws SQLException {
        String sql = "DELETE FROM prato WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}