package exercisesDatas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercise3_Set_I {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			Set<Integer> meuSet = new HashSet<>();

			System.out.println("\nDigite 10 valores inteiros que não se repitam: \n");

			for (int i = 0; i < 10; i++) {
				System.out.print("Digite um número: ");
				int valor = leia.nextInt();
				meuSet.add(valor);
			}System.out.print("Listar dados do Set: " + meuSet + " ");

			Iterator<Integer> iteratorSet = meuSet.iterator(); // Irá percorrer e ordenar com o hashSet
			System.out.print("\nListar dados no Set com Iterator: ");
			while (iteratorSet.hasNext()) {
				System.out.print(iteratorSet.next() + " ");
				
			}
			System.out.println(); // Quebra linha no final
		}
	}
}
