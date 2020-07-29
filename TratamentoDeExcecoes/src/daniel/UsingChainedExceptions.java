package daniel;

public class UsingChainedExceptions {
    public static void run(){
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    
    // chama method2; lança exceção de volta pra run
    public static void method1() throws Exception{
        try{
            method2();
        } catch (Exception e) {
            throw new Exception("Exception thrown in method1", e);
        } 
    }
    
    //chama method3; lança exceções de volta para method1
    public static void method2() throws Exception{
        try {
            method3();
        } catch (Exception e) {
            throw new Exception("Exception throw in method2", e);
        }
    }
    
    // lança Exception de volta para method2;
    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
}
