package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

/*
 * Relacionamento Funcionario x Pessoa -> IS-A (Funcionário é uma Pessoa) - Herança
 * Relacionamento Pessoa x Endereco -> HAS-A (Pessoa tem um Endereço) - Associação
 * 
 * Funcionário herda os atributos e comportamentos de Pessoa e adiciona características específicas.
 * 
 * Portanto Pessoa é um conceito mais genérico.
 * Já Funcionário é um conceito mais especializado de Pessoa.
 * Por isso ele vai estender o que uma Pessoa é.
 * 
 * Para isso vamos utilizar a palavra reservada extends.
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
