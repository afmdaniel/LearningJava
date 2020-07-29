package componentesgui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        Toolkit tk;
        tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(350,100);
        textFieldFrame.setVisible(true);
    }

}
