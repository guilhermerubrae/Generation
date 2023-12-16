package exercisesCondicionais;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner leia = new Scanner(System.in)) {

			String nome = null;
			int idade = 0;
			boolean doacao = false;

			System.out.println("\nDigite o seu Nome: ");
			nome = leia.nextLine();
			System.out.println("\nDigite a sua Idade: ");
			idade = leia.nextInt();
			System.out.println("\nPrimeira doação de sangue?: ");
			doacao = leia.nextBoolean();

			if (idade >= 18 && idade <= 59) {
				System.out.println("\n" + nome + "está apto(a) para doar sangue!");
			}
			if (idade >= 69 && idade <= 69 && (doacao == true)) {
				System.out.println("\n" + nome + "está apto(a) para doar sangue!");
				leia.nextLine();
			} else {
				System.out.println("\n" + nome + " não está apto(a) para doar sangue!");

			}
		}

	}
}
