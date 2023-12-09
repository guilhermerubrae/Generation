package javaexercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite seu abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Seu novo salário: " + novoSalario);
		novoSalario = leia.nextFloat();
		
		leia.close();
	}

}
