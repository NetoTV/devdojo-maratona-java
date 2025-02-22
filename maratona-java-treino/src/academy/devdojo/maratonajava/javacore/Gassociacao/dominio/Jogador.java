package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
	private String nome;
	// Associação de 1 - 1 (Um para um, Um jogador pode estar em um time)
	private Time time;
	
	// Nesse caso o jogador poderá ser cadastrado sem ter um time
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public void imprime() {
		System.out.println(nome);
		
		// Como não é obrigatório que um jogador seja cadastrado com um time, pode ser que o this.time seja null
		// portanto é necessário validar se o mesmo não está null a fim de evitar um NullPointerException
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
