package nextexercicio;

public class Cliente {

    // VARIAVEIS DE INSTANCIA
    private String nome;
    private String telefone;

    // CONSTRUTOR
    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        if (this instanceof PessoaFisica || this instanceof PessoaJuridica) {
            return String.format("Nome: %s\nTelefone: %s\n", this.getNome(), this.getTelefone());
        }
            return String.format("CLIENTE\nNome: %s\nTelefone: %s\n", this.getNome(), this.getTelefone());
    }
}
