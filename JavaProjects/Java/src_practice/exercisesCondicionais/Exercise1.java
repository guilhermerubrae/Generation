package exercisesCondicionais;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner (System.in)) {
			int A = 0, B =0, C = 0;
			
			System.out.println("\nDigite um número para opção A: ");
			leia.nextInt();
			System.out.println("\nDigite um número para opção B: ");
			leia.nextInt();
			System.out.println("\nDigite um número para opção C: ");
			leia.nextInt();
			
			
			
			if (A + B > C) {
			System.out.println("A Soma de A + B é Maior do que C\r\n");
			} else if(A + B < C){
			System.out.println("A Soma de A + B é Menor do que C\r\n");
			} else if(A + B == C){
			System.out.println("A Soma de A + B é Igual do que C\r\n");
			} else {
				System.out.println("A Soma de A + B é Igual do que C\r\n");
			}
		}
	}
}
