package loops;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		int contador;

		System.out.println("\nAs vagas são limitadas, INSCREVA-SE JÁ!");

		for (contador = 1; contador < 4; contador++) {
			System.out.println("\nVocê foi o " + contador + "! Nome: ");
			nome = leia.nextLine();
		}
		
		System.out.println("\nVagas esgotadas.");
	}

}
