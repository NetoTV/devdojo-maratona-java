package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
	private String nome;
	private Time time;

	// Um jogador não necessáriamente vai estar em um time
	// Portanto é obrigatório apenas o nome do mesmo
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public void imprime() {
		System.out.println(this.nome);
		
		if(this.time != null) {
			System.out.println(this.time.getNome());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
}
