package exercisesVetorMatriz;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			int arrayInt[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
			int tamanhoArray = arrayInt.length; // É atribuido o length pois ele fará visivel todo o array para ser
												// percorrido
			int op = 0, pares = 0, impares = 0, soma = 0;
			float media = 0, soma1 = 0;
while(op != 5) {
			System.out.println("\n\t VETOR\n[2,5,1,3,4,9,7,8,10,6] \nDeseja: "
					+ "\n1- Somar \n2- Média \n3- Pares \n4- Impares \n5- Todas as opções");
			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.printf("\nSoma: ");
				for (int i = 0; i < tamanhoArray; i++) {
					soma += arrayInt[i];
				}
				System.out.print(soma);
				break;

			case 2:
				System.out.printf("\nMédia: ");
				for (int i = 0; i < tamanhoArray; i++) {
					soma1 += arrayInt[i];
				}
				media = soma1 / tamanhoArray;
				System.out.print(media);
				break;

			case 3:
				System.out.printf("\nElementos pares: ");
				for (int i = 0; i < tamanhoArray; i++) {
					if (arrayInt[i] % 2 == 0) {
						System.out.print(arrayInt[i] + " ");
					}
				}
				break;
			case 4:
				System.out.printf("\nElementos impares: ");
				for (int i = 0; i < tamanhoArray; i++) {
					if (arrayInt[i] % 2 == 1) {
						System.out.print(arrayInt[i] + " ");
					}
				}
				break;
			case 5:
				System.out.printf("\nElementos pares: ");
				for (int i = 0; i < tamanhoArray; i++) {
					arrayInt[i] += pares;
					if (arrayInt[i] % 2 == 0) {

						System.out.print(arrayInt[i]);
						System.out.print(" ");
					}
				}
				System.out.printf("\nElementos impares: ");
				for (int i = 0; i < tamanhoArray; i++) {
					arrayInt[i] += impares;
					if (arrayInt[i] % 2 == 1) {

						System.out.print(arrayInt[i]);
						System.out.print(" ");
					}
				}
				System.out.printf("\nSoma: ");
				for (int i = 0; i < tamanhoArray; i++) {
					soma += arrayInt[i];
				}
				System.out.print(soma);
				System.out.printf("\nMédia: ");
				for (int i = 0; i < tamanhoArray; i++) {
					soma1 += arrayInt[i];
					media = soma1 / 10;
				}
				System.out.print(media);
				break;
			}

		}
		}
	}
}
