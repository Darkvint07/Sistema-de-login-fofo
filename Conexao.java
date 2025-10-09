import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/sistema_login";
        String usuario = "root";
        String senha = "606312";
        return DriverManager.getConnection(url, usuario, senha);
    }
}
