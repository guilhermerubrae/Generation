package exercisesCondicionais;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		String nome;
		int op;
		float salario;
		float reajuste = 0;
		
		try(Scanner leia = new Scanner(System.in)){
			System.out.println("\n\tReajuste Salarial");
			System.out.println("\nDigite o seu nome:");
			nome = leia.nextLine();
			System.out.println("\n1- Gerente");
			System.out.println("\n2- Vendedor");
			System.out.println("\n3- Supervisor");
			System.out.println("\n4- Motorista");
			System.out.println("\n5- Estoquista");
			System.out.println("\n6- Técnico de TI");
			System.out.println("\nDigito do seu cargo:");
			op = leia.nextInt();
			System.out.println("\nSalário Líquido");
			salario = leia.nextFloat();
			
			switch (op) {
			case 1:
				reajuste = salario + (salario * 0.10f);
				break;
			case 2:
				reajuste = salario + (salario * 0.07f);
				break;
			case 3:
				reajuste = salario + (salario * 0.09f);
				break;
			case 4:
				reajuste = salario + (salario * 0.06f);
				break;
			case 5:
				reajuste = salario + (salario * 0.05f);
				break;
			case 6:
				reajuste = salario + (salario * 0.08f);
				break;default:
                    System.out.println("\nOpção inválida. Verifique o número correspondente ao seu cargo.");
                    return;  // Encerra o programa se a opção for inválida
            }
			
		}System.out.println("\nOlá " + nome + " Cargo ID: "+ op + " seu reajuste salarial de: " + reajuste);
	}
}
