package loops;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		try (Scanner leia = new Scanner(System.in)) {
			int contador;

			System.out.println("\nAs vagas são limitadas, INSCREVA-SE JÁ!");

			for (contador = 1; contador < 4; contador++) {
				System.out.println("\nVocê foi o " + contador + "!");
			}
		}

		System.out.println("\nVagas esgotadas.");
	}

}
