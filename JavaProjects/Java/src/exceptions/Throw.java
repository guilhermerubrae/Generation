package exceptions;

import java.util.Scanner;

public class Throw {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade = 1;

		do {

			try {

				System.out.println("\nDigite uma idade: ");
				idade = leia.nextInt();

				validarIdade(idade);

			} catch (ArithmeticException e) {
				System.err.println(e);
				System.out.println("\nDigite um número inteiro maior ou igual a 18!");
			}
		} while (idade != 0);

	}

	public static void validarIdade(int idade) {

		if (idade > 0 && idade < 18)
			throw new ArithmeticException("A Pessoa não pode dirigir!!");
		if (idade == 0)
			System.out.println("Volte sempre!");
		else
			System.out.println("A Pessoa pode dirigir!!");

	}

}