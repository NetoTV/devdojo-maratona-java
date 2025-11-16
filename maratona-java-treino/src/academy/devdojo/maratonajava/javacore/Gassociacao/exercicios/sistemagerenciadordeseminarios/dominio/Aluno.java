package academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.dominio;

public class Aluno {
	private String nome;
	private short idade;
	private Seminario seminario;
	
	public Aluno(String nome, short idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void imprime() {
		System.out.println(nome);
		System.out.println(idade);
	}
}
