package main_calculator;

import java.util.Scanner;
import method_calculator.Calculator;

public class TestCalculator {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float numero1 = 0, numero2 = 0;

		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextFloat();

		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextFloat();

		// Exibe o Resultado de cada Operação Matemática:
		System.out.println("Soma = " + Calculator.soma(numero1, numero2));
		System.out.println("Subtração = " + Calculator.subtracao(numero1, numero2));
		System.out.println("Multiplicação = " + Calculator.multiplicacao(numero1, numero2));
		System.out.println("Divisão = " + Calculator.divisao(numero1, numero2));

		// finaliza o Objeto leia
		leia.close();

	}

}