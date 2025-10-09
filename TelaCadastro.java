import javax.swing.*;
import java.awt.event.*;

public class TelaCadastro extends JFrame {
    private JTextField txtUsuario = new JTextField(15);
    private JPasswordField txtSenha = new JPasswordField(15);
    private JButton btnCadastrar = new JButton("Cadastrar");

    public TelaCadastro() {
        setTitle("Tela de Cadastro");
        setLayout(new java.awt.FlowLayout());
        add(new JLabel("Novo Usuário:"));
        add(txtUsuario);
        add(new JLabel("Nova Senha:"));
        add(txtSenha);
        add(btnCadastrar);

        btnCadastrar.addActionListener(e -> {
            String usuario = txtUsuario.getText();
            String senha = new String(txtSenha.getPassword());
            boolean sucesso = SistemaLogin.cadastrar(usuario, senha);
            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
                this.dispose(); // fecha tela de cadastro
            } else {
                JOptionPane.showMessageDialog(this, "Usuário já existe!");
            }
        });

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaCadastro();
    }
}
