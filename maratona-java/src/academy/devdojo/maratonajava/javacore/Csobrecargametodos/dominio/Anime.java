package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
	private String nome;
	private String tipo;
	private int episodios;
	private String genero;
	
	// Construtor
	// A sintaxe de um construtor é a seguinte:
	// modificador_de_acesso NomeDaClasse() {}
	
	// Caso você não crie um construtor em sua classe
	// O java irá gerar o mesmo em tempo de compilação 
	// (O mesmo estará dentro do bytecode, o arquivo ".class")
	// Pois no Java é obrigatório existir ao menos um construtor na classe
	// para dar origem a um objeto
	public Anime() {
		
	}
	
	public void init(String nome, String tipo, int episodios) {
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
	}
	
	// Sobrecarga de métodos
	// Sobrecarga de métodos é quando você tem um método com o mesmo nome de outro
	// Porém cada um tem a sua própria implementação e seus próprios parâmetros

	// Portanto, sobrecarga é basicamente:
	// Um método com o mesmo nome de outro
	// Porém com um tem sua quantidade ou tipo de parâmetros diferentes
	public void init(String nome, String tipo, int episodios, String genero) {
		this.init(nome, tipo, episodios);
		this.genero = genero;
	}
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.tipo);
		System.out.println(this.episodios);
		System.out.println(this.genero);
	}
	
	// Normalmente os métodos getters e setters ficam no final do código
	// por terem uma relevância inferior a outros métodos
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getEpisodios() {
		return episodios;
	}
	
	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
