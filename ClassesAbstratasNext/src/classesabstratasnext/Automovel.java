package classesabstratasnext;

public abstract class Automovel {
    // VARIAVEIS DE INSTANCIA
    private String cambio;
    private String cor;
    private final String construtora;
    private char marcha;
    
    // CONSTRUTOR
    public Automovel(String cor, String construtora) {
        this.cor = cor;
        this.construtora = construtora;
        this.marcha = 'N'; 
    }
    
    // METODOS ABSTRATOS
    public abstract void passarMarcha();
    
    public abstract void voltarMarcha();
    
    public abstract void marchaRe();
    
    public abstract void marchaNeutra();
    
    // GETTERS AND SETTERS
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getConstrutora() {
        return construtora;
    }

    public String getCambio() {
        return cambio;
    }
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public void setMarcha(char marcha) {
        this.marcha = marcha;
    }
    public char getMarcha() {
        return marcha;
    }
    
    
}
