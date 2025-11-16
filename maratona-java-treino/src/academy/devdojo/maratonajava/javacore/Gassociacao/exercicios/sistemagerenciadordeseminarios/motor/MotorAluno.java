package academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.motor;

import java.util.Arrays;
import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.util.ConsoleUtils;

public class MotorAluno {
	
	private final Scanner entrada;
	private Aluno[] alunos = new Aluno[10];
	private int contadorAlunos = 0;
	
	public MotorAluno(Scanner entrada) {
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
		boolean isArrayNoTamanhoLimite = contadorAlunos == alunos.length;
		
		if (isArrayNoTamanhoLimite) {
			int novoTamanho = alunos.length + alunos.length / 2;
			alunos = Arrays.copyOf(alunos, novoTamanho);
		} 
		
		System.out.println("Digite o nome do estudante:");
		
		String nome = entrada.nextLine();
		
		System.out.println("Digite a idade do estudante:");
		
		short idade = entrada.nextShort();
		entrada.nextLine();
		
		alunos[contadorAlunos] = new Aluno(nome, idade);
		contadorAlunos++;
	}
	
	private void listar() {
		if (contadorAlunos == 0) {
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoComeco();
			System.out.println("Nenhum estudante foi encontrado.");
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoFim();
		}
		else {
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoComeco();
			System.out.println("Listando estudantes...");
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoFim();
			
			for (int index = 0; index < contadorAlunos; index++) {
				alunos[index].imprime();
			}
		}
	}
}
