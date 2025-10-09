import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SistemaLogin {

    public static boolean autenticar(String usuario, String senha) {
        try (Connection con = Conexao.conectar()) {
            String sql = "SELECT 1 FROM usuarios WHERE usuario = ? AND senha = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}

// AGORA A PARTE DO CADASTRO:

public static boolean cadastrar(String usuario, String senha) {
    try (Connection con = Conexao.conectar ()) {
        String sqlCheck = "SELECT 1 FROM usuario WHERE usuario = ?";
        PreparedStatement st = con.prepareStatement(sqlCheck);
        st.setString(1, usuario);
        if (rs.next()) {
            return false; //usuario ja existe
        }

        //INSERE NOVO USUARIOO
        String sqlInsert = "INSERT INTO usuarios (usuario, senha) VALUES (?,?)"
        st = con.prepareStatement(sqlInsert)
        st.setString(1, usuario);
        st.setString(2, senha);
        st.executeUpdate();
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
         
    ]
}
