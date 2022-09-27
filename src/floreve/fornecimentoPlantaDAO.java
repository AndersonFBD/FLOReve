/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package floreve;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author kaique
 */
public class fornecimentoPlantaDAO {

    public fornecimentoPlanta f1;
    public BD banco;
    private PreparedStatement statement;
    private ResultSet results;
    private String men, sql;
    public static final byte INCLUSAO = 1, ALTERACAO = 2, EXCLUSAO = 3;

    public fornecimentoPlantaDAO() {
        banco = new BD();
        f1 = new fornecimentoPlanta();
    }

    public boolean localizar() {
        sql = "SELECT * FROM fornecimento_planta WHERE id = ?";
        try {
            statement = banco.conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(f1.id));
            results = statement.executeQuery();
            results.next();
            f1.setId(results.getInt(1));
            f1.setIdFornecedor(results.getInt(2));
            f1.setIdPlanta(results.getInt(3));
            f1.setData(results.getString(4));
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String atualizar(int operacao) {
        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO fornecimento_planta (fornecedor_id, planta_id, data) VALUES (?,?,?);";
                statement = banco.conn.prepareStatement(sql);
                statement.setInt(1, f1.getIdFornecedor());
                statement.setInt(2, f1.getIdPlanta());
                java.sql.Date forndata = java.sql.Date.valueOf(f1.getData());
                statement.setDate(3, forndata);
            } else if (operacao == ALTERACAO) {
                sql = "update fornecimento_planta set fornecedor_id = ?, planta_id = ?,"
                        + "data = ? where id = ?;";
                statement = banco.conn.prepareStatement(sql);
                statement.setInt(1, f1.getIdFornecedor());
                statement.setInt(2, f1.getIdPlanta());
                java.sql.Date forndata = java.sql.Date.valueOf(f1.getData());
                statement.setDate(3, forndata);
                statement.setInt(4, f1.getId());
            } else if (operacao == EXCLUSAO) {
                sql = "DELETE FROM fornecimento_planta WHERE id = ?;";
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
