package POO;

public class TesteCliente {
    public static void main(String[] args) {

        // Criação de objetos Cliente, PessoaFisica e PessoaJuridica
        Cliente c1 = new Cliente("Guilherme Rubrae", 28, "Dev Java Junior", 35000,
                "guilhermerubrae@gmail.com");

        PessoaFisica pf = new PessoaFisica("Samuel Ferreira", 21, "Dev Java Junior", 40000,
                "samuel@gmail.com", "567.567.567-08", "32.324.345-7");

        PessoaJuridica pj = new PessoaJuridica("Gustavo Almeida", 26, "Dev Java Junior", 50000,
                "almeida@gmail.com", "15.874.576/0001-00");

        // Teste: Exibindo informações dos objetos
		
        c1.visualizar();
		System.out.println("*".repeat(70));
        pf.visualizar();
		System.out.println("*".repeat(70));
        pj.visualizar();    }
}
