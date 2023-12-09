package exercisescondicionais;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        try (Scanner leia = new Scanner(System.in)) {

            String tipoUm;
            String tipoDois;
            String tipoTres;

            System.out.println("\nSelecione: Vertebrado ou Invertebrado");
            tipoUm = leia.nextLine();

            System.out.println("\nSelecione: Ave, Mamífero, Inseto, Anelídeo");
            tipoDois = leia.nextLine();

            System.out.println("\nSelecione: Carnívoro, Onívoro, Herbívoro, Hematógrafo");
            tipoTres = leia.nextLine();

			// V - Águia x Pomba x Homem x Vaca
			if (tipoUm.equalsIgnoreCase("Vertebrado")) {
				if (tipoDois.equalsIgnoreCase("Ave")) {
					if (tipoTres.equalsIgnoreCase("Carnívoro")) {
						System.out.println("Águia");
					} else if (tipoTres.equalsIgnoreCase("Onívoro")) {
						System.out.println("Pomba");
					} else {
						System.out.println("Inválido Verifique a escrita e acentuações caso houver.");
					}
				//segunda opção
				} else if (tipoDois.equalsIgnoreCase("Mamífero")) {
					if (tipoTres.equalsIgnoreCase("Herbívoro")) {
						System.out.println("Vaca");
					} else if (tipoTres.equalsIgnoreCase("Onívoro")) {
						System.out.println("Homem");
					} else {
						System.out.println("Inválido Verifique a escrita e acentuações caso houver.");
					}
				}
			}
			

			
			 // I - Pulga x Lagarta x Sangessuga x Minhoca
			if (tipoUm.equalsIgnoreCase("Invertebrado")) {
				if (tipoDois.equalsIgnoreCase("Inseto")) {
					if (tipoTres.equalsIgnoreCase("Hematógrafo")) {
						System.out.println("Pulga");
					} else if (tipoTres.equalsIgnoreCase("Herbívoro")) {
						System.out.println("Lagarta");
					} else {
						System.out.println("Inválido Verifique a escrita e acentuações caso houver.");
					}
				//segunda opção
				} else if (tipoDois.equalsIgnoreCase("Anelídeo")) {
                    if (tipoTres.equalsIgnoreCase("Hematógrafo")) {
                        System.out.println("Sangessuga");
                    } else if (tipoTres.equalsIgnoreCase("Onívoro")) {
                        System.out.println("Minhoca");
                    } else {
                        System.out.println("Inválido Verifique a escrita e acentuações caso houver.");
                    }
				}
			}
		}
	}
}
