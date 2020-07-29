package model;

public abstract class Imovel {
    private String endereco;
    protected double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.setPreco(preco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void setPreco(double preco);
    
    
    
}
