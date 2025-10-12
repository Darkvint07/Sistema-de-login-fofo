import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class Conexao {
    public static Connection conectar() throws SQLException, IOException {
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            props.load(fis);
        }
        String url = props.getProperty("db.url");
        String usuario = props.getProperty("db.user");
        String senha = props.getProperty("db.password");
        return DriverManager.getConnection(url, usuario, senha);
    }
}
