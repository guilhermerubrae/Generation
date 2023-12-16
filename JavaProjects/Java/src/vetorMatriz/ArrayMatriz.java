package vetorMatriz;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {

		try (Scanner leia = new Scanner(System.in)) {
			// Vetor unidimensional
			// Matriz bidimensional
			// Método .length (tamanhos definidos)
			// Método .sort (ordena)
			int numeros[][] = new int[3][2];
			int contPares = 0, somaImpar = 0, linha, coluna;

			try (Scanner ler = new Scanner(System.in)) {
				for (linha = 0; linha < 3; linha++) {
					for (coluna = 0; coluna < 2; coluna++) {
						System.out.println("\nEntre com o número na linha "+linha+" e coluna "+coluna);
						numeros[linha][coluna] = leia.nextInt();
						
						if(numeros[linha][coluna] % 2 ==0) {
							contPares++;
						}else {
							somaImpar += numeros[linha][coluna];
						
						}
						
					}
					System.out.println("Matriz: \n\n\t"+ numeros[0][0] + "\t" + numeros[0][1]+ "\n\t" 
							+ numeros[1][0] + "\t" + numeros[1][1]+ "\n\t" + numeros[2][0]+ "\t" + numeros[2][1]);

					System.out.println("Eu tenho: "+contPares+" núm par");
					System.out.println("Somatório do núm impares "+somaImpar);
					
				}
			}
		}
	}

}
