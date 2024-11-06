package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.nome = "Kakashi Hatake";
		professor.idade = 30;
		professor.sexo = 'M';
		
		System.out.printf("nome = %s, idade = %d, char = %c%n",
				professor.nome, professor.idade, professor.sexo);
	}
}
