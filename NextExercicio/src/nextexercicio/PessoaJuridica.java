package nextexercicio;

public class PessoaJuridica extends Cliente {

    // VARIAVEIS DE INSTANCIA
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    // CONSTRUTOR
    public PessoaJuridica(String nome, String telefone, String cnpj, String razaoSocial, String nomeFantasia) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    // GETTERS AND SETTERS
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    // toString
    @Override
    public String toString() {
        return String.format("PESSOA JURIDICA\n%sCNPJ: %s\nRazão Social: %s\nNome Fantasia: %s\n",
                super.toString(), this.getCnpj(), this.getRazaoSocial(), this.getNomeFantasia());
    }

}
