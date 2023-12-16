package POO;

public class TesteAutomovel {
// No teste principal já chamamos o main
	public static void main(String[] args) {

		// Instânciamos com o new a class Automovel, (atribuimos os argumentos)
		Automovel auto1 = new Automovel("Guilherme Rubrae", "Celta", "GUI6668", 2015);
		// Chamamos o .imprimirInfo
		auto1.imprimirInfo();

		System.out.println("\n\t\t\tTranferência de Automovel");

		auto1.setNomeProprietario("Natália Olgado");
		auto1.imprimirInfo();
		auto1.setPlaca("NTO2D22");// Vai fazer uma troca de dados
		auto1.imprimirInfo();

	}

}
