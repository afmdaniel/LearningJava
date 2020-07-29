package model;

public class ContaCorrente {
    private String conta;
    private double saldo;
    private double taxaDeOperacao;

    public ContaCorrente(String conta) {
        this.conta = conta;
        this.saldo = 0;
        this.taxaDeOperacao = 0.05;
    }
    
    public void obterSaldo(){
        System.out.printf("Conta: %s\nSaldo atual: %.2f\n\n", this.getConta(), this.getSaldo());
    }
    
    public void depositar(double valorDepositado){
        this.setSaldo(this.getSaldo() + valorDepositado);
        System.out.println("Valor depositado com sucesso!");
        this.obterSaldo();
    }

    public void sacar(double valorSacado){
        if (this.getSaldo() >= (valorSacado * (1 + this.taxaDeOperacao))) {
            this.setSaldo(this.getSaldo() - (valorSacado * (1 + this.taxaDeOperacao)));
            System.out.println("Valor sacado com sucesso!");
            this.obterSaldo();
        } else {
            System.out.println("Você não tem saldo suficiente");
            this.obterSaldo();
        }
    }
    
    
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    protected void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
    
    
}
