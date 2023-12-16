package exercisesDatas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4_Set {

	public static void main(String[] args) {

		try (Scanner leia = new Scanner(System.in)) {
			Set<Integer> numeros = new HashSet<Integer>();// Set e hashSet não vão permitir duplicação
			
			numeros.add(2);
			numeros.add(5);
			numeros.add(1);
			numeros.add(3);
			numeros.add(4);
			numeros.add(9);
			numeros.add(7);
			numeros.add(8);
			numeros.add(10);
			numeros.add(6);

			System.out.println("Digite o número que você quer encontrar: ");
			int n = leia.nextInt();
			
			boolean verifica;
			verifica = numeros.contains(n);//Verifica se o núm do user tem ou não no hashSet
			
			if(verifica == true) {
				System.out.printf("\nO número %d foi encontrado", n);
			}else {
				System.out.printf("\nO número %d não foi encontrado", n);
			}
		}
	}
	
}
