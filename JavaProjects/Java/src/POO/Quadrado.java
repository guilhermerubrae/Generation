package POO;

public class Quadrado extends BaseFigura implements Figuras {
//modificadoe de acesso não necessário IDE já entende que é public
	Quadrado(double lado, String nome) {
		super(lado, lado, nome, "Quadrado");
		nomeClasse = "Quadrado";
	}

	@Override
	public double getDiagonal() {
		System.out.println("");
		return Math.sqrt(2)* lado1;
	}

}
