package aulasnext;

import javax.swing.JOptionPane;

public class Soma {
    public static void run(){
        int a;
        int b;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor"));
        
        String message = String.format("%d + %d = %d", a, b, soma(a,b));
        
        JOptionPane.showMessageDialog(null, message);
    }
    
    public static int soma(int a, int b){
        return a + b;
    }
}
