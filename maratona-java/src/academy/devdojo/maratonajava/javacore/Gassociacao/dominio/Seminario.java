package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
	private String titulo;
	// Associação bidirecional entre Seminario e Aluno:
	// A classe Seminario mantém uma lista de Aluno[], indicando que vários alunos
	// podem participar de um mesmo seminário. Por outro lado, cada Aluno possui
	// uma referência para o Seminario ao qual pertence. Assim, ambos os lados
	// conhecem um ao outro, caracterizando uma associação bidirecional.
	private Aluno[] alunos;
	private Local local;
	
	public Seminario(String titulo) {
		this.titulo = titulo;
	}
	
	public Seminario(String titulo, Local local) {
		this(titulo);
		this.local = local;
	}
	
	public Seminario(String titulo, Aluno[] alunos, Local local) {
		this(titulo, local);
		this.alunos = alunos;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Aluno[] getAlunos() {
		return alunos;
	}
	
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public Local getLocal() {
		return local;
	}
	
	public void setLocal(Local local) {
		this.local = local;
	}
}
