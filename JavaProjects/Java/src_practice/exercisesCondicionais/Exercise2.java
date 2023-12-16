package exercisesCondicionais;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        try (Scanner leia = new Scanner(System.in)) {
            int num;

            System.out.println("\nDigite um número: ");
            num = leia.nextInt();

            if (num < 0) {
                if (num % 2 == 0) {
                    System.out.println("O Número " + num + " é par e negativo!");
                } else {
                    System.out.println("O Número " + num + " é ímpar e negativo!");
                }
            } else if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("O Número " + num + " é par e positivo!");
                } else {
                    System.out.println("O Número " + num + " é ímpar e positivo!");
                }
            } else {
                System.out.println("Inválido");
            }
        }
    }
}
