package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDivision {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        try {
            int dividendo;
            int divisor;
            int resul;

            System.out.println("Digite dividendo: ");
            dividendo = leia.nextInt();
            System.out.println("Digite divisor: ");
            divisor = leia.nextInt();

            resul = dividendo / divisor;

            System.out.println("Divisão = " + resul);

            System.out.println("");

        } catch (InputMismatchException e) {
            System.err.println("\nException: " + e);
            System.out.println("\nDigite números inteiros positivos");

        } catch (ArithmeticException e) {
            System.err.println("\nException: " + e);
            System.out.println("\nDigite um divisor diferente de zero");

        } finally {
            leia.close();
        }
    }
}
