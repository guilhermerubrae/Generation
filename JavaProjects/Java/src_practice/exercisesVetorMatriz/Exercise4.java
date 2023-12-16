package exercisesVetorMatriz;

public class Exercise4 {

	public static void main(String[] args) {
	

		double[][] matrizAlunos = { { 4.0, 5.0, 7.0, 3.0 }, { 2.5, 6.5, 4.7, 8.0 }, { 10.0, 8.5, 9.5, 8.0 },
				{ 9.0, 6.5, 7.6, 8.2 }, { 5.0, 5.0, 5.0, 6.3 }, { 7.0, 8.0, 9.0, 8.5 }, { 5.5, 3.5, 2.5, 1.0 },
				{ 8.0, 9.0, 10.0, 9.5 }, { 5.6, 5.8, 6.5, 7.0 }, { 7.5, 8.5, 9.5, 10.0 } };

		System.out.println("[4,0][5,0][7,0][3,0]\n"
				+ "[2,5][6,5][4,7][8,0]\n"
				+ "[10,0][8,5][9,5][8,0]\n"
				+ "[9,0][6,5][7,6][8,2]\n"
				+ "[5,0][5,0][5,0][6,3]\n"
				+ "[7,0][8,0][9,0][8,5]\n"
				+ "[5,5][3,5][2,5][1,0]\n"
				+ "[8,0][9,0][10,0][9,5]\n"
				+ "[5,6][5,8][6,5][7,0]\n"
				+ "[7,5][8,5][9,5][10,0]\n");
		
		// Esse : siginifica que esse for é um for each percorrendo cada vetor
		for (double[] aluno : matrizAlunos) {
			double soma = 0;

			for (double nota : aluno) {
				soma += nota;
			}

			double media = soma / aluno.length;
		    System.out.printf("[%1.1f]",media);//Uma casa decimal [%1.1f]		    
		    
		    /**for (int i = 0; i < matrizAlunos.length; i++) {
			double soma = 0;

			 for (int j = 0; j < matrizAlunos[i].length; j++) {
			        soma += matrizAlunos[i][j];
			}

			double media = soma /  matrizAlunos[i].length;
		    System.out.printf("[%1.1f]",media);**/
		    
		    //formato normal
		}
	}
}