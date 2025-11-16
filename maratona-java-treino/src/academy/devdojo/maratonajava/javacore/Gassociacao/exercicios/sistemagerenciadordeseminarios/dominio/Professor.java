package academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.dominio;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;
	
	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public void imprime() {
		System.out.println(nome);
		System.out.println(especialidade);
	}
}
