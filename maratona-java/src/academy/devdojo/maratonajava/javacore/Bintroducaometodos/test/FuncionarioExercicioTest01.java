package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExercicioTest01 {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Paulo";
		funcionario.idade = 18;
		funcionario.salarios[0] = 1200;
		funcionario.salarios[1] = 400;
		funcionario.salarios[2] = 900;
		
		funcionario.imprimirDados();
	}

}
