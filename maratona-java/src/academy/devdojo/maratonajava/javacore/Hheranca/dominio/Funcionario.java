package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

/*
 * A classe Funcionario é uma versão mais específica da classe Pessoa.
 *
 * Isso quer dizer que todo Funcionário também é uma Pessoa, por isso ele
 * automaticamente herda tudo que uma Pessoa já possui (nome, cpf, endereço).
 * 
 * Em cima disso, a classe Funcionario adiciona coisas novas que fazem sentido
 * apenas para um Funcionário — como o atributo "salario".
 *
 * Sobre “usar herança quando a relação for verdadeira”:
 * - Isso significa: só coloque "extends" se realmente fizer sentido dizer
 *   em português que "um X é um Y".
 *   Exemplo: "Um Funcionário É uma Pessoa" → faz sentido.
 *
 * Quando *não* faz sentido dizer "X é Y", você não deveria usar herança.
 * Exemplo: "Um Carro é um Motor" → isso não faz sentido.
 * Nesses casos, um objeto deve apenas ter o outro como parte dele.
 *
 * Então, resumindo:
 * - Use herança quando um objeto for uma versão mais específica do outro.
 * - Funcionario é uma Pessoa mais especializada → herança faz sentido.
 */
public class Funcionario extends Pessoa {
	
	private double salario;
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
