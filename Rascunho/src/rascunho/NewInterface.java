package rascunho;

public interface NewInterface {
    
    static void metodoStatic(){
        System.out.println("Estou aqui");
    }
    
    default void metodoDefault() {
        System.out.println("Agora estou aqui!");
    }
}
