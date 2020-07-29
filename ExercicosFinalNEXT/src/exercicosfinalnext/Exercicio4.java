package exercicosfinalnext;

import model.ContaCorrente;
import model.ContaCorrenteEspecial;

public class Exercicio4 {
    
    public static void run(){
    ContaCorrente conta1 = new ContaCorrente("1");
    ContaCorrente conta2 = new ContaCorrenteEspecial("2");
    
    conta1.obterSaldo();
    conta2.obterSaldo();
    
    conta1.depositar(1000);
    conta2.depositar(5000);
    
    conta1.sacar(100);
    conta2.sacar(100);
    
    conta1.sacar(900);
    conta2.sacar(4899);
    }
}
