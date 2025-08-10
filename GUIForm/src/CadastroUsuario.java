import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CadastroUsuario extends JFrame {
    private JLabel jlEmail;
    private JTextField tfEmail;
    private JLabel jlSenha;
    private JButton cadastrarButton;
    private JPanel MainPanel;
    private JTextField tfSenha;

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
                if (tfSenha.getText().equals("") || //tratamento de campo vazio
                        tfEmail.getText().equals("") ||
                        tfSenha.getText().equals("Your Password") ||
                        tfEmail.getText().equals("example@yourdomain.com")) {
                    JOptionPane.showMessageDialog(CadastroUsuario.this, "Os campos não podem estar vazios");//pop-up de campos vazios
                }else{
                    JOptionPane.showMessageDialog(CadastroUsuario.this,"Usuário cadastrado");//pop-up de usuario cadastrado
                }
            }
        });
        tfEmail.addFocusListener(new FocusAdapter() {//faz o texto do campo email sumir quando ganhar foco
            @Override
            public void focusGained(FocusEvent e) {
                if(tfEmail.getText().equals("example@yourdomain.com")) {// faz com que oq for digitado pelo usuario nao seja apagado
                    super.focusGained(e);
                    tfEmail.setText("");
                }
            }
        });
        tfEmail.addFocusListener(new FocusAdapter() {//faz o texto do campo email voltar quando perder foco
            @Override
            public void focusLost(FocusEvent e) {
                if(tfEmail.getText().equals("")) {// faz com que oq for digitado pelo usuario nao seja apagado
                    super.focusLost(e);
                    tfEmail.setText("example@yourdomain.com");
                }
            }
        });
        tfSenha.addFocusListener(new FocusAdapter() {//faz o texto do campo senha sumir quando ganhar foco
            @Override
            public void focusGained(FocusEvent e) {
                if(tfSenha.getText().equals("Your Password")) {// faz com que oq for digitado pelo usuario nao seja apagado
                    super.focusGained(e);
                    tfSenha.setText("");
                }
            }
        });
        tfSenha.addFocusListener(new FocusAdapter() {//faz o texto do campo senha voltar quando perder foco
            @Override
            public void focusLost(FocusEvent e) {
                if(tfSenha.getText().equals("")) {// faz com que oq for digitado pelo usuario nao seja apagado
                    super.focusLost(e);
                    tfSenha.setText("Your Password");
                }
            }
        });

    }
        public static void main (String[] args) { //roda o app
            new CadastroUsuario();
        }
}