package models;

import java.util.ArrayList;

public class TestFunctionary {

	public static void main(String[] args) {

		ArrayList<Functionary> funcionarios = new ArrayList<Functionary>();

		Functionary funcionario = new Functionary("Rubrae", 989898, "Encanador");

		funcionarios.add(funcionario);
		System.out.println(funcionarios.get(0).getNome());

	}

}
