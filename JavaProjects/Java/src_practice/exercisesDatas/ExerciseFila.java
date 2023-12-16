package exercisesDatas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExerciseFila {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			Queue<String> cliente = new LinkedList<String>();

			int op;

			System.out.println("-".repeat(70));
			System.out.println("\n\t\tMenu de Agendamento");
			System.out.println("\n(1) Adicionar Cliente na Fila");
			System.out.println("\n(2) Listar Clientes");
			System.out.println("\n(3) Retirar Cliente na Fila");
			System.out.println("\n(0) Sair");
			System.out.println("-".repeat(70));

			do {
				System.out.print("\nDigite uma opção: ");
				op = leia.nextInt();

				switch (op) {
				case 1:
					System.out.println("\nDigite o nome: ");
					leia.nextLine();
					cliente.add(leia.nextLine());
					System.out.println("\nFila:\n");
					for (String nome : cliente) {// Percorrendo para listar name
						System.out.println(nome);
					}
					System.out.println("\nCliente Adicionado!");
					leia.nextLine();
					break;
				case 2:
					System.out.println("\nLista de Clientes na Fila: ");
					for (String nome : cliente) {
						System.out.println(nome);
					}
					break;
				case 3:
					leia.nextLine();
					if (!cliente.isEmpty()) {
						cliente.remove();
						System.out.println("\nFila:\n");
						for (String nome : cliente) {
							System.out.println(nome);
						}System.out.println("\nO Cliente foi Chamado!");//Fora do loop para não interferir
					} else {
						System.out.println("\nA fila está vazia!");
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
