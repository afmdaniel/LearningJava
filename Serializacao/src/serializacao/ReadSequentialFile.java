package serializacao;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile {

    private static ObjectInputStream input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    // permite que o usuario selecione o arquivo a abrir
    public static void openFile() {
        try { // abre o arquivo
            input = new ObjectInputStream(Files.newInputStream(Paths.get("clients.ser")));
        } catch (IOException e) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    }

    // lê o registro no arquivo
    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s\n", "Account", "First Name", "Last Name", "Balance");

        try {
            while (true) { // vai para quando der EOF, ira pra o bloco catch correspondente e saíra da função
                Account record = (Account) input.readObject();

                // exibe o conteúdo de registo
                System.out.printf("%-10d%-12s%-12s%10.2f\n",
                        record.getAccount(), record.getFirstName(),
                        record.getLastName(), record.getBalance());
            }
        } catch (EOFException e) {
            System.out.printf("\nNo more records\n");
        } catch (ClassNotFoundException e) {
            System.err.println("Invalid object type. Terminating.");
        } catch (IOException e) {
            System.err.println("Error reading from file. Terminating");
        }
    }

    public static void closeFile() {
        try {
            if (input != null)
                input.close();
        } catch (IOException e) {
            System.err.println("Error closing file. Terminating.");
            System.exit(1);
        }
    }
}
