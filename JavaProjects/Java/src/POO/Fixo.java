package POO;

public class Fixo extends TelefoneAbstract{
	
	public Fixo() {
		super("Telefone Fixo");
	}
	@Override
	public void toca(int numToques) {
		
		for(int i= 0; i<numToques; i++) {
			System.out.println("\nTriiiiim Triiiiim Triiiiim");
		}
	}
	@Override
	public void disca(String numero) {
		System.out.println("\nDiscando:"+numero);
	}
}
