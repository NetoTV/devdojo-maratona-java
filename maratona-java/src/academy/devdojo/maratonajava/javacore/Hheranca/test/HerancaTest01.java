package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

/*
 * A herança acopla fortemente duas classes.
 * É recomendado evitar, pois qualquer alteração na classe mais Genérica, vai afetar as classes mais Especificas.
 * 
 * Você utiliza herança em dois contextos:
 * 
 * - Quando você quer estender as funcionalidades de uma classe para uma mais específica.
 * - Quando você quer utilizar polimorfismo.
 * */
public class HerancaTest01 {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua 4");
		endereco.setCep("031050-042");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Dio Brando");
		pessoa.setCpf("631.242.317-23");
		pessoa.setEndereco(endereco);
		
		pessoa.imprime();
		
		System.out.println("\n======================\n");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Toreto");
		funcionario.setCpf("736.132.762-85");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(1000.00);

		funcionario.imprime();
	}
}
