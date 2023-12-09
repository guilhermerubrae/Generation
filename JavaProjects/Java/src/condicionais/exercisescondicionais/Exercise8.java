package exercisescondicionais;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			float op = 0, novoSaldo = 0, saldo = (float) 1000.00, saque =0, deposito = 0;
			
			System.out.println("Escolha uma operação:\r\n "
					+ "1- Saldo\r\n"
					+ " 2- Saque\r\n"
					+ " 3- Depósito\r\n");
			op = leia.nextInt();
			
			switch ((int) op) {
            case 1:
                break;
            case 2:
            	System.out.println("Escolha um valor de saque de até: " + saldo);
            	saque = leia.nextFloat();
            	if (saque < saldo) { 
                novoSaldo = saldo - saque;
                }else {
                	System.out.println("Saldo Insuficiente!\r\n");
                }
                break;
            case 3:
            	System.out.println("Escolha um valor de depósito de até: " + saldo);
                novoSaldo = deposito + saldo;
                break;
            default:
                System.out.println("Operação Inválida!");
        }
	        System.out.println("Saldo: " + saldo);
        System.out.println("Novo Saldo: " + novoSaldo);
    }
}
}