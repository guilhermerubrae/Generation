package exercisesDatas;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2_Array_List {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {

			ArrayList<Integer> num = new ArrayList<Integer>();

			num.add(2);
			num.add(5);
			num.add(1);
			num.add(3);
			num.add(4);
			num.add(9);
			num.add(7);
			num.add(8);
			num.add(10);
			num.add(6);

			System.out.println(num);

			for (int i = 0; i <= 10; i++) {
				System.out.println("\nDigite o número que você deseja encontrar: ");
				int number = leia.nextInt();
				if (number <= 10) {
					System.out.println("O número " + number + " está localizado na posição:" + num.indexOf(number));
				} else {
					System.out.println("O número " + number + " não foi encontrado!");
					break;
				}
			}
		}

	}
}
