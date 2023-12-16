package operadores;

public class OperadorTernário {

	public static void main(String[] args) {
		//Diminui linhas de cód, é bom para fazer um teste rápido também 
		
		int idade = 0;
		
		String mensagem = ((idade >= 18)? "É maior de idade" : "É menor de idade");
		System.out.println(mensagem);
		String mensagem1 = ((idade >= 18)? "É maior de idade" : (idade >= 18) ? "Tem extamente 18" : "É menor de idade");
		System.out.println(mensagem1);

	}

}
