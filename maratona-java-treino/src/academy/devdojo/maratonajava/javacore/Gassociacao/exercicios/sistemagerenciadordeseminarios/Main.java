package academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios;

import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.motor.MotorAluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.motor.MotorLocal;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.motor.MotorProfessor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.motor.MotorSeminario;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.util.ConsoleUtils;

public class Main {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		MotorSeminario motorSeminario = new MotorSeminario(entrada);
		MotorAluno motorAluno = new MotorAluno(entrada);
		MotorProfessor motorProfessor = new MotorProfessor(entrada);
		MotorLocal motorLocal = new MotorLocal(entrada);
		
		ConsoleUtils.printSejaBemVindo();
		
		boolean isPararExecucaoPrograma = false;
		
		do {
			ConsoleUtils.printOpcoesInicias();
			
			char opcaoSelecionada = entrada.nextLine().charAt(0);
			
			switch (opcaoSelecionada) {
				case '1':
					motorSeminario.processar();
					break;
				case '2':
					motorAluno.processar();
					break;
				case '3':
					motorProfessor.processar();
					break;
				case '4':
					motorLocal.processar();
					break;
				case '0':
					isPararExecucaoPrograma = true;
					break;
				default:
					ConsoleUtils.printOpcaoInvalida();
			}
			
		} while (!isPararExecucaoPrograma);
	}
}
