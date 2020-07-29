package javaapplication7;

import javax.swing.JOptionPane;

public class JavaApplication7 {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        String message = String.format("Sua idade é %d", a);
        JOptionPane.showMessageDialog(null, message);
    }
    
}
