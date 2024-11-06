package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		// Quando você passa valores para executar um método, o termo técnico
		// utilizado para citar o ato é dado como argumento.
		// Por exemplo, na chamada do método: calculadora.dividir(2, 4), os números
		// 2 e o 4 serão considerados "argumentos" do método "dividir", já quando 
		// falamos da própria implementação do método na classe, os dados serão 
		// chamados de parametros.
		
		// Os argumentos passados na execução do método serão colocado dentro das
		// variáveis locais definidas nos parametros do método dentro da classe
		calculadora.multiplicaDoisNumeros(3, 2);
	}

}
