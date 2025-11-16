package academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.motor;

import java.util.Arrays;
import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.util.ConsoleUtils;

public class MotorProfessor {
	
	private final Scanner entrada;
	private Professor[] professores = new Professor[10];
	private int contadorProfessores = 0;
	
	public MotorProfessor(Scanner entrada) {
		this.entrada = entrada;
	}
	
	public void processar() {
		boolean isVoltar = false;
		
		do { 
			ConsoleUtils.printOpcoesPadroes();
			
			char opcaoSelecionada = entrada.nextLine().charAt(0);
			
			switch (opcaoSelecionada) {
				case '1':
					cadastrar();
					break;
				case '2':
					listar();
					break;
				case '0':
					isVoltar = true;
					break;
				default:
					ConsoleUtils.printOpcaoInvalida();
			}
			
		} while (!isVoltar);
		
	}
	
	private void cadastrar() {
		boolean isArrayNoTamanhoLimite = contadorProfessores == professores.length;
		
		if (isArrayNoTamanhoLimite) {
			int novoTamanho = professores.length + professores.length / 2;
			professores = Arrays.copyOf(professores, novoTamanho);
		} 
		
		System.out.println("Digite o nome do professor:");
		
		String nome = entrada.nextLine();
		
		System.out.println("Digite a especialidade do professor:");
		
		String especialidade = entrada.nextLine();
		
		professores[contadorProfessores] = new Professor(nome, especialidade);
		contadorProfessores++;
	}
	
	private void listar() {
		if (contadorProfessores == 0) {
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoComeco();
			System.out.println("Nenhum professor foi encontrado.");
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoFim();
		}
		else {
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoComeco();
			System.out.println("Listando professores...");
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoFim();
			
			for (int index = 0; index < contadorProfessores; index++) {
				professores[index].imprime();
			}
		}
	}
}
