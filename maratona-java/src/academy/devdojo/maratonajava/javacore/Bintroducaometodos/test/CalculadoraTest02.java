package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		// Quando você passa valores para executar um método, o termo técnico
		// utilizado para se referir ao dado passado é argumento.
		// Por exemplo, na chamada do método: calculadora.dividir(2, 4), os números
		// 2 e o 4 serão considerados "argumentos" do método "dividir", já quando 
		// falamos da própria implementação do método na classe, as variáveis
		// locais do método dividir serão chamadas de "parâmetros".
		// Ex:
		// public double getDivisao(double numero1, double numero2) {
		// 		return numero1 / numero2;
		// }
		// Nesse caso o numero1 e o numero2 são os parâmetros
		// e a chamada do método passando os valores são os argumentos:
		// Classe.getDivisao(2, 6);
		// o "2" e o "6" são os meus argumentos.
		
		// Em caso de argumentos do tipo primitivo, os mesmos serão "copiados"
		// em memória para as variáveis locais (paramêtros) do método
		// portanto quando se utiliza tipos primitivos é passado uma cópia do valor
		// original e não o valor em si.
		calculadora.multiplicaDoisNumeros(3, 2);
	}

}
