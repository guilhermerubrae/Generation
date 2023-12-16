package exercisesVetorMatriz;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		try (Scanner leia = new Scanner(System.in)) {

			int[] array = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
            int tamanhoArray = array.length; // É atribuido o length pois ele fará visivel todo o array para ser percorrido
            int numeroProcurado;
            boolean encontrado = false; // Quando verdadeiro interrompe o laço
            int indiceEncontrado = 0;

            System.out.println("Digite o número que você deseja encontrar: ");
            numeroProcurado = leia.nextInt();

            for (int i = 0; i < tamanhoArray; i++) {
                if (array[i] == numeroProcurado) { // Pega a posição do valor
                    encontrado = true;
                    indiceEncontrado = i; // Utiliza a var i novamente pois ela já percorreu o vetor
                    break;  // Se encontrado, não precisa continuar o loop
                }
            }
            
            if (encontrado) {
                System.out.println("O número " + numeroProcurado + " está localizado na posição: "+ indiceEncontrado);
            } else {
                System.out.println("O número " + numeroProcurado + " não foi encontrado!");
            }
        }
    }
}