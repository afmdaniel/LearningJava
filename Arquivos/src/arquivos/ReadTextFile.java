package arquivos;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
    private static Scanner input;
    
    public static void run(){
        openFile();
        readRecords();
        closeFile();
    }
    
    // abre o arquivo clients.txt
    public static void openFile(){
        try {
            input = new Scanner(Paths.get("clients.txt"));
        } catch (IOException e) {
            System.err.println("Error opening file. Terminanting.");
        }
    }
    
    // lê o registro no arquivo
    public static void readRecords(){
        System.out.printf("%-10s%-12s%-12s%10s\n", "Account", "First Name",
                "Last Name", "Balance");
        
        try {
            while (input.hasNext()) {
                System.out.printf("%-10d%-12s%-12s%10.2f\n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            }
        } catch (NoSuchElementException e) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException e) {
            System.err.println("Erro reading from file. Terminating.");
        }
    }
    
    public static void closeFile(){
        if (input != null)
            input.close();
    }
}
