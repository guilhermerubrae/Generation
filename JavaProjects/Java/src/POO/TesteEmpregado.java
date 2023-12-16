package POO;

public class TesteEmpregado {

	public static void main(String[] args) {

		Empregado[] lista = new Empregado[3];

		lista[0] = new Empregado("Daeron Antunes", 20000);
		lista[1] = new Empregado("Lino Lugli", 350000);
		lista[2] = new Empregado("Rubrae Abreu", 500000);
		// forEach
		for (Empregado roda : lista) {
			roda.imprimir();
		}
		System.out.println("\n"+"*".repeat(60));

		for (Empregado roda : lista) {
			roda.aumentarSalario(10);
			roda.imprimir();
		}

	}
}