package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Luffy", 23);
		Aluno[] alunosParaSeminario = new Aluno[] { aluno };
		
		Local local = new Local("Rua das Laranjeiras");
		
		Seminario seminario = new Seminario("Como achar o one piece?", alunosParaSeminario, local);
		Seminario[] seminariosDisponiveis = new Seminario[] { seminario };
		
		Professor professor = new Professor("Shanks", "Pirata");
		professor.setSeminarios(seminariosDisponiveis);
		
		professor.imprime();
	}
}
