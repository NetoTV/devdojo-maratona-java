package academy.devdojo.maratonajava.javacore.introducaoclasses.dominio;

// Classe de domínio Pessoa - Representa uma padrão do que é uma pessoa
// do mundo real no mundo computacional
public class Estudante {
	// Uma pessoa pode ter um nome.
	public String nome;
	// Uma pessoa pode ter idade.
	public int idade;
	// Uma pessoa pode ter sexo.
	public char sexo;
}

//	Orientação a objetos foi criada para mapear de forma computacional algo do mundo real.
//	
//	Por exemplos, no mundo real, existem pessoas.
//	Logo para mapear a mesma no mundo computacional, devemos seguir com a criação de 
//  uma estrutura que irá gerar uma estrutura de dados organizada denominada Pessoa.
//	Essa estrutura de criação, é chamada de classe.
//	
//	public class Pessoa {
//	  private String nome;
//	  private short idade;
//	  private char sexo;
//	
//	  public Pessoa() { }
//	
//	  public Pessoa(String nome, short idade, char sexo) {
//		this.nome = nome;
//		this.idade = idade;
//		this.sexo = sexo;
//	  }
//	
//	  // Getters && Setters
//	  public String getNome() {
//		return this.nome;
//	  }
//	  public void setNome(String nome) {
//	  	this.nome = nome;
//	  }
//	
//	  // Assim vai
//	}


/*
 * Classes de domínio não possuem o método main (DEFINIÇÃO ABAIXO)
 * main - (Método que serve como ponto de entrada para a inicialização de um Projeto Java!!!)
 */

/*
	Coesão
	
	Um código Coeso é aquele cujo não mistura responsabilidades cujo não pertencem ao
	mesmo.
	
	Uma classe coesa, é aquela cujo possui atributos e comportamentos cujo pertencem 
	de fato a ela, por exemplo:
	
	Classe Aluno possui:
	- nome
	- idade
	- sexo
	
	caso o aluno possua um professor, o ideal é criar uma classe professor e evitar
	coisas dentro do Aluno como:
	
	- nomeProfessor
	- idadeProfessor
	- sexoProfessor
	
	Pois esses dados são relacionados ao professor em si e não o aluno, não é coeso
	armazenarmos dados cujos são relacionados de forma indireta em uma mesma classe.
	
	Isso pode causar problemas de escalabilidade por conta da falta de responsabilidade
	única para cada classe.
*/