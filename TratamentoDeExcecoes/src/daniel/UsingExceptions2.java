package daniel;

public class UsingExceptions2 {

    public static void run() {
        try {
            method1();
        } catch (Exception e) {
            System.err.printf("%s\n\n", e.getMessage());
            e.printStackTrace();
            
            
            /*
            // obtém informações sobre o rastreamente da pilha
            // todo StackTraceElement representa uma chamada de método da pilha de chamadas de método
            StackTraceElement[] traceElements = e.getStackTrace();
            
            System.out.printf("\nStack trace from getStackTrace():\n");
            System.out.println("Class\t\t\tFile\t\t\tLine\tMethod");
            
            // faz um loop por traceElements para obter a descrição da exceção
            for (StackTraceElement element: traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s\n", element.getMethodName());
            }
            */
        }
    }
    
    // chama method2; lança execeções de volta pro run
    public static void method1() throws Exception{
        method2();
    }
    
    // chama method3; lança exceções de volta para method2
    public static void method2() throws Exception {
        method3();
    }
    
    // lança Exception de volta para method2
    public static void method3() throws Exception{
        throw new Exception("Exception thrown in method3");
    }
}
