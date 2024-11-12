package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
	private String nome;
	private String tipo;
	private int episodios;
	private String genero;
	private String estudio;
	
	// Construtor
	// a sintaxe é a seguinte:
	// modificador_de_acesso NomeDaClasse() {}
	
	// Caso você não crie um construtor em sua classe
	// O java irá gerar o mesmo em tempo de compilação (No bytecode - .class)
	// Pois é necessário existir um construtor para dar origem a um objeto
	// Se você colocar algum tipo de retorno, ele vai deixar de ser um construtor
	// e vai virar um método! (EVITAR!!!)
	
	// Diferente do método init, o construtor obriga você seguir regras, isto é,
	// obriga o preenchimento dos parâmetros para poder gerar um novo objeto
	
	// Por padrão no java, quando você cria um construtor com parâmetro, considerando
	// que não existia o construtor escrito de forma explícita antes, o construtor
	// Anime() deixa de existir, logo será necessário recriar o mesmo só que de
	// forma explícita
	
	// Sem parâmetros
	public Anime() {
		System.out.println("Dentro do construtor sem argumentos");
	}
	
	// Com parâmetros (Sobrecarga)
	public Anime(String nome, String tipo, int episodios, String genero) {
		// O método construtor é executado antes dos outros, isto é, no momento que
		// o objeto é criado
		// Para utilizar outro construtor já criado basta chamar ele com a palavra reservada this();
		// e colocar os parâmetros dentro dos parenteses "(colocar_aqui)" conforme necessário
		// O this() só pode existir dentro de métodos construtores
		// Ele deve estar sempre na primeira linha do construtor cujo está o 
		// chamando, caso o contrário ocorrerá um erro de compilação
		// Esse this é opcional
		this();
		System.out.println("Dentro do construtor com 4 argumentos");
		this.nome = nome;
		this.tipo = tipo;
		this.episodios = episodios;
		this.genero = genero;
	}
	
	public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
		// Para utilizar outro construtor já criado basta chamar ele com a palavra reservada this();
		// e colocar os parâmetros dentro dos parenteses "(colocar_aqui)" conforme necessário
		// O this() só pode existir dentro de métodos construtores
		// Ele deve estar sempre na primeira linha do construtor cujo está o 
		// chamando, caso o contrário ocorrerá um erro de compilação
		this(nome, tipo, episodios, genero);
		System.out.println("Dentro do construtor com 5 argumentos");
		this.estudio = estudio;
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
	// Porém com uma quantidade ou tipo de parâmetros diferentes
	public void init(String nome, String tipo, int episodios, String genero) {
		this.init(nome, tipo, episodios);
		this.genero = genero;
	}
	
	public void imprime() {
		System.out.println("---------------");
		System.out.println(this.nome);
		System.out.println(this.tipo);
		System.out.println(this.episodios);
		System.out.println(this.genero);
		System.out.println(this.estudio);
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
	
	public String getEstudio() {
		return estudio;
	}
	
	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	
}
