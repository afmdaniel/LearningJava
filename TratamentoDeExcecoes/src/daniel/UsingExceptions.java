package daniel;

public class UsingExceptions {

    public static void run() {
        
        try {
            throwException();
        } catch (Exception e) { // aqui é tratada a exceção lançada no bloco catch de throwException
            System.err.println(e);
        }
        
        
        // doesNotThrowException();
    }

    public static void throwException() throws Exception {
        try {
            System.out.println("Method throwException");
            throw new Exception(); // gera a exceção
        } catch (Exception e) {
            System.err.println("Exception handled in method throwException");
            throw new ArithmeticException("Estou aqui"); // lança novamente para processamento adicional
            
            // o código aqui não seria alcançado; poderia causar erros de compilação
        } finally { // executa independente do que acontece em try...catch
            System.err.println("Finally executed in throwException");
        }
        
        // o código aqui não seria alcançado; poderia causar erros de compilação
    }
    
    // demonstra finally quando nenhuma exceção ocorrer
    public static void doesNotThrowException(){
        try {
            System.out.println("Method doesNotThrowException");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            System.err.println("finally executed in doesNotThrowException");
        }
        
        System.out.println("End of method doesNotThrowException");
    }
    
}
