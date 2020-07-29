package poonext;

public class Produto {
    private final String identificador;
    private final String nome;
    private final String modelo;
    private final String tipo;
    private static int cont = 1;
    private final int prod;
    
    // CONSTRUTOR
    public Produto(String identificador, String nome, String modelo, String tipo) {
        this.identificador = identificador;
        this.nome = nome;
        this.modelo = modelo;
        this.tipo = tipo;
        this.prod = cont;
        cont++;
    }

    @Override
    public String toString() {
        String message = String.format("PRODUTO %d\nIdentificador: %s\nNome: %s\nModelo: %s\nTipo: %s\n", prod, identificador, nome, modelo, tipo);
        return message;
    }
    
    
}
