package exercisesLoops;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			int num;
			float media;
			int mul = 0;
			int c = 0;

			do {
				System.out.println("Digite um número:");
				num = leia.nextInt();
				if (num % 3 == 0 && num != 0) {
					mul += num;
					c++;
				}
			} while (num != 0);
			media = (float) mul / c;
			System.out.println("A média de todos os números múltiplos de 3 é:" + media);

		}
	}
}
