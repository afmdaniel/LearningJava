package consultadecredito;

public enum MenuOption { 
    // declara o conteúdo do tipo enum
    ZERO_BALANCE(1),  // clientes que não devem nada
    CREDIT_BALANCE(2),// cliente que devem ser pagos
    DEBIT_BALANCE(3), // clientes que devem pagar
    END(4);
    
    private final int value;

    // CONSTRUTOR
    private MenuOption(int value) {
        this.value = value;
    }
    
    
    
}
