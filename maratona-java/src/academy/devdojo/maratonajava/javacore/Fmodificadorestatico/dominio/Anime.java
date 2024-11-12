package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
	private String nome;
	private static int[] episodios;

	// O bloco de inicialização estático é executado apenas uma vez
	// quando a classe é carregada pela JVM (Java Virtual Machine)
	// Ordem de execução das classes:
	// 0 - Todos dados estáticos da classe são carregados 
	// e o bloco de inicialização estático é executado quando a JVM carregar a classe.
	// Isso acontece antes mesmo do espaço ser alocado em memória para o objeto.
	// O bloco de inicialização estático só é executado uma única vez.
	// 1 - É alocado espaço em memória para o objeto cujo está sendo instânciado
	// 2- Cada atributo da classe é criado e inicializado com seus respectivos valores
	// 3 - O Bloco de inicialização de instância é executado
	// 4 - O construtor é executado
	
	static {
		System.out.println("Dentro do bloco de inicialização estático");
		episodios = new int[100];
		
		for(int index = 0; index < episodios.length; index++) {
			episodios[index] = index + 1;
		}
	}
	
	// Caso exista mais de um bloco estático, eles vão ser executados por 
	// ordem do código de cima para baixo, segue o exemplo abaixo:
	
	static {
		System.out.println("Dentro do bloco de inicialização 2 estático");
	}
	
	static {
		System.out.println("Dentro do bloco de inicialização 3 estático");
	}
	
	// Também é possível ter um bloco de inicialização de instância (Não estático)
	// juntamente com os blocos estáticos (static)
	{
		System.out.println("Dentro do bloco de inicialização de instância");
	}
	
	public Anime() {
		for(int episodio: Anime.episodios) {
			System.out.print(episodio + " ");
		}
		System.out.println();
	}

	public Anime(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static int[] getEpisodios() {
		return episodios;
	}
}
