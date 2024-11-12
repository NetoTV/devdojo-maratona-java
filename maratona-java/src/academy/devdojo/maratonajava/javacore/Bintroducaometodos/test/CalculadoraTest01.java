package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

	// Saida e retorno são coisas diferentes, no caso dos metodos
	// somaDoisNumeros e subtraiDoisNumeros
	// ambos retornam vázio (void)
	// porém a saida (Sysout) existe dentro deles.
	
	// No momento de execução do método, o código entra dentro do objeto para
	// executar o método a partir da sua referência armazenada na variável calculadora
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.somaDoisNumeros();
		System.out.println("--------------");
		calculadora.subtraiDoisNumeros();
	}
	
}
