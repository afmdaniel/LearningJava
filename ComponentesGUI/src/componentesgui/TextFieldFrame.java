package componentesgui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {

    private final JTextField textField;
    private final JLabel[] labelField = new JLabel[2];
    private final JPasswordField passwordField;

    public TextFieldFrame() {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        // Cria label de Login
        labelField[0] = new JLabel("Login: ");
        add(labelField[0]);

        // Cria campo de texto com 10 colunas
        textField = new JTextField(10);
        add(textField);

        // Cria label de Senha
        labelField[1] = new JLabel("Senha:");
        add(labelField[1]);

        // Cria campo de senha com texto padrão
        passwordField = new JPasswordField(10);
        add(passwordField);

        // Rotinas de tratamento de eventos registradoras
        TextFieldHandler handler = new TextFieldHandler();
        // Registra handler como rotina de tratamento de evento de cada campo
        textField.addActionListener(handler);
        passwordField.addActionListener(handler);

    }

    // INTERFACE OUVINTE DO EVENTO
    private class TextFieldHandler implements ActionListener {

        // ActionEvent - classe que reprensenta um evento
        // actionPerformed de ActionListener - rotina de tratamento apropriada
        @Override
        public void actionPerformed(ActionEvent e) { // Acionado qnd aperta ENTER
            String string = "";
            // Fechar janela de login
            setVisible(false);

            String usuario = textField.getText();
            String senha = passwordField.getText();

            // Usuário pressionou ENTER no JTextField textField[0]
            if (e.getSource() == textField || e.getSource() == passwordField) {
                if (usuario.equals("Daniel")) {
                    if (senha.equals("Daniel21")) {
                        JOptionPane.showMessageDialog(null, "Entrou no sistema!", "Usuário: " + usuario,
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha Incorreta!", "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário Inválido!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }

            // mostrar janela de login
            setVisible(true);
        }
    } // fim da classe TextFiledHandler interna private
} // fim da classe TextFieldFrame
