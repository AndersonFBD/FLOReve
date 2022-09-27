package floreve;

import java.sql.*;

public class plantaDAO {

    public planta p1;
    public BD banco;
    private PreparedStatement statement;
    private ResultSet results;
    private String men, sql;
    public static final byte INCLUSAO = 1, ALTERACAO = 2, EXCLUSAO = 3;

    public plantaDAO() {
        banco = new BD();
        p1 = new planta();
    }

    public boolean localizar() {
        sql = "SELECT * FROM planta WHERE id = ?";
        try {
            statement = banco.conn.prepareStatement(sql);
            statement.setString(1, String.valueOf(p1.id));
            results = statement.executeQuery();
            results.next();
            p1.setId(results.getInt(1));
            p1.setNomePop(results.getString(2));
            p1.setNomeCie(results.getString(3));
            p1.setPreco(results.getDouble(4));
            p1.setTamanho(results.getDouble(5));
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public String atualizar(int operacao) {
        try {
            if (operacao == INCLUSAO) {
                sql = "INSERT INTO planta (nome_popular, nome_cientifico, preco, tamanho_vaso) VALUES (?,?,?,?);";
                statement = banco.conn.prepareStatement(sql);
                statement.setString(1, p1.getNomePop());
                statement.setString(2, p1.getNomeCie());
                statement.setDouble(3, p1.getPreco());
                statement.setDouble(4, p1.getTamanho());
            } else if (operacao == ALTERACAO) {
                sql = "update planta set nome_popular = ?, nome_cientifico = ?,"
                        + "preco = ?, tamanho_vaso = ? where id = ?;";
                statement = banco.conn.prepareStatement(sql);
                statement.setString(1, p1.getNomeCie());
                statement.setString(2, p1.getNomePop());
                statement.setDouble(3, p1.getPreco());
                statement.setDouble(4, p1.getTamanho());
                statement.setInt(5, p1.getId());
            } else if (operacao == EXCLUSAO) {
                sql = "DELETE FROM planta WHERE id = ?;";
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
