package operadores;

public class OpLógicos {

	public static void main(String[] args) {
		
		int x = 8;
		int y = 9;
		
		System.out.println(x == y && y == x);
		System.out.println(x == 8 || y == 9);
		System.out.println(!(x == y || y == x));
		System.out.println(x >= 9 && y == 8 || x <= y);
	}

}
