package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
	public static void main(String[] args) {
		// No caso do acoplamento entre a classe Pessoa e PessoaTest01
		// Ambas estão extremamente conectadas pois estamos acessando
		// Os atributos do objeto Pessoa de forma pública
		// Por exemplo o dado: pessoa.nome = "Algo"
		// isso é um "Alto" acomplamento pois está acessando de forma direta
		// um atributo da classe Pessoa na classe PessoaTest01
		// Pessoa pessoa = new Pessoa();
		// pessoa.nome = "Jiraya";
		// pessoa.idade = 70;
		
		// Para diminuir o acoplamento entre essas duas classes é necessário utilizar
		// o princípio do encapsulamento da P.O.O (Programação Orientada a Objetos).
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Jiraya");
		pessoa.setIdade(-1);
		// pessoa.imprime();
		
		// Convenção do encapsulamento no Java (Getters and Setters)
		// Getter (getAlgo)
		// Setter (setAlgo)
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
	}
}
