package POO;

import java.text.NumberFormat;

public class Empregado {

	private String nome;
	private double salario;
	
	public Empregado(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual/100;
	}
	//Método para formatar os num
	public String formatarMoeda() {
		//Classe que está dentro de uma biblioteca
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2); // 2 duas casas depois da vírgula
		String formatoMoeda = nf.format(salario); //Formata em string obrigatóriamente e o NFormat trabalha em string apenas
		return formatoMoeda;
	}
	
	public void imprimir() {//this pra informar que ele é da própria classe
    	System.out.println("\n"+ nome+" Salário: "+ salario + this.formatarMoeda());
    }
}
