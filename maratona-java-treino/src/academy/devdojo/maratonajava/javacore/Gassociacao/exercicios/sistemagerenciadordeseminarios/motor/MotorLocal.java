package academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.motor;

import java.util.Arrays;
import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.util.ConsoleUtils;

public class MotorLocal {

	private final Scanner entrada;
	private Local[] locais = new Local[10];
	private int contadorLocais = 0;
	
	public MotorLocal(Scanner entrada) {
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
		boolean isArrayNoTamanhoLimite = contadorLocais == locais.length;
		
		if (isArrayNoTamanhoLimite) {
			int novoTamanho = locais.length + locais.length / 2;
			locais = Arrays.copyOf(locais, novoTamanho);
		} 
		
		System.out.println("Digite o endereço do local:");
		
		String endereco = entrada.nextLine();
		
		locais[contadorLocais] = new Local(endereco);
		contadorLocais++;
	}
	
	private void listar() {
		if (contadorLocais == 0) {
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoComeco();
			System.out.println("Nenhum local foi encontrado.");
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoFim();
		}
		else {
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoComeco();
			System.out.println("Listando locais...");
			ConsoleUtils.printSeparadorDeLinhaComEspacoNoFim();
			
			for (int index = 0; index < contadorLocais; index++) {
				locais[index].imprime();
			}
		}
	}
}
