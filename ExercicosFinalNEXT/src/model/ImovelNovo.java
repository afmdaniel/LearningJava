package model;

public class ImovelNovo extends Imovel{

    public ImovelNovo(String endereco, double preco) {
        super(endereco, preco);
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco * 1.10;
    }
    
    
    
    
}
