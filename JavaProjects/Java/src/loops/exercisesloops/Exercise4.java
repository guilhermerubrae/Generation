package exercisesloops;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade = 0, genero, categoria = 0, back =0, front =0, mobile =0, fullstack =0, cont, media = 0, soma;
		String continua = "S";
		
		while (continua.equals("S")) {
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite o sexo (1-M/2-F/3-Outros): ");
			genero = leia.nextInt();
			
			while (genero < 1 || genero > 6);
			System.out.println("Digite o sexo (1-M/2-F/3-Outros): ");
			genero = leia.nextInt();
		}

		System.out.println("Digite a categoria: ");
		System.out.println("1- Back/2-  Front/3- Mobile/4- FullStack");
		genero = leia.nextInt();
		while (categoria < 1 || categoria > 4);
		System.out.println("Digite a categoria: ");
		System.out.println("1- Back/2-  Front/3- Mobile/4- FullStack");
		genero = leia.nextInt();
		
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
		
	}
	
	media = soma /quant
		System.out.println("Deseja continuar (S/N)? ");
        leia.nextLine(); // Limpeza do buffer do teclado
        continua = leia.nextLine().toUpperCase();
	
	
    media = soma / cont;
    
    System.out.println("Total de mulheres homens" + back );
    System.out.println("Total de mulheres homens" + front );
    System.out.println("Total de mulheres homens" + mobile );
    System.out.println("Total de mulheres homens" + fullstack);
    System.out.println("Total de mulheres homens" + back front mobile fullstack);
    System.out.println("Total de mulheres homens" + back front mobile fullstack);
    System.out.println("Total de mulheres homens" + back front mobile fullstack);
}
}