/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package floreve;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author kaique
 */
public class encomendaPlantaDAO {

    public encomendaPlanta en;
    public BD banco;
    private PreparedStatement statement;
    private ResultSet results;
    private String men, sql;
    public static final byte INCLUSAO = 1, ALTERACAO = 2, EXCLUSAO = 3;

    public encomendaPlantaDAO() {
        banco = new BD();
        en = new encomendaPlanta();
    }

    public boolean localizar() {
        sql = "SELECT * FROM encomenda_planta WHERE id = ?";
        try {
            statement = banco.conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(en.id));
            results = statement.executeQuery();
            results.next();
            en.setId(results.getInt(1));
            en.setIdCliente(results.getInt(2));
            en.setIdPlanta(results.getInt(3));
            en.setData(results.getString(4));
//         LocalDate dataenc = LocalDate.parse(en.getData(), DateTimeFormatter.BASIC_ISO_DATE);
//         statement.setDate(3, java.sql.Date.valueOf(dataenc));
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String atualizar(int operacao) {
        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO encomenda_planta (cliente_id, planta_id, data) VALUES (?,?,?);";
                statement = banco.conn.prepareStatement(sql);
                statement.setInt(1, en.getIdCliente());
                statement.setInt(2, en.getIdPlanta());
                java.sql.Date encomenda = java.sql.Date.valueOf(en.getData());
                statement.setDate(3, encomenda);

            } else if (operacao == ALTERACAO) {
                sql = "update encomenda_planta set cliente_id = ?, planta_id = ?,"
                        + "data = ? where id = ?;";
                statement = banco.conn.prepareStatement(sql);
                statement.setInt(1, en.getIdCliente());
                statement.setInt(2, en.getIdPlanta());
                java.sql.Date encomenda = java.sql.Date.valueOf(en.getData());
                statement.setDate(3, encomenda);
                statement.setInt(4, en.getId());
            } else if (operacao == EXCLUSAO) {
                sql = "DELETE FROM encomenda_planta WHERE id = ?;";
                statement = banco.conn.prepareStatement(sql);

                statement.setString(1, String.valueOf(en.getId()));
            }
            if (statement.executeUpdate() == 0) {
                men = "falha na operação";
            }
        } catch (SQLException e) {
            men = "falha na operação!" + e.toString();
        }
        return men;
    }

    private Date DateFormat(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Date SimpleDateFormat(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
