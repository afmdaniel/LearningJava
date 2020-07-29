package aulasnext;

import javax.swing.JOptionPane;

public class Exercicios {

    public static void exercicio1() {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Entre com a base"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Entre com o expoente"));
        int resultado = 1;

        for (int i = 0; i < y; i++) {
            resultado *= x;
        }

        System.out.println(resultado);
    }

    public static void exercicio2(String[] nomes) {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static void exercicio3(int[] vetor) {
        int min = vetor[0];
        for (int e = 1; e < vetor.length; e++) {
            min = vetor[e] < min ? vetor[e] : min;
        }
        System.out.println("O menor elemento: " + min);
    }

    public static void exercicio4(int x, int y) {
        String message;
        String operationMessage = String.format("Operação entre %d e %d (# para sair)", x, y);

        menu: // rótulo da instrução
        { // pode conter as chaves ou não, é opcional!
            do {
                String option = JOptionPane.showInputDialog(operationMessage);
                switch (option) {
                    case "*":
                        message = String.format("%d * %d = %d", x, y, x * y);
                        JOptionPane.showMessageDialog(null, message);
                        break;
                    case "/":
                        float result = (float) x / y;
                        message = String.format("%d / %d = %.2f", x, y, result);
                        JOptionPane.showMessageDialog(null, message);
                        break;
                    case "+":
                        message = String.format("%d + %d = %d", x, y, x + y);
                        JOptionPane.showMessageDialog(null, message);
                        break;
                    case "-":
                        message = String.format("%d - %d = %d", x, y, x - y);
                        JOptionPane.showMessageDialog(null, message);
                        break;
                    case "#":
                        JOptionPane.showMessageDialog(null, "Encerrado");
                        break menu;
                    default:
                        JOptionPane.showMessageDialog(null, "Entre uma operação válida");
                }
            } while (true);
        }
    }

    public static void aptoVotar() {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));

        if (idade >= 16) {
            JOptionPane.showMessageDialog(null, "Você está apto para votar!");
        } else {
            JOptionPane.showMessageDialog(null, "Você não está apto para votar!");
        }

    }

    public static void aumentoSalarial() {
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
        double aumentoPercentual = Double.parseDouble(JOptionPane.showInputDialog("Porcentagem do aumento (%)"));

        double aumento = salario * aumentoPercentual / 100;
        double novoSalario = salario + aumento;

        String message = String.format("Salário antigo: R$%,.2f\nValor do aumento: R$%,.2f\nNovo salário: R$%,.2f",
                salario, aumento, novoSalario);
        JOptionPane.showMessageDialog(null, message);
    }

    public static void numerosPares() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Considere o intervalo [A,B] - Digite A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Considere o intervalo [A,B] - Digite B"));

        for (int i = a; i <= b; i++) {
            if (i > 10 && i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void somaIntervalo() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Considere o intervalo [A,B] - Digite A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Considere o intervalo [A,B] - Digite B"));
        int soma = 0;

        for (int i = a; i <= b; i++) {
            soma += i;
        }

        System.out.println("soma = " + soma);
    }

    public static int fatorial(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * fatorial(x - 1);
        }
    }

    public static void somaParte() {
        int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros vai entrar?"));
        int intervalo = qnt / 3;

        int[] numeros = new int[qnt];
        for (int i = 0; i < qnt; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre o " + (i + 1) + "º número"));
        }

        int[] soma = {0, 0, 0};

        for (int i = 0; i < intervalo; i++) {
            soma[0] += numeros[i];
        }
        for (int i = intervalo; i < 2 * intervalo; i++) {
            soma[1] += numeros[i];
        }
        for (int i = 2 * intervalo; i < qnt; i++) {
            soma[2] += numeros[i];
        }

        String saida = String.format("Soma do:\n%dº ao %dº = %d\n%dº ao %dº = %d\n%dº ao %dº = %d",
                1, intervalo, soma[0], intervalo + 1, 2 * intervalo, soma[1], 2 * intervalo + 1, qnt, soma[2]);
        JOptionPane.showMessageDialog(null, saida);
    }

    public static void aposentar() {
        char sexo;
        int idade;
        int contribuicao;

        do {
            sexo = JOptionPane.showInputDialog("Qual seu sexo? (M/F)").toUpperCase().charAt(0);
        } while (sexo != 'M' && sexo != 'F');

        do {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
        } while (idade <= 0);

        do {
            contribuicao = Integer.parseInt(JOptionPane.showInputDialog("Quanto tempo de contribuição?"));
        } while (contribuicao < 0);

        if (sexo == 'M') {
            if ((idade >= 65 && contribuicao >= 10) || (idade >= 63 && contribuicao >= 15)) {
                JOptionPane.showMessageDialog(null, "Aposentável!");
            } else {
                JOptionPane.showMessageDialog(null, "Não Aposentável!");
            }
        } else {
            if ((idade >= 63 && contribuicao >= 10) || (idade >= 61 && contribuicao >= 15)) {
                JOptionPane.showMessageDialog(null, "Aposentável!");
            } else {
                JOptionPane.showMessageDialog(null, "Não Aposentável!");
            }
        }
    }

    public static void somaPartesPares() {
        int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros vai entrar?"));
        int intervalo = qnt / 2;

        int[] numeros = new int[qnt];
        for (int i = 0; i < qnt; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre o " + (i + 1) + "º número"));
        }

        int[] soma = {0, 0};

        for (int i = 0; i < intervalo; i++) {
            if (numeros[i] % 2 == 0) {
                soma[0] += numeros[i];
            }
        }

        for (int i = intervalo; i < qnt; i++) {
            if (numeros[i] % 2 == 0) {
                soma[1] += numeros[i];
            }
        }

        String saida = String.format("Soma dos números pares\n%dº ao %dº = %d\n%dº ao %dº = %d",
                1, intervalo, soma[0], intervalo + 1, qnt, soma[1]);

        JOptionPane.showMessageDialog(null, saida);
    }

    public static void aprovador() {
        double[] notas = new double[3];
        double soma = 0;

        for (int i = 0; i < 3; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Entre a " + (i + 1) + "ª nota"));
            soma += notas[i];
        }

        double media = soma / 3;

        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "Média = " + media + "\n O aluno passou por média!");
        } else if (media >= 5) {
            JOptionPane.showMessageDialog(null, "Média = " + media + "\n O aluno está na final!");
        } else {
            JOptionPane.showMessageDialog(null, "Média = " + media + "\n O aluno está reprovado!");
        }
    }

    public static void precoTotal() {
        int total = 0;
        int qtd = 0;
        String codigo;

        compra:
        {
            while (true) {
                codigo = JOptionPane.showInputDialog("Codigo do produto (0 para sair): ");
                if (!(codigo.equals("0"))) {
                    qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
                }

                switch (codigo) {
                    case "856":
                        total += 6.98 * qtd;
                        break;
                    case "321":
                        total += 8.6 * qtd;
                        break;
                    case "475":
                        total += 4.2 * qtd;
                        break;
                    case "665":
                        total += 11.25 * qtd;
                        break;
                    case "587":
                        total += 9.99 * qtd;
                        break;
                    case "0":
                        JOptionPane.showMessageDialog(null, "Compra Finalizada. Valor total: R$" + total);
                        break compra;
                    default:
                        JOptionPane.showMessageDialog(null, "Código inválido");

                }
            }
        }
    }

}
