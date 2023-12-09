package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int resultado, opcao, num;
		String te;
		
		do {
			System.out.println("\nCalculadora que só multiplica por 5--");
			System.out.println("\nDigite um número diferente de 0: ");
			opcao = leia.nextInt();
			//opcao = leia.next().charAt(0);
			while(opcao != 0) {
				resultado = opcao * 5;
				System.out.println("\nResultado" + resultado);
				
				System.out.println("\nDigite outro número ou digite 0 pra sair");
				opcao = leia.nextInt();
				//opcao = leia.next().charAt(0);
			}
			System.out.println("\nAdeus meu chapa");
		}while(opcao !=0);
	}

}
