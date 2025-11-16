package academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.dominio;

public class Local {
	private String endereco;
	
	public Local(String endereco) {
		this.endereco = endereco;
	}
	
	public void imprime() {
		System.out.println(endereco);
	}
}
