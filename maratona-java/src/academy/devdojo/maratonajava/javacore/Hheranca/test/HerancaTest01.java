package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

/*
 * O que é a herança?
 * Herança é um mecanismo da programação orientada a objetos que permite que uma classe mais específica
 * reaproveite (herde) características e comportamentos de uma classe mais genérica.
 * 
 * - Características: atributos da classe (ex: nome, idade, cor).
 * - Comportamentos: métodos da classe (ex: andar(), falar(), calcular()).
 * 
 * Ou seja, quando uma classe herda de outra, ela automaticamente possui os atributos e métodos
 * da classe pai (super classe), podendo utilizá-los ou sobrescrevê-los se necessário.
 */

/*
 * Use herança apenas quando fizer sentido dizer que uma classe É um tipo da outra.
 * Ex: Cachorro É um Animal. Professor É uma Pessoa.
 *
 * Ao usar herança, você cria um vínculo forte entre as classes — mudanças na classe base
 * podem quebrar todas as classes filhas. Por isso, use com cuidado.
 *
 * Herança = "É um" (relação forte e fixa)
 * Associação = "Tem um" (relação mais flexível e com menos acoplamento)
 *
 * Prefira associação sempre que possível; herança só quando a relação for realmente verdadeira.
 */
public class HerancaTest01 {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua 3");
		endereco.setCep("012345-209");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Zoro");
		pessoa.setCpf("576.116.700-00");
		pessoa.setEndereco(endereco);
		
		pessoa.imprime();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Oda Nobunaga");
		funcionario.setCpf("355.054.170-86");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(20000);
		
		System.out.println("------------");
		funcionario.imprime();
	}
}
