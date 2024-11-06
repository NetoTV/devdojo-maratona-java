package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
		// A esquerda temos uma variável de referência que armazena
		// Objetos do tipo Estudante
		// Estudante estudante
		// e a direita temos uma instânciação da Classe Estudante, que irá gerar um
    	// objeto do tipo Estudante
		Estudante estudante = new Estudante();
		estudante.nome = "Gab";
		estudante.idade = 17;
		estudante.sexo = 'M';
		
		System.out.println(estudante);
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
    }
}
