package javaexercises;

public class Exercise3 {

    public static void main(String[] args) {

        float salarioBruto = (float) 2000.00;
        float adicionalNoturno = (float) 500.00;
        float horasExtras = (float) 100.00;
        float descontos = (float) 200.00;
        float salarioLiquido = (float) 0.00;

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        // String.format para formatar a saída com duas casas decimais
        System.out.printf("Seu Salário Líquido atualmente é R$%.2f%n", salarioLiquido);
    }
}
