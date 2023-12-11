package exercisescondicionais;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		int quant, op;
		float valorTotal;

		try (Scanner leia = new Scanner(System.in)) {

			System.out.println("\n Menu");
			System.out.println("\n1 - Cachorro Quente -- R$ 10.00");
			System.out.println("\n2 - X-Salada -- R$ 15.00");
			System.out.println("\n3 - X-Bacon -- R$ 18.00");
			System.out.println("\n4 - Bauru -- R$ 12.00");
			System.out.println("\n5 - Refrigerante -- R$ 8.00");
			System.out.println("\n6 - Suco de laranja -- R$ 13.00");
			op = leia.nextInt();
			System.out.println("\n7 - Quantidade: ");
			quant = leia.nextInt();

			switch (op) {
			case 1:
				valorTotal = quant * 10;
				System.out.println("\n Opção 1 Cachorro Quente. Total: " + valorTotal);
				break;

			case 2:
				valorTotal = quant * 15;
				System.out.println("\n Opção 2 X-Salada \n Total: " + valorTotal);
				break;

			case 3:
				valorTotal = quant * 18;
				System.out.println("\n Opção 3 X-Bacon \n Total: " + valorTotal);
				break;

			case 4:
				valorTotal = quant * 12;
				System.out.println("\n Opção 4 Bauru \n Total: " + valorTotal);
				break;

			case 5:
				valorTotal = quant * 8;
				System.out.println("\n Opção 5 Refrigerante \n Total: " + valorTotal);
				break;

			case 6:
				valorTotal = quant * 13;
				System.out.println("\n Opção 6 Suco de laranja \n Total: " + valorTotal);
				break;
			}
		}
	}
}
