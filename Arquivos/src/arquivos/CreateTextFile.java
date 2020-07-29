package arquivos;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {

    private static Formatter output; // envia uma saída de texto pra um arquivo

    public static void run() {
        openFile();
        addRecord();
        closeFile();
    }

    // abre o arquivo clients.txt
    public static void openFile() {
        try {
            output = new Formatter("clients.txt"); // abre arquivo
        } catch (SecurityException e) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException e) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    // adiciona registros ao arquivo
    public static void addRecord() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s\n%s\n? ",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");

        while (input.hasNext()) {
            try {
                // gera saida de novo registro para o arquivo; supõe válida a entrada
                output.format("%d %s %s %.2f\n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            } catch (FormatterClosedException e) {
                System.err.println("Error writing to file. Terminating.");
                break;
            } catch (NoSuchElementException e){
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // descarta entrada do usuario para entrar de novo
            }
            
            System.out.print("? ");
        }
    }
    
    public static void closeFile() {
        if (output != null)
            output.close();
    }
}
