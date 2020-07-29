package model;

public class Gerente extends Funcionario {
    // CONSTRUTOR
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    
    // METODOS IMPLEMENTADOS
    @Override
    public void aumentaSalario() {
        this.setSalario(this.getSalario()*(1 + 0.1));
    }
    
    // toString
    @Override
    public String toString() {
        return String.format("Gerente: %s\nSalário atual: R$%.2f", this.getNome(), this.getSalario());
    }
    
}
