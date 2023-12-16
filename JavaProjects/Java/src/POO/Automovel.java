package POO;

public class Automovel {
	// Declaração dos atr da classe private pois não podem ser modificados
    private String nomeProprietario;
    private String modelo;
    private String placa;
    private int ano;

    // Construtor sem parâmetros
    public Automovel() {
        // Inicialização padrão ou lógica de construção, se necessário
    }

    // Construtor com parâmetros
    public Automovel(String nomeProprietario, String modelo, String placa, int ano) {
    	/**super()superclass consegue passar pra uma classe seus dados**/
    	this.nomeProprietario = nomeProprietario;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }//this. atributo(caracteristicas da clsse) e do outro lado fica o arg(aquilo que vou receber de outro objtc, para manipular)

    public Automovel(String nomeProprietario, String modelo) {
    	this.nomeProprietario = nomeProprietario;
        this.modelo = modelo;
    }
    
    // Getters(acessa, pega) e Setters(modifica, atribui)

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    // Não precisamos chamar o .this pois não estamos brincando com objt ainda
    public void imprimirInfo() {
    	System.out.println("\n"+ nomeProprietario+" possui um"
    			+ " automóvel modelo: "+ modelo + "com placa: "+placa+" e ano "+ano);
    }
}
