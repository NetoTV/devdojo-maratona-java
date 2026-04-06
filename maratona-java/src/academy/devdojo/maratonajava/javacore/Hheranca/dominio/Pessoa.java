package academy.devdojo.maratonajava.javacore.Hheranca.dominio;


/*
 * O que é herança no Java?
 *
 * Suponha que temos uma classe chamada Pessoa. Ela representa uma pessoa do mundo real
 * e possui características básicas como nome, cpf e endereço.
 *
 * Agora imagine que precisamos criar a classe Funcionario. Um funcionário também possui
 * nome, cpf e endereço (as mesmas características de uma Pessoa), mas acrescenta
 * um novo atributo: salário.
 *
 * Como podemos afirmar que todo Funcionario "é uma" (IS-A) Pessoa, podemos utilizar
 * herança para reaproveitar os atributos e comportamentos já definidos na classe Pessoa.
 * Dessa forma, evitamos duplicação de código e mantemos um modelo mais organizado.
 *
 * Em resumo:
 * - Pessoa define características e comportamentos comuns.
 * - Funcionario estende Pessoa, herdando tudo que Pessoa possui, além de adicionar o que é específico.
 */
public class Pessoa {
	private String nome;
	private String cpf;
	/*
	 * Aqui temos um exemplo de associação (HAS-A):
	 * A classe Pessoa "tem um" Endereco.
	 *
	 * Quando dizemos que "uma classe utiliza outra como parte de sua composição",
	 * significa que um objeto precisa de outro objeto para representar algo completo.
	 * Ou seja, uma Pessoa não é um Endereco, mas possui um Endereco como parte das
	 * suas informações. Assim, a classe Pessoa armazena um objeto do tipo Endereco
	 * dentro dela para representar seu estado.
	 *
	  * Em resumo:
	 * - Herança (IS-A): Funcionario é uma Pessoa. 
	 *   Esse é um tipo de acoplamento forte, pois a subclasse depende diretamente
	 *   da estrutura e do comportamento da superclasse.
	 *
	 * - Associação (HAS-A): Pessoa tem um Endereco.
	 *   Esse é um acoplamento mais fraco, pois Pessoa apenas utiliza Endereco como
	 *   parte de seus dados, sem depender profundamente da sua implementação.
	 * 
	 * Em outras palavras: um Funcionario possui tudo o que uma Pessoa já tem (nome, cpf, endereço) e ainda adiciona informações 
	 * extras que só um funcionário possui, como salário, cargo, matrícula etc.
	 * 
	 * O Funcionario é uma Pessoa, porém com atributos adicionais e mais específicos; portanto, 
	 * ele é uma versão mais especializada de Pessoa.
	 */
	private Endereco endereco;
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.getEndereco().getRua() + " " + this.getEndereco().getCep());
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
