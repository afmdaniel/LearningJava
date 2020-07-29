package model;

public class ContaCorrenteEspecial extends ContaCorrente {

    public ContaCorrenteEspecial(String conta) {
        super(conta);
        this.setTaxaDeOperacao(0.01);
    }
}
