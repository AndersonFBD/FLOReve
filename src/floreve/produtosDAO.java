package floreve;

import java.sql.*;

// classe de controle de produtos
public class produtosDAO {

    public produtos p1;
    public BD banco;
    private PreparedStatement statement;
    private ResultSet results;
    private String men, sql;
    public static final byte INCLUSAO = 1, ALTERACAO = 2, EXCLUSAO = 3;

    public produtosDAO() {
        banco = new BD();
        p1 = new produtos();
    }

    public boolean localizar() {
        sql = "SELECT * FROM produto WHERE id = ?";
        try {
            statement = banco.conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(p1.id));
            results = statement.executeQuery();
            results.next();
            p1.setId(results.getInt(1));
            p1.setNome(results.getString(2));
            p1.setTipo(results.getString(3));
            p1.setMarca(results.getString(4));
            p1.setPreco(results.getDouble(5));

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String atualizar(int operacao) {
        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO produto (nome, tipo, marca, preco) VALUES (?,?,?,?);";
                statement = banco.conn.prepareStatement(sql);
                statement.setString(1, p1.getNome());
                statement.setString(2, p1.getTipo());
                statement.setString(3, p1.getMarca());
                statement.setDouble(4, p1.getPreco());
            } else if (operacao == ALTERACAO) {
                sql = "update produto set nome = ?, tipo = ?,"
                        + "marca = ?, preco = ? where id = ?;";
                statement = banco.conn.prepareStatement(sql);
                statement.setString(1, p1.getNome());
                statement.setString(2, p1.getTipo());
                statement.setString(3, p1.getMarca());
                statement.setDouble(4, p1.getPreco());
                statement.setInt(5, p1.getId());
            } else if (operacao == EXCLUSAO) {
                sql = "DELETE FROM produto WHERE id = ?;";
                statement = banco.conn.prepareStatement(sql);
                statement.setString(1, String.valueOf(p1.getId()));
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
