package condicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		int op = 0;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("\n\t\tMenu de emoções");
			System.out.println("\nn1- Gratidão");
			System.out.println("\nn2- Amor");
			System.out.println("\nn3- Felicidade");
			System.out.println("\nn4- Contentamento");
			System.out.println("\nn5- Orgulho");
			System.out.println("\nDigite a sua opção");
			
			op = ler.nextInt();//1
		} 
		
		
		switch(op) {
		case 1:
			System.out.println("\nSentimento de Gratidão");
			break;
		case 2:

			System.out.println("\nSentimento de Amor");
			break;
		case 3:

			System.out.println("\nSentimento de Felicidade");
			break;
		case 4:

			System.out.println("\nSentimento de Contentamento");
			break;
		case 5:

			System.out.println("\nSentimento de Orgulho");
			break;
			default:
				System.out.println("\nEssa opção é inválida!!!");

	}

  }
}
