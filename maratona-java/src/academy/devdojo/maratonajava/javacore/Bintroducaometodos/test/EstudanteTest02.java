package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
	public static void main(String[] args) {
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		
		estudante01.nome = "Midoriya";
		estudante01.idade = 15;
		estudante01.sexo = 'M';
		
		estudante02.nome = "Sakura";
		estudante02.idade = 16;
		estudante02.sexo = 'F';
		
		// As variáveis de referência (estudante01 e estudante02)
		// Servem como um "controle remoto"
		// Onde os botões serão as funcionalidades que o objeto possui
		// no caso do objeto Estudante, ele possui atributos
		// nome, idade e sexo
		// e o método imprime()
		// ao chamar "estudante.imprime()" o objeto executa a implementação 
		// do método imprime() cujo está definido dentro dele
		estudante01.imprime();
		estudante02.imprime();
	}
}
