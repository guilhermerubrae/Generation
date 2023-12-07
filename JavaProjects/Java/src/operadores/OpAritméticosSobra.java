package operadores;

import java.util.Scanner;

public class OpAritméticosSobra {

	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
	//Operadores Aritméticos
		
				int x, y, resul;
				
				System.out.println("\nDigite o primeiro numero:");
				x = leia.nextInt();
				System.out.println("\nDigite o segundo numero:");
				y = leia.nextInt();
				
				resul = x % y;
				
				System.out.println("\nSoma: " + resul);
					
				leia.close();
			}
}
