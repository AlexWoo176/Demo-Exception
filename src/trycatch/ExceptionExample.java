package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int dividend, divisor, quotient;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the Dividend: ");
            dividend = scanner.nextInt();

            System.out.println("Enter the Divisor: ");
            divisor = scanner.nextInt();

            quotient = dividend / divisor;
            System.out.println("Quoctient = " + quotient);
        }
        catch (ArithmeticException ex) {
            System.out.println("Exception: " + ex.toString());
        }
        catch (InputMismatchException ex) {
            System.out.println("Exception: " + ex.toString());
        }
    }
}
