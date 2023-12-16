package loops;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            int resultado, opcao;

            System.out.println("\nCalculadora que só multiplica por 5--");
            System.out.println("\nDigite um número diferente de 0: ");
            // Use nextInt() para ler um número
            opcao = leia.nextInt();

            while (opcao != 0) {
                resultado = opcao * 5;
                System.out.println("\nResultado: " + resultado);

                System.out.println("\nDigite outro número ou digite 0 para sair");
                // Use nextInt() para ler um número
                opcao = leia.nextInt();
            }

            // Movido para dentro do bloco try para garantir que seja exibido antes de encerrar
            System.out.println("\nAdeus meu chapa");
        }
    }
}
