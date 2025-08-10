import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CadastroUsuario extends JFrame {
    private JLabel jlEmail;
    private JTextField jtfEmail;
    private JLabel jlSenha;
    private JPasswordField passwordSenha;
    private JButton cadastrarButton;
    private JPanel MainPanel;

    public CadastroUsuario() { //cria a interface e suas propriedades]
            setContentPane(MainPanel);
            setTitle("Cadastro de Usuário");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(400,300);
            setLocationRelativeTo(null);
            setVisible(true);
        cadastrarButton.addActionListener(new ActionListener() { //escutador de ação para o botao funcionar
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(CadastroUsuario.this,"Usuário cadastrado");//pop-up de usuario cadastrado
            }
        });
        jtfEmail.addFocusListener(new FocusAdapter() {//faz o texto do email sumir quando ganhar foco
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                jtfEmail.setText("");
            }
        });
        jtfEmail.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                jtfEmail.setText("example@yourdomain.com");
            }
        });
    }
        public static void main (String[] args) { //roda o app
            new CadastroUsuario();
        }
}