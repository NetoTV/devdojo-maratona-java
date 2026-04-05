package academy.devdojo.maratonajava.javacore.Hheranca.praticaadicional.dominio;

/*
 * A classe Funcionario representa um Funcionário no mundo real.
 * Todo funcionario é uma pessoa
 * Portanto o mesmo precisa ter um Nome, Cpf, Endereco e salário.
 * Portanto todo funcionario deve possuir as mesmas caracteristicas e comportamentos que uma pessoa.
 * Porem para nós não termos duplicar as caracteristicas (atributos) e comportamentos (métodos) das classe
 * Pessoa. Vamos "extender" as caracteristicas e comportamentos da classe Pessoa, para o funcionário.
 * A relação entre Funcionário e Pessoa, é de IS-A ou seja, Funcionario é um Pessoa.
 * A partir disso podemos usar a palavra "extends" para extender as  caracteristicas e comportamentos da classe Pessoa,
 * para o funcionário.
 * 
 * Podemos afirmar também que a Classe Funcionário é uma Classe Especializada da Classe Pessoa.
 * e por conta disso a Classe Pessoa é uma classe mais Genérica.
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
