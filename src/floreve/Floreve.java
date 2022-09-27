package floreve;
import telas.login;

/**
 *
 * @author Anderson Felipe de Barros Dias
 */
public class Floreve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        login telalogin = new login();                  //gera a tela de login
        telalogin.setLocationRelativeTo(null);          //centraliza a tela de login
        telalogin.setVisible(true);                     //exibe a tela de login
    }
    
}
