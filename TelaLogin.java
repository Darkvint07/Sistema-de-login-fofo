import javax.swing.*;
import java.awt.event.*;

public class TelaLogin extends JFrame {
    private JTextField txtUsuario = new JTextField(15);
    private JPasswordField txtSenha = new JPasswordField(15);
    private JButton btnEntrar = new JButton("Entrar");
    private JButton btnCadastro = new JButton("Cadastrar");

    public TelaLogin() {
        setTitle("Tela de Login");
        setLayout(new java.awt.FlowLayout());
        add(new JLabel("Usuário:"));
        add(txtUsuario);
        add(new JLabel("Senha:"));
        add(txtSenha);
        add(btnEntrar);
        add(btnCadastro);

        btnEntrar.addActionListener(e -> {
            String usuario = txtUsuario.getText();
            String senha = new String(txtSenha.getPassword());
            boolean aut = SistemaLogin.autenticar(usuario, senha);
            if (aut) {
                JOptionPane.showMessageDialog(this, "Login realizado com sucesso!");
                EnviarEmail.enviar("Login realizado:\nUsuário: " + usuario);
            } else {
                JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos.");
            }
        });
        btnCadastro.addActionListener(e -> {
            new TelaCadastro(); // <-- ABRE A TELA DE CADASTRO
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaLogin();
    }
}
