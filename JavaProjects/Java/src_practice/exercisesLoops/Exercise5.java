package exercisesLoops;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		try(Scanner leia = new Scanner(System.in)) {
		int num; 
		int pos =0;
		do {
			System.out.println("Digite um número:");
			num = leia.nextInt();
			if (num > 0);
			pos++;
		} while(num > 0);
		System.out.println("A soma dos números positivos é:" + pos);

		
	}
  }
}
