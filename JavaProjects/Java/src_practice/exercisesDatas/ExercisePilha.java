package exercisesDatas;

import java.util.Scanner;
import java.util.Stack;

public class ExercisePilha {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			Stack<String> livros = new Stack<String>();

			int op;

			System.out.println("-".repeat(70));
			System.out.println("\n\t\tMenu de Agendamento");
			System.out.println("\n(1) Adicionar Livro na Pilha");
			System.out.println("\n(2) Listar Livros");
			System.out.println("\n(3) Retirar Livro da Pilha");
			System.out.println("\n(0) Sair");
			System.out.println("-".repeat(70));

			do {
				System.out.print("\nDigite uma opção: ");
				op = leia.nextInt();

				switch (op) {
				case 1:
					System.out.println("\nDigite o nome: ");
					leia.nextLine();
					livros.push(leia.nextLine());
					System.out.println("\nFila:\n");
					for (String nome : livros) {// Percorrendo para listar name
						System.out.println(nome);
					}
					System.out.println("\nLivro adicionado!");
					leia.nextLine();
					break;
				case 2:
					System.out.println("\nLista de de Livros na Pilha: ");
					for (String nome : livros) {
						System.out.println(nome);
					}
					break;
				case 3:
					leia.nextLine();
					if (!livros.isEmpty()) {
						livros.pop();
						System.out.println("\nFila:\n");
						for (String nome : livros) {
							System.out.println(nome);
						}System.out.println("\nUm Livro foi retirado da pilha!");//Fora do loop para não interferir
					} else {
						System.out.println("\nA Pilha está vazia!");
					}
					break;
				case 0:
					System.out.println("Programa Finalizado!");
					break;
				default:
					break;
				}
			} while (op != 0);

		}
	}

}

