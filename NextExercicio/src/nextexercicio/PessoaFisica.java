package nextexercicio;

public class PessoaFisica extends Cliente {

    // VARIAVEIS DE INSTANCIA
    private String cpf;

    // CONSTRUTOR
    public PessoaFisica(String nome, String telefone, String cpf) {
        super(nome, telefone);
        this.cpf = cpf;
    }

    // GETTERS AND SETTERS
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // toString
    @Override
    public String toString() {
        return String.format("PESSOA FISICA\n%sCPF: %s\n", super.toString(), this.getCpf());
    }
}
