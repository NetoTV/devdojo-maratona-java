package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int num1 = 7;
		int num2 = 8;
		
		calculadora.alteraDoisNumeros(num1, num2);
		System.out.println("(Escopo CalculadoraTest04) Valor num1 = " + num1);
		System.out.println("(Escopo CalculadoraTest04) Valor num2 = " + num2);
	}
}
