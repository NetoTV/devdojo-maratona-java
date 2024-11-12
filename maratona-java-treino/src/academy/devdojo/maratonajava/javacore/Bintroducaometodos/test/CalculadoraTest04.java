package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int numero1 = 6, numero2 = 4;
		
		calculadora.alteraDoisNumeros(numero1, numero2);
		
		System.out.println("Valor variáveis de fora após rodar o método: " + numero1 + " " + numero2);
	}
}
