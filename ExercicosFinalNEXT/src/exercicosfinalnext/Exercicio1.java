package exercicosfinalnext;

import javax.swing.JOptionPane;

public class Exercicio1 {
        
    public static void run(){
        double valorASerFinanciado;
        double taxaDeJurosAoMes;
        int tempoEmMeses;
        
       valorASerFinanciado = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser financiado"));
       taxaDeJurosAoMes = Double.parseDouble(JOptionPane.showInputDialog("Taxa de juros ao mes"));
       tempoEmMeses = Integer.parseInt(JOptionPane.showInputDialog("Tempo total em meses"));
       
       double valorDaParcela = valorASerFinanciado / tempoEmMeses;
       double totalPago = 0;
       
       for (int i = 1; i <= tempoEmMeses; i++){
           double valorNoMes = valorDaParcela * Math.pow(1 + taxaDeJurosAoMes, i);
           totalPago += valorNoMes;
           System.out.printf("%dº mês: %.2f\n", i, valorNoMes);
       }
       
        System.out.printf("\nValor total pago: %.2f\n", totalPago);
    }
}
