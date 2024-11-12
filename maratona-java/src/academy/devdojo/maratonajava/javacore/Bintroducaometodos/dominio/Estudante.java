package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
	public String nome;
	public int idade;
	public char sexo;
	
	// Alguns métodos diminuem a coesão da classe em si
	// O ideal é evitar métodos desnecessários para manter a alta coesão
	// da classe (Responsabilidade única)
	// No caso da própria impressão é uma boa prática manter ela na própria classe
	// e será visto com mais detalhes posteriormente
	public void imprime() {
		// A palavra this refere-se ao próprio objeto que foi gerado pela
		// classe, portanto ele pode acessar tudo que o objeto possui,
		// como por exemplo abaixo, os seus atributos (nome, idade, sexo):
		System.out.println("--------------");
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.sexo);
		
		// caso não exista nenhuma variável local com o mesmo nome
		// dos atributos da Classe em si (Estudante.nome)
		// pode ser chamado diretamente pelo próprio nome, pois só existe
		// o atributo do objeto nesse contexto que é o nome.
		// Por exemplo:
		// System.out.println(nome);
		// System.out.println(idade);
		// System.out.println(sexo);
		// Contudo o recomendado é manter sempre com o "this" na frente
		// como foi feito anteriormente

	}
}
