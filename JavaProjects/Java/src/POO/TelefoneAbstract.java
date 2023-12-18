package POO;

public abstract class TelefoneAbstract {

	private String tipo;
	abstract public void disca (String numero);
	abstract public void toca (int numToques);
	
	public TelefoneAbstract(String tipo) {
		super();
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
