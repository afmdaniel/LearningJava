package consultadecredito;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CreditInquiry {

    private final static MenuOption[] choices = MenuOption.values();

    public static void main(String[] args) {
        // obtém a solicitação do usuário
        MenuOption accountType = getRequest();

        while (accountType != MenuOption.END) {
            switch (accountType) {
                case ZERO_BALANCE:
                    JOptionPane.showMessageDialog(null, readRecords(accountType),
                            "Accounts with zero balances", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case CREDIT_BALANCE:
                    JOptionPane.showMessageDialog(null, readRecords(accountType),
                            "Accounts with credit balances", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case DEBIT_BALANCE:
                    JOptionPane.showMessageDialog(null, readRecords(accountType),
                            "Accounts with debit balances", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

            accountType = getRequest();
        }
    }

    // obtém solicitação do usuário
    private static MenuOption getRequest() {
        int request;
        String message = String.format("\nEnter request:\n%s\n%s\n%s\n%s\n",
                " 1 - List accounts with zero balances",
                " 2 - List accounts with credit balances",
                " 3 - List accounts with debit balances",
                " 4 - Terminate program.\n");

        // exibe opções de solicitação
        try {
            do {
                request = Integer.parseInt(JOptionPane.showInputDialog(message));
            } while ((request < 1) || (request > 4));
        } catch (NumberFormatException e) {
            request = 4;
            JOptionPane.showMessageDialog(null, "Invalid input. Terminanting.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return choices[request - 1];
    }

    // lê registros de arquivo e recebe somente os registros do tipo apropriado
    private static String readRecords(MenuOption accountType) {
        String accounts = "";
        // abre o arquivo e processa o conteúdo
        try (Scanner input = new Scanner(Paths.get("clients.txt"))) { // try com recurso fecha o recurso ao sair do bloco
            while (input.hasNext()) {
                int accountNumber = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();
                
                // se o tipo for a conta adequada, exibe o registro
                if (shouldDisplay(accountType, balance))
                    accounts += String.format("%-10d%-12s%-12s%10.2f\n", 
                            accountNumber, firstName, lastName, balance);
                else
                    input.nextLine(); // descarta o restante do registro atual
            }
        } catch (NoSuchElementException
                | IllegalStateException | IOException e) {
            JOptionPane.showMessageDialog(null, e.getStackTrace(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        
        return accounts;
    }

    // utiliza o tipo de registro para determinar se registro deve ser exibido
    private static boolean shouldDisplay(MenuOption accountType, double balance) {
        if ((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0))
            return true;
        else if ((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0))
            return true;
        else if ((accountType == MenuOption.ZERO_BALANCE) && (balance == 0))
            return true;
        
        return false;
    }

}
