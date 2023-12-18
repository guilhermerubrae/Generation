package POO;

public class TesteTelefone {

	public static void main(String[] args) {

		Celular celular = new Celular();
		Fixo fixo = new Fixo();
		TPublico telefonePublico = new TPublico();
		TelefoneAbstract telefone = null;
		
		int n = (int) (Math.random()*3.0);

		System.out.println("\nO número escolhido foi: "+ n);
		
		switch(n){
			case 0:telefone = celular;break;
			case 1:telefone = fixo;break;
			case 2:telefone = telefonePublico;break;
			default:System.out.println("Erro inesperado!!!");

		}
		if(telefone != null) {
			telefone.disca("987534672");
			telefone.toca(2);
		}
	}

}
