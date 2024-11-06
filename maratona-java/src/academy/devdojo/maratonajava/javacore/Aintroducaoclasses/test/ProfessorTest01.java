package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    // No Java existe o que chamamos de coesão
    // Quando temos uma classe que tem um propósito único, ela é cosiderada de alta coesão (BOM)
    // Quando temos mais de uma responsabilidade em uma mesma classe, 
	// é considerado de baixa coesão (RUIM)
    // Classes devem ter um propósito único
    public static void main(String[] args) {
		Professor professor = new Professor();
		professor.nome = "Jailson";
		professor.idade = 33;
		professor.sexo = 'M';
		
		System.out.println("Nome: " + professor.nome 
			+ ", idade: " + professor.idade + " e sexo: " + professor.sexo);
	}
}
