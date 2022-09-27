package floreve;
/*
  Classe responsável por realizar a conexão com o banco de dados  
*/
import java.sql.*;

public class BD {
    public Connection conn = null;
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String BDNAME = "mydb"; //TODO: definir o nome do banco depois
    private final String URL = "jdbc:mysql://localhost:3306/" +BDNAME;
    private final String password = "utfpr2022"; //substituir essa string se rodar em outra maquina
    private final String user = "root";
    
    public boolean GetConnection(){
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, user, password);
            System.out.println("Banco Conectado!");
            return true;
        } catch (ClassNotFoundException e) {
            System.out.println("não conecta" + e.toString());
            return false;
        } catch(SQLException e){
            System.out.println("falha na conexão" +e.toString());
            return false;
        }
    }
    public void close(){
        try {
            conn.close();
            System.out.println("Sistema desconectado");
        } catch (SQLException e) {
            System.out.println("problema na desconexão" +e.toString());
        }
    }
    
}
