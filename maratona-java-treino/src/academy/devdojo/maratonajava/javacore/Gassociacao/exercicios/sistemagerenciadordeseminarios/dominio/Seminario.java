package academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.dominio;

public class Seminario {
	private String titulo;
	private Aluno[] alunos;
	private Local local;
	
	public Seminario(String titulo) {
		this.titulo = titulo;
	}
	
	public void imprime() {
		System.out.println(titulo);
	}
}
