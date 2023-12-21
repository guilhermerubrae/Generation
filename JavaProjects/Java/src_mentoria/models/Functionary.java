package models;

public class Functionary {
	
	private String nome;
	private int matricula;
	private String cargo;
	
	public Functionary(String nome, int matricula, String cargo) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

}
