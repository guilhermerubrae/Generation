package operadores;

import java.util.Scanner;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//OpAritméticos
		
		int x, y;
		
		System.out.println("\nDigite o primeiro numero:");
		x = leia.nextInt();
		System.out.println("\nDigite o segundo numero:");
		y = leia.nextInt();
		
		x -= y;

		
		System.out.println("\nSoma: " + x);
			
		leia.close();
	}

}

