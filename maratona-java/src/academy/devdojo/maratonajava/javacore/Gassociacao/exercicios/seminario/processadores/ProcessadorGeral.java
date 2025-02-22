package academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.seminario.processadores;

import java.util.Scanner;
import java.util.function.Function;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.seminario.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.seminario.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.seminario.dominio.Seminario;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.seminario.util.ControladorDeOpcoesUtils;

public class ProcessadorGeral {
	
	private final static Function<Integer, Boolean> checkOpcaoSelecionadaValida;
	public static Seminario[] seminarios;
	public static Aluno[] alunos;
	public static Local[] locais;
	
	static {
		checkOpcaoSelecionadaValida = opcaoSelecionada -> {
			return opcaoSelecionada >= 0 && opcaoSelecionada <= 4;
		};
	}
	
	public static void processar() {
		Scanner input = new Scanner(System.in);
		System.out.println("Seja bem-vindo ao sistema de gerenciamento de seminários!");
		
		do {
			System.out.println();
			System.out.println("----- Opções Gerais -----");
			System.out.println();
			System.out.println("Selecione uma das opções abaixo: ");
			
			System.out.println("1 - Seminário");
			System.out.println("2 - Aluno");
			System.out.println("3 - Professor");
			System.out.println("4 - Local");
			System.out.println("0 - Finalizar o programa");
			System.out.println();
			
			int opcaoSelecionada = ControladorDeOpcoesUtils.getOpcaoSelecionada(input, checkOpcaoSelecionadaValida);
			
			if(opcaoSelecionada == 1) {
				ProcessadorSeminario processadorSeminario = new ProcessadorSeminario();
				processadorSeminario.processar(input);
				
			} else if (opcaoSelecionada == 0) break;
			
		} while (true);
		
		input.close();
		
		System.out.println();
		System.out.println("Finalizando o programa, agradecemos a sua preferência.");
	}
	
	public static void addSeminario(Seminario seminario) {
		if (ProcessadorGeral.seminarios == null) {
			ProcessadorGeral.seminarios = new Seminario[] { seminario };
		} else {
			atualizaSeminarios(seminario);
		}
	}
	
	private static void atualizaSeminarios(Seminario seminario) {
		Seminario[] novosSeminarios = new Seminario[ProcessadorGeral.seminarios.length + 1];
		
		for(int index = 0; index < ProcessadorGeral.seminarios.length; index++) {
			novosSeminarios[index] = ProcessadorGeral.seminarios[index];
		}
		
		novosSeminarios[novosSeminarios.length - 1] = seminario;
		ProcessadorGeral.seminarios = novosSeminarios;
	}

	public static Seminario[] getSeminarios() {
		return seminarios;
	}

	public static Aluno[] getAlunos() {
		return alunos;
	}
	
	public static Local[] getLocais() {
		return locais;
	}
}
