package nextexercicio;

public class Main {

    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[3];
        
        clientes[0] = new Cliente("Daniel", "9####-####");
        clientes[1] = new PessoaFisica("Daniel", "9####-####", "CPF");
        clientes[2] = new PessoaJuridica("Daniel", "9####-####", "CNPJ", "Razao Social", "Nome Fantasia");
    
        System.out.println(clientes[0]);
        System.out.println(clientes[1]);
        System.out.println(clientes[2]);
    }
    
}
