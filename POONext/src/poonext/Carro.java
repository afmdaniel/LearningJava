package poonext;

public class Carro {
    // ATRIBUTOS
    private final String tipoDeCambio;
    private final String cor;
    private final String fabricante;

    // CONSTRUTOR
    public Carro(String tipoDeCambio, String cor, String fabricante) {
        this.tipoDeCambio = tipoDeCambio;
        this.cor = cor;
        this.fabricante = fabricante;
    }
    
    // GETTERS AND SETTERS (nao vai ter setter porque os atributos sao finais)
    public String getTipoDeCambio() {
        return tipoDeCambio;
    }

    public String getCor() {
        return cor;
    }

    public String getFabricante() {
        return fabricante;
    }
    
    // METODOS DE INSTANCIA
    public void freiar(){
        System.out.println("Diminuindo a velocidade!");
    }
    
    public void virar(){
        System.out.println("Virando o volante!");
    }
    
    public void acelerar(){
        System.out.println("Aumentando a velocidade!");
    }
}
