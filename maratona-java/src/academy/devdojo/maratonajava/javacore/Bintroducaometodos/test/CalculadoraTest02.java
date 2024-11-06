package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		// Quando você passa valores para executar um método, o termo técnico
		// utilizado para citar o ato é dado como argumento, porém caso você 
		// esteja falando especificamente da implementação dos valores do método
		// na classe, o nome é parametro.
		
		// Os argumentos passados na execução do método serão colocado dentro das
		// variáveis locais definidas nos parametros do método dentro da classe
		calculadora.multiplicaDoisNumeros(3, 2);
	}

}
