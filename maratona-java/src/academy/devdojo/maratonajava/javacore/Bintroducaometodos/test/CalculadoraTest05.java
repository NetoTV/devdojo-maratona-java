package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
	// É possível também usar varargs no main
	// Podemos escrever arrays assim:
	// int[] numeros
	// int numeros[]
	// porém, os varargs só pode com os 3 pontos após o tipo.
	// Ex: String... args
	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();
		int[] numeros = {1, 2, 3, 4}; // new int[] {1, 2, 3, 4}
		calculadora.somaArray(numeros);
		calculadora.somaVarArgs(1, 2, 4, 87);
		// O VarArgs também aceita array como um parâmetro
		// Contúdo quando trabalhamos com varargs podemos receber apenas
		// 1 tipo de parâmetro caso o varargs esteja no começo
		// Ex: (int... numeros, String texto) - Isso vai causar um erro de
		// compilação, só é possível utilizar varargs com outros parametros
		// se ele for o último parâmetro.
		// Ex: (String texto, int... numeros)
		calculadora.somaVarArgs(numeros);
	}
}
