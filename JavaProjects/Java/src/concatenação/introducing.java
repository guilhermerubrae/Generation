package concatenação;

import java.util.Scanner;

public class introducing {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome = "Guilherme Rubrae";
		int idade = 21;
		float altura = (float) 1.81;

		System.out.println("\nMeu nome é: " + nome);
		System.out.println("\nEu tenho: " + idade + " anos de vida");
		System.out.println("\nEu tenho: " + altura + " metros de altura");

		System.out.println("\n Entre com Nome: ");
		nome = leia.nextLine();
		System.out.println("\n Entre com Idade: ");
		idade = leia.nextInt();
		System.out.println("\n Entre com Altura: ");
		altura = leia.nextFloat();

		leia.close();
	}

}