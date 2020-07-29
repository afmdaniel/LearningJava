package repositorio;

public class Clientes {
    // VARIAVEIS DE INSTANCIA
    private final String cpf;
    private final String nome;
    private double saldo;
    
    // CONSTRUTOR
    public Clientes(String cpf, String nome, double saldo) {
        this.cpf = cpf;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    // GETTERS AND SETTERS
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // toString
    @Override
    public String toString() {
        String formatoCPF = String.format("%s.%s.%s-%s",
                this.getCpf().substring(0, 3), this.getCpf().substring(3,6),
                this.getCpf().substring(6, 9), this.getCpf().substring(9));
        
        return String.format("\nCPF: %s\nNome: %s\nSaldo: R$%.2f\n",
                formatoCPF, this.getNome(), this.getSaldo());
    }
}
