package poonext;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String identificador, nome, modelo, tipo;
        Produto[] p = new Produto[3];

        for (int i = 0; i < 3; i++) {
            identificador = JOptionPane.showInputDialog("Identificador");
            nome = JOptionPane.showInputDialog("Nome");
            modelo = JOptionPane.showInputDialog("Modelo");
            tipo = JOptionPane.showInputDialog("Tipo");
            
            p[i] = new Produto(identificador, nome, modelo, tipo);
        }
        
        for (Produto produto : p)
            System.out.println(produto);
    }

}
