package classesabstratasnext;

public class AutoAutomatico extends Automovel {
    // CONSTRUTOR
    public AutoAutomatico(String cor, String construtora) {
        super(cor, construtora);
        this.setCambio("Automático");
    }

    // METODOS ABSTRATOS IMPLEMENTADOS
    @Override
    public void passarMarcha() {
        this.setMarcha('D');
        System.out.println("Drive(D) engatado");
    }

    @Override
    public void voltarMarcha() {
        switch (this.getMarcha()){
            case 'P':
            case 'N':
                this.setMarcha('P');
                System.out.println("Parar(P) engatado");
                break;
            case 'D':
                this.setMarcha('N');
                System.out.println("Neutro(N) engatado");
                break;
        }
    }

    @Override
    public void marchaRe() {
        this.setMarcha('R');
        System.out.println("Ré engatada");
    }

    @Override
    public void marchaNeutra() {
        this.setMarcha('N');
        System.out.println("Marcha neutra (N) engatada");
    }
    
    
    
}
