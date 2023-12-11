package exercisesloops;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			int idade = 0, genero = 0, categoria = 0, back = 0, front = 0, mobile = 0, fullstack = 0, cont = 0, media = 0,
					soma = 0;
			String continua = "S";

			while (!continua.equals("N")) {

				System.out.println("Digite a idade: ");
				idade = leia.nextInt();

				System.out.println("Digite o sexo (1-M/2-F/3-Não Binário/4-Mulher Trans/5 – Homem Trans/6 – Outros): ");
				genero = leia.nextInt();
			
				while (genero < 1 || genero > 6) {
					System.out.println("Digite o sexo: ");
			        genero = leia.nextInt();
				}
				
				System.out.println("Digite a categoria: ");
			    System.out.println("1- Back/2-  Front/3- Mobile/4- FullStack");
			    categoria = leia.nextInt();
				
				while (categoria < 1 || categoria > 4) {
					System.out.println("Digite a categoria: ");
					System.out.println("1- Back/2-  Front/3- Mobile/4- FullStack");
					categoria = leia.nextInt();
				}

				if (categoria == 1) {
					back++;
				}
				if (categoria == 2 && genero == 2) {
					front++;
				}
				if (categoria == 3 && genero == 1 && idade > 40) {
					mobile++;
				}
				if (categoria == 4 && genero == 2 && idade < 30) {
					fullstack++;
				}
				cont++;
				soma += idade;

				System.out.println("Deseja continuar (S/N)? ");
				leia.nextLine(); 
				continua = leia.nextLine().toUpperCase();

				media = soma / cont;

			System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + back);
			System.out.println("\nTotal de mulheres desenvolvedoras Frontend: " + front);
			System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: " + mobile);
			System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: " + fullstack);
			System.out.println("\nO número total de pessoas que responderam à pesquisa: " + cont);
			System.out.println("\nA média de idade das pessoas que responderam à pesquisa: " + media);

}
		}
	}
}
