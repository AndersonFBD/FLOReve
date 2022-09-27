/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package floreve;

import java.sql.*;

/**
 *
 * @author kaique
 */
public class fornecedorDAO {

    public fornecedor f1;
    public BD banco;
    private PreparedStatement statement;
    private ResultSet results;
    private String men, sql;
    public static final byte INCLUSAO = 1, ALTERACAO = 2, EXCLUSAO = 3;

    public fornecedorDAO() {
        banco = new BD();
        f1 = new fornecedor();
    }

    public boolean localizar() {
        sql = "SELECT * FROM fornecedor WHERE id = ?";
        try {
            statement = banco.conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(f1.id));
            results = statement.executeQuery();
            results.next();
            f1.setId(results.getInt(1));
            f1.setNome(results.getString(2));
            f1.setTelefone(results.getString(3));
            f1.setEndereco(results.getString(4));
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public String atualizar(int operacao) {
        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO fornecedor (nome, telefone, endereco) VALUES (?,?,?);";
                statement = banco.conn.prepareStatement(sql);

                statement.setString(1, f1.getNome());
                statement.setString(2, f1.getTelefone());
                statement.setString(3, f1.getEndereco());
            } else if (operacao == ALTERACAO) {
                sql = "update fornecedor set nome = ?, telefone = ?,"
                        + "endereco = ? where id = ?;";
                statement = banco.conn.prepareStatement(sql);
                statement.setString(1, f1.getNome());
                statement.setString(2, f1.getTelefone());
                statement.setString(3, f1.getEndereco());
                statement.setInt(4, f1.getId());
            } else if (operacao == EXCLUSAO) {
                sql = "DELETE FROM fornecedor WHERE id = ?;";
                statement = banco.conn.prepareStatement(sql);

                statement.setString(1, String.valueOf(f1.getId()));
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
