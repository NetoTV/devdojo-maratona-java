package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
	private String nome;
	// Associação de 1 - N (Um para um, Um time pode ter vários jogadores)
	private Jogador[] jogadores;
	
	public Time(String nome) {
		this.nome = nome;
	}

	public Time(String nome, Jogador[] jogadores) {
		this.nome = nome;
		this.jogadores = jogadores;
	}

	public void imprime() {
		System.out.println(nome);
		
		if(this.jogadores != null) {
			for(Jogador jogador : jogadores) {
				System.out.println(jogador.getNome());
			}
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Jogador[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
}
