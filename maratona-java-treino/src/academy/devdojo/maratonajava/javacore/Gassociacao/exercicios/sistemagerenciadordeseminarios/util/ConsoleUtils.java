package academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.sistemagerenciadordeseminarios.util;

public class ConsoleUtils {
	public static final String SEPARADOR_DE_LINHA = "=========================================================";
	
	public static void printSejaBemVindo() {
		System.out.println(SEPARADOR_DE_LINHA);
		System.out.println("Seja bem-vindo ao sistema de gerenciamento de seminários!");
		System.out.println(SEPARADOR_DE_LINHA);
	}
	
	public static void printOpcoesInicias() {
		printSeparadorDeLinhaComEspacoNoComeco();
		System.out.println("Selecione uma das opções abaixo:");
		System.out.println("1 - Seminários");
		System.out.println("2 - Estudantes");
		System.out.println("3 - Professores");
		System.out.println("4 - Locais");
		System.out.println("0 - Sair");
		printSeparadorDeLinhaComEspacoNoFim();
	}
	
	public static void printOpcoesPadroes() {
		printSeparadorDeLinhaComEspacoNoComeco();
		System.out.println("Selecione uma das opções abaixo:");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Listar");
		System.out.println("0 - Voltar");
		printSeparadorDeLinhaComEspacoNoFim();
	}
	
	public static void printOpcaoInvalida() {
		printSeparadorDeLinhaComEspacoNoComeco();
		System.out.println("Opção inválida, tente novamente!");
		printSeparadorDeLinhaComEspacoNoFim();
	}
	
	public static void printSeparadorDeLinhaComEspacoNoComeco() {
		System.out.println();
		System.out.println(SEPARADOR_DE_LINHA);
	}
	
	public static void printSeparadorDeLinhaComEspacoNoFim() {
		System.out.println(SEPARADOR_DE_LINHA);
		System.out.println();
	}
}
