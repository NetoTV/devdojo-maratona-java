package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua José Margareta");
		endereco.setCep("01533-217");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("José");
		pessoa.setCpf("258.362.925-17");
		pessoa.setEndereco(endereco);
		
		pessoa.imprime();
		
		// A classe Funcionario é uma classe especializada da classe pessoa 
		// Todos atributos (caracteristicas) e métodos (comportamentos) da classe Pessoa estão sendo herdados (estendidos) para a classe Funcionario
		// Quando fazemos isso, acaba que acoplamos fortemente ambas classes por conta da extensão das funcionalidades.
		// Por conta disso é interessante evitar herança e usar somente quando necessário pois, ela causa alto acoplamento do código
		// o que pode ser ruim para a manutenção e alterações da regra de negócio do seu programa a longo prazo.
		//
		// A herença pode ser usada de duas formas: Quando queremos utilizar polimorfismo no nosso codigo ou quando queremos
		// estender caracteristicas e comportamentos para outras classes.
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("José de assis");
		funcionario.setCpf("721.635.642-29");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(20000);
		
		System.out.println("==============");
		funcionario.imprime();
	}
}
