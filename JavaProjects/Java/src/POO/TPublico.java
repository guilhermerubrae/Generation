package POO;

public class TPublico extends TelefoneAbstract {

	public TPublico() {
		super("Telefone público");
	}

	@Override
	public void toca(int numToques) {
		for (int i = 0; i < numToques; i++) {
			System.out.println("\nTraaam Traaam Traaam");
		}
	}

	@Override
	public void disca(String numero) {
		if (numero.charAt(0) == '9' || numero.charAt(0) == '8') {
			System.out.println("\nTelefone público não disca para celular ");
		} else {
			System.out.println("\nDicando: " + numero);

		}
	}

}
