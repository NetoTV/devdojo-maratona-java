package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
	private String nome;
	private int[] episodios;
	// Ordem de criação dos objetos (Até o momento)
	// 1 - É alocado espaço em memória para o objeto
	// 2 - Cada atributo de classe é criado e inicializado com valores padrões do
	// Java ou o que for passado via operador de atribuição
	// 3 - Bloco de inicialização é executado
	// 4 - Construtor é executado
	 
	// A inicialização dos atributos do objeto acontecem antes da execução do
	// construtor [IMPORTANTE!]
	// private int[] episodios = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

	// Bloco de inicialização de instância (É executado antes do construtor)
	// É executado todas vezes que uma instância do objeto for criada, independente
	// de qual construtor for chamado.
	// O código dele vem escrito normalmente antes dos construtores
	{
		System.out.println("\nDentro do bloco de inicialização");
		this.episodios = new int[100];
		
		for(int index = 0; index < episodios.length; index++) {
			episodios[index] = index + 1;
		}
	}
	
	public Anime() {
		for(int episodio: this.episodios) {
			System.out.print(episodio + " ");
		}
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

	public int[] getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int[] episodios) {
		this.episodios = episodios;
	}
}
