package exercisesCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise1_Array_List {

	public static void main(String[] args) {

		try (Scanner leia = new Scanner(System.in)) {

			List<String> cores = new ArrayList<String>();

			cores.add("Azul");
			cores.add("Verde");
			cores.add("Amarelo");
			cores.add("Branco");
			cores.add("Laranja");

			System.out.println("Listar todas as cores: \n");

			for (String cor : cores) {
				System.out.println(cor);
			}

			Collections.sort(cores);
			
			System.out.println("Ordenar as cores: \n");
			for (String cor : cores) {
				System.out.println(cor);

			}

		}
	}
}