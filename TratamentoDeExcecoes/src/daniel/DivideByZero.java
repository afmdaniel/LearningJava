package daniel;

import javax.swing.JOptionPane;

public class DivideByZero {

    public static void run() {
        int numerator;
        int denominator;
        int result;

        do {
            try {
                numerator = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer numerator:"));
                denominator = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer denominator:"));

                result = quotient(numerator, denominator);

                break;
            } catch (NumberFormatException e) {
                System.err.printf("\nException: %s\n", e);
                System.out.printf("You must enter a valid number. Please, try again.\n\n");
            } catch (ArithmeticException e) {
                System.err.printf("\nException: %s\n", e);
                System.out.printf("Zero is an invalid denominator. Please try again.\n\n");
            }
        } while (true);

        System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
    }

    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }
}
