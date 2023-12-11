package exercisesloops;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
           
            int impar = 0, par = 0;;

            for (int c = 1; c <= 10; c++) {
                System.out.println("Digite o " + c + "º número: ");
                int num = leia.nextInt();

                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }

            System.out.println("Total de números pares: " + par);
            System.out.println("Total de números ímpares: " + impar);
        }
    }
}
