package model;

public class Pessoa {
    
    // VARIAVEIS DE INSTANCIA
    private String nome;
    private int anoDeNascimento;
    
    // CONSTRUTOR
    public Pessoa(String nome, int anoDeNascimento) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
    }
    
    public void idade(){
        int idade = 2019 - this.anoDeNascimento;
        System.out.printf("%s tem %d anos\n", this.nome, idade);
    }
    
}
