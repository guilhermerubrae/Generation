package exercisesloops;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
        	int menor = 0, maior = 0;
        	int idade;
        	
        	do {
                System.out.println("Digite uma idade: ");
                idade = leia.nextInt();
                if (idade > 21) {
                	maior++;
                }else{
                	menor++;
                }
        	}while (idade > 0);
        	System.out.println("Total de pessoas menores de 21 anos: " + menor);
            System.out.println("Total de pessoas maiores de 50 anos: " + maior);
        }   

	}

}
