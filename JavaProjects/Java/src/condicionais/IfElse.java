package condicionais;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        float n1, n2, n3, media;
        
		/*
		 *Operador Lógico E -- &&
		 
		 Entrada1	Entrada2	Saída
		 V			V			V
		 V			F			F
		 F			V			F
		 F			F			F
		 
		 Operador Lógico OU -- ||
		 
		 Entrada1	Entrada2	Saída
		 V			V			V
		 V			F			V
		 F			V			V
		 F			F			F
		 
		 */

        Scanner ler = new Scanner(System.in);

        System.out.println("\nEntre com a nota 1: ");
        n1 = ler.nextFloat();

        System.out.println("\nEntre com a nota 2: ");
        n2 = ler.nextFloat();

        System.out.println("\nEntre com a nota 3: ");
        n3 = ler.nextFloat(); // entrei com as três notas

        media = (n1 + n2 + n3) / 3; // 5

        System.out.println("\nMédia aritmética: " + media);

        if (media >= 7 && media <= 10) {
            System.out.println("\nVocê foi aprovade!!!");
        } else if (media >= 5 && media < 7) {
            if (media >= 6 && media < 7) {
                System.out.println("\nVou te dar uma chance...");
                System.out.println("\nMe entregue um trabalho para ser avaliado");
            } else {
                System.out.println("\nVocê ficou de EXAME!!!");
            }
        } else if (media >= 0 && media < 5) {
            System.out.println("\nVocê foi reprovade!!!");
        } else {
            System.out.println("\nMédia inválida!!!");
        }

        ler.close(); // Lembre-se de fechar o Scanner para evitar vazamento de recursos.
    }
}
