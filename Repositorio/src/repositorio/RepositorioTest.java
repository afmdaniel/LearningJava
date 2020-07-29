package repositorio;

import javax.swing.JOptionPane;

public class RepositorioTest {

    public static void main(String[] args) {
        int numClientes;
        numClientes = Integer.parseInt(JOptionPane.showInputDialog("Quantos clientes deseja cadastrar?"));
        
        Clientes[] clientes = new Clientes[numClientes];
        
        for (int i = 0; i < numClientes; i++) {
            String validarCPF = "[0-9]{11}";
            String validarNome = "[A-Z][a-z]+\\s*(([A-Z][a-z]+\\s*)|([a-z]*\\s*))*";

            String cpf;
            do {
                cpf = JOptionPane.showInputDialog("Digite o CPF do " + (i+1) + "º cliente");
                if (!cpf.matches(validarCPF)) {
                    JOptionPane.showMessageDialog(null, "Digite um CPF válido.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } while (!cpf.matches(validarCPF));

            String nome;
            do {
                nome = JOptionPane.showInputDialog("Digite o nome do " + (i+1) + "º cliente");
                if (!nome.matches(validarNome)) {
                    JOptionPane.showMessageDialog(null, "Digite um nome válido.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } while (!nome.matches(validarNome));

            double saldo;
            do {
                try {
                    saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo do " + (i+1) + "º cliente"));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite um saldo válido.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } while (true);
            
            clientes[i] = new Clientes(cpf, nome, saldo);
        }
        
        RepositorioCliente rep = new RepositorioCliente(numClientes);
        
        for (Clientes c : clientes) {
            rep.adicionarCliente(c);
        }

        JOptionPane.showMessageDialog(null, rep,
                "CLIENTES", JOptionPane.INFORMATION_MESSAGE);
       
        JOptionPane.showMessageDialog(null, rep.maiorSaldo(),
                "CLIENTE COM MAIOR SALDO", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, rep.menorSaldo(),
                "CLIENTE COM MENOR SALDO", JOptionPane.INFORMATION_MESSAGE);
         
    }

}
