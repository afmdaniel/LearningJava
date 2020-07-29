package classesabstratasnext;

public class AutoManual extends Automovel implements NewInterface {

    // CONSTRUTOR
    public AutoManual(String cor, String construtora) {
        super(cor, construtora);
        this.setCambio("Manual");
    }

    // METODOS ABSTRATOS IMPLEMENTADOS
    @Override
    public void passarMarcha() {
        switch (this.getMarcha()) {
            case 'R':
            case 'N':
                this.setMarcha('1');
                System.out.println("1ª marcha engatada");
                break;
            case '1':
                this.setMarcha('2');
                System.out.println("2ª marcha engatada");
                break;
            case '2':
                this.setMarcha('3');
                System.out.println("3ª marcha engatada");
                break;
            case '3':
                this.setMarcha('4');
                System.out.println("4ª marcha engatada");
                break;
            case '4':
                this.setMarcha('5');
                System.out.println("5ª marcha engatada");
                break;
            case '5':
                System.out.println("Já está na última marcha!");
                break;
        }
    }

    @Override
    public void voltarMarcha() {
        switch (this.getMarcha()) {
            case 'R':
            case 'N':
                System.out.println("Marcha neutra engatada.");
                break;
            case '1':
                this.setMarcha('N');
                System.out.println("Marcha neutra engatada.");
                break;
            case '2':
                this.setMarcha('1');
                System.out.println("1ª marcha engatada");
                break;
            case '3':
                this.setMarcha('2');
                System.out.println("2ª marcha engatada");
                break;
            case '4':
                this.setMarcha('3');
                System.out.println("3ª marcha engatada");
                break;
            case '5':
                this.setMarcha('4');
                System.out.println("4ª marcha engatada");
                break;
        }
    }

    @Override
    public void marchaRe() {
        this.setMarcha('R');
        System.out.println("Marcha ré engatada");
    }

    @Override
    public void marchaNeutra() {
        this.setMarcha('N');
        System.out.println("Marcha neutra engatada");
    }

}
