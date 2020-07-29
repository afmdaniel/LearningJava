package model;

public class Programador extends Funcionario {

    // CONSTRUTOR
    public Programador(String nome, double salario) {
        super(nome, salario);
    }
    
    // METODOS IMPLEMENTADOS
    @Override
    public void aumentaSalario() {
        this.setSalario(this.getSalario()*(1 + 0.2));
    }
    
    // toString
    @Override
    public String toString() {
        return String.format("Programador: %s\nSalário atual: R$%.2f", this.getNome(), this.getSalario());
    }
    
    
}
