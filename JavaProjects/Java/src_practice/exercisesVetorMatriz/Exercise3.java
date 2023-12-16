package exercisesVetorMatriz;

public class Exercise3 {

	public static void main(String[] args) {
		int arrayM[][] = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9, } };
		int tamanhoArrayM = arrayM.length;
		int pri = 0, sec = 0, somaPri = 0, somaSec = 0;

		/**
		 * Dois loops para que a saída não sejá interferida, sendo mostrado os valores
		 * abaixo o int linhaColuna é uma var de controle do fluxo iniciada em zero e
		 * conforme não atingir o valor do array matriz irá se repetir com o L||C++ que
		 * passará para próxima linha. Quando invocamos o arrayM[L][C] dentro do for
		 * estamos pegando o valor inicial de linha e coluna da primeira dimensão da
		 * matriz e assim até o laço acabar.
		 **/
		System.out.println("\n MATRIZ" + "\n[1][2][3]" + "\n[4][5][6]" + "\n[7][8][9]");
		System.out.println("\nElementos da Diagonal Principal:");
		for (int linhaColuna = 0; linhaColuna < tamanhoArrayM; linhaColuna++) {
			pri = arrayM[linhaColuna][linhaColuna];
			System.out.print(pri + " "); // print"ln" passa para linha debaixo print não
			somaPri += pri;

		}
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaPri);

		System.out.println("\nElementos da Diagonal Secundária:");
		for (int linhaColuna = 0; linhaColuna < tamanhoArrayM; linhaColuna++) {
			sec = arrayM[linhaColuna][tamanhoArrayM - 1 - linhaColuna];
			// Está pegando todo o array L por C e após o -1 lê de forma inversa
			System.out.print(sec + " ");
			somaSec += sec;

		}
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaSec);

	}
}
