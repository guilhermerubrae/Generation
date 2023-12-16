package vetorMatriz;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {

		try (Scanner leia = new Scanner(System.in)) {
			// Vetor unidimensional
			// Matriz bidimensional
			// Método .length (tamanhos definidos)
			// Método .sort (ordena)
			// A váriavel chama o array com [] que será atribuido a um float com 4
			// dimensões;
			// um vetor tem apenas um tipo, não é possível
			float media[] = new float[4];
			String nomes[] = new String[4];
			float n1, n2, n3, mediaGeral, somaMedia = 0;
			int x; // Vai percorrer o Array

			for (x = 0; x < 4; x++) {
				System.out.println("Entre com a primeira nota: ");
				n1 = leia.nextFloat();
				System.out.println("Entre com a segunda nota: ");
				n2 = leia.nextFloat();
				System.out.println("Entre com a terceira nota: ");
				n3 = leia.nextFloat();

				//
				media[x] = (n1 + n2 + n3) / 3;
				
				System.out.println("Média alune "+(x+1)+" foi de: "+media[x]);
				
				somaMedia += media[x];
			}
			mediaGeral = somaMedia/x;
			
			System.out.println("Média geral foi de: "+mediaGeral);
			for (x = 0; x < 4; x++) {
				System.out.println("Média alune "+(x+1)+" foi de: "+media[x]);
			}
			System.out.println("Média primeiro alune foi de: "+media[0]);

		}
	}
}
