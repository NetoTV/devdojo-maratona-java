package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		// Por padrão o método divideDoisNumeros só retorna (Devolve) o valor, 
		// porém o mesmo não é exibido no console nesse momento
		double resultadoDivisao = calculadora.divideDoisNumeros(64554, 342);
		
		// Só será imprimido no console após a execução do System.out.println
		System.out.println(resultadoDivisao);
		
		calculadora.imprimeDivisaoDoisNumeros(1, 0);
	}
	
}
