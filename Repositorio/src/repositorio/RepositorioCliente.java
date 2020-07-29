package repositorio;

public class RepositorioCliente {
    // VARIÁVEIS DE INSTÂNCIA
    private final int MAX_CLIENTES;
    private int indice;
    private Clientes[] cliente;
    
    // CONSTRUTOR
    public RepositorioCliente(int MAX_CLIENTES) {
        this.MAX_CLIENTES = MAX_CLIENTES;
        cliente = new Clientes[this.MAX_CLIENTES];
        indice = 0;
    }
    
    // METODOS DE INSTANCIA
    public void adicionarCliente(Clientes c){
        if (indice < this.MAX_CLIENTES){
            this.cliente[indice] = c;
            indice++;
        } else {
            System.out.println("Número máximo de clientes excedidos!");
        }
    }
    
    public void removerCliente(Clientes c){
        int i = buscar(c);
        if (i != -1) {
            this.cliente[i] = this.cliente[indice - 1];
            this.cliente[indice - 1] = null;
            this.indice--;
        } else {
            System.out.println("Cliente não consta no repositório");
        }
        
    }
    
    // busca o cpf do cliente e retorna seu indice vetor cliente
    private int buscar(Clientes c){
        for (int i = 0; i < this.indice; i++) {
            if (this.cliente[i].getCpf().equals(c.getCpf())) {
                return i;
            }
        }
        return -1;
    }
    
    public void atualizar(Clientes c){
        int i = buscar(c);
        if (i != -1) {
            this.cliente[i] = c;
            System.out.println("Cliente atualizado com sucesso");
        } else {
            System.out.println("Cliente não consta na lista");
        }
    }

    public Clientes maiorSaldo(){
        // atribuo o maior saldo ao primeiro cliente
        Clientes maiorSaldo = this.cliente[0];
        
        // verifico, a partir do segundo cliente, se o saldo dele é maior que o saldo do cliente "menorSaldo"
        for (int i = 1; i < this.indice; i++){
            // se o saldo do cliente atual for maior do que o do cliente "menorSaldo"
            if (this.cliente[i].getSaldo() > maiorSaldo.getSaldo())
                // atribuo ao "menorSaldo" o cliente atual
                maiorSaldo = this.cliente[i]; 
        }
        // retorno o objeto Clientes
        return maiorSaldo;
    }
    
    public Clientes menorSaldo(){
        // atribuo o menor saldo ao primeiro cliente
        Clientes menorSaldo = this.cliente[0];
        
        // verifico, a partir do segundo cliente, se o saldo dele é menor que o saldo do cliente "menorSaldo"
        for (int i = 1; i < this.indice; i++){
            // se o saldo do cliente atual for menor do que o do cliente "menorSaldo"
            if (this.cliente[i].getSaldo() < menorSaldo.getSaldo())
                // atribuo ao "menorSaldo" o cliente atual
                menorSaldo = this.cliente[i]; 
        }
        // retorno o objeto Clientes
        return menorSaldo;
    }
    
    @Override
    public String toString() {
        String saida = "";
        for (int i = 0; i < indice; i++){
            saida += (cliente[i].toString());
        }
        
        return saida;
    }
    
    
    
    
    
    
    
    
}
