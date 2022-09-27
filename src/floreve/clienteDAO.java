/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package floreve;

import java.sql.*;

/**
 *
 * @author ander
 */
public class clienteDAO {

    public cliente c1;
    public BD banco;
    private PreparedStatement statement;
    private ResultSet results;
    private String men, sql;
    public static final byte INCLUSAO = 1, ALTERACAO = 2, EXCLUSAO = 3;

    public clienteDAO() {
        banco = new BD();
        c1 = new cliente();
    }

    public boolean localizar() {
        sql = "SELECT * FROM cliente WHERE id = ?";
        try {
            statement = banco.conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(c1.id));
            results = statement.executeQuery();
            results.next();
            c1.setId(results.getInt(1));
            c1.setNome(results.getString(2));
            c1.setTelefone(results.getString(3));
            c1.setEndereco(results.getString(4));
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String atualizar(int operacao) {
        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO cliente (nome, telefone, endereco) VALUES (?,?,?);";
                statement = banco.conn.prepareStatement(sql);
                statement.setString(1, c1.getNome());
                statement.setString(2, c1.getTelefone());
                statement.setString(3, c1.getEndereco());
            } else if (operacao == ALTERACAO) {
                sql = "update cliente set nome = ?, telefone = ?,"
                        + "endereco = ? where id = ?;";
                statement = banco.conn.prepareStatement(sql);
                statement.setString(1, c1.getNome());
                statement.setString(2, c1.getTelefone());
                statement.setString(3, c1.getEndereco());
                statement.setInt(4, c1.getId());
            } else if (operacao == EXCLUSAO) {
                sql = "DELETE FROM cliente WHERE id = ?;";
                statement = banco.conn.prepareStatement(sql);
                statement.setString(1, String.valueOf(c1.getId()));
            }
            if (statement.executeUpdate() == 0) {
                men = "falha na operação";
            }
        } catch (SQLException e) {
            men = "falha na operação!" + e.toString();
        }
        return men;
    }
}
