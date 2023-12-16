package exercisesCondicionais;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			float n1 = 0 , n2 = 0, op = 0, total = 0;
			
			System.out.println("Digite um número: ");
			n1= leia.nextFloat();
			System.out.println("Digite outro número: ");
			n2 = leia.nextFloat();
			System.out.println("Escolha uma operação:\r\n "
					+ "1- Soma\r\n"
					+ " 2- Subtração\r\n"
					+ " 3- Multiplicação\r\n"
					+ " 4- Divisão\r\n");
			op = leia.nextInt();
			
			
			switch ((int) op) {
            case 1:
                total = n1 + n2;
                break;
            case 2:
                total = n1 - n2;
                break;
            case 3:
                total = n1 * n2;
                break;
            case 4:
                total = n1 / n2;
                break;
            default:
                System.out.println("Operação Inválida!");
        }
        System.out.println("Total: " + total);
    }
}
}
 