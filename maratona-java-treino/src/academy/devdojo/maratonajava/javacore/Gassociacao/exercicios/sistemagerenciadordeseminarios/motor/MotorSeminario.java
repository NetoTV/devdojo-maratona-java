package academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.motor;

import java.util.Arrays;
import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.dominio.Seminario;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.util.ConsoleUtils;

public class MotorSeminario {
	
	private final Scanner entrada;
	private Seminario[] seminarios = new Seminario[10];
	private int contadorSeminarios = 0;
	
	public MotorSeminario(Scanner entrada) {
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
		boolean isArrayNoTamanhoLimite = contadorSeminarios == seminarios.length;
		
		if (isArrayNoTamanhoLimite) {
			int novoTamanho = seminarios.length + seminarios.length / 2;
			seminarios = Arrays.copyOf(seminarios, novoTamanho);
		} 
		
		System.out.println("Digite o titulo do seminário:");
		
		String titulo = entrada.nextLine();
		
		seminarios[contadorSeminarios] = new Seminario(titulo);
		contadorSeminarios++;
	}
	
	private void listar() {
		if (contadorSeminarios == 0) {
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoComeco();
			System.out.println("Nenhum seminário foi encontrado.");
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoFim();
		}
		else {
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoComeco();
			System.out.println("Listando seminários...");
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoFim();
			
			for (int index = 0; index < contadorSeminarios; index++) {
				seminarios[index].imprime();
			}
		}
	}
}
