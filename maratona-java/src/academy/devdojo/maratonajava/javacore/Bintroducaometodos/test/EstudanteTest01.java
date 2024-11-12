package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		ImpressoraEstudante impressora = new ImpressoraEstudante();
		
		estudante01.nome = "Midoriya";
		estudante01.idade = 15;
		estudante01.sexo = 'M';
		
		estudante02.nome = "Sakura";
		estudante02.idade = 16;
		estudante02.sexo = 'F';
		
		// Quando um objeto / Tipo de referência é passado como argumento de um método
		// A variável local do método armazena uma cópia da referência do objeto
		// ou seja seu endereço de memória
		impressora.imprime(estudante01);
		System.out.println("Valor estudante01 EstudanteTest01 = " + estudante01);

		impressora.imprime(estudante02);
		
		System.out.println("Valor estudante02 EstudanteTest01 = " + estudante02);
	
		System.out.println("\n##########################\n");
		
		impressora.imprime(estudante01);
		impressora.imprime(estudante02);
	}
}
