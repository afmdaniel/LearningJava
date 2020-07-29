package daniel;

import java.util.Scanner;

public class AssertTest {

    public static void run() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 10: ");
        int number = input.nextInt();
        
        // afirma que o valor é >= 0 e <= 10
        // Deve ser ativado explicitamento ao executar o programa
        assert (number >= 0 && number <= 10) : "bad number" + number;
        
        System.out.printf("You entered %d\n", number);
    }
}
