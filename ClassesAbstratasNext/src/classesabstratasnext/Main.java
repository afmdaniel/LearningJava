package classesabstratasnext;

public class Main {

    public static void main(String[] args) {
        Automovel carro1 = new AutoManual("Azul", "Ford");
        Automovel carro2 = new AutoAutomatico("Preto", "GM");
        
        /*
        System.out.println(carro1.getCambio() + " : " + carro1.getMarcha());
        System.out.println(carro2.getCambio() + " : " + carro2.getMarcha());
        
        carro1.passarMarcha();
        carro2.passarMarcha();
        
        System.out.println(carro1.getCambio() + " : " + carro1.getMarcha());
        System.out.println(carro2.getCambio() + " : " + carro2.getMarcha());
        */

        AutoManual copia1 = (AutoManual) carro1;
        copia1.metodo();
    }
    
}
