package exercicosfinalnext;

import javax.swing.JOptionPane;
import model.Funcionario;
import model.Gerente;
import model.Programador;

public class Exercicio2 {

    public static void run() {
        Funcionario f1 = new Gerente("Daniel", 5000);
        Funcionario f2 = new Programador("Danielzinho", 2000);

        janela:
        do {
            int opcao = menu();
            switch (opcao) {
                case 1:
                    opcao = acao();
                    switch (opcao) {
                        case 1:
                            System.out.println(f1);
                            break;
                        case 2:
                            f1.aumentaSalario();
                            break;
                    }
                    break;
                case 2:
                    opcao = acao();
                    switch (opcao) {
                        case 1:
                            System.out.println(f2);
                            break;
                        case 2:
                            f2.aumentaSalario();
                            break;
                    }
                    break;
                default:
                    break janela;
            }
        } while (true);
    
    }

    private static int acao() {
        String message = String.format("1 - Imprimir Dados\n2 - Aumentar Salário");
        int opcao = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(message));
        } while (opcao != 1 && opcao != 2);

        return opcao;
    }

    private static int menu() {
        String message = String.format("1 - Gerente\n2 - Programador\n0 - Sair");
        int opcao = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(message));
        } while (opcao != 0 && opcao != 1 && opcao != 2);

        return opcao;
    }
}
