package POO;

public class Celular extends TelefoneAbstract{

	public Celular() {
		super("Telefoe Celular");
	}
	@Override
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("\nTitititututu Titititututu Titititututu");
			break;
		case 2:
			System.out.println("\nPoooooown Poooooown Poooooown");
		case 3:
			System.out.println("\nHello Moto Hello Moto Hello Moto");
			break;
		}
	}
	@Override
	public void disca(String numero) {
		System.out.println("\nO número "+numero+" é um celular");
	}
}
