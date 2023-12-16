package operadores;

public class OpUnáriosAtribuição {
	public static void main(String[] args) {
		int x = 12;
		int y = 9;
		
		System.out.println("Transformar em number negative: "+ (-x));
		
		System.out.println("\nPré Incrementar: x = ++ y");
		
		x =y++;
		
		System.out.println("\nValor de X: " + x); // x recebe o valor de y e y é incrementado
		System.out.println("\nValor de Y: " + y);
	}
}
