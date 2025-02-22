package academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.seminario.processadores;

import java.util.Scanner;
import java.util.function.Function;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.seminario.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.seminario.dominio.Seminario;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.seminario.util.ControladorDeOpcoesUtils;

public class ProcessadorSeminario {
	
	private final static Function<Integer, Boolean> checkOpcaoSelecionadaValida;
	
	static {
		checkOpcaoSelecionadaValida = opcaoSelecionada -> {
			return opcaoSelecionada >= 0 && opcaoSelecionada <= 1;
		};
	}
	
	public void processar(Scanner input) {
		do {
			System.out.println();
			System.out.println("----- Opções do Seminário -----");
			System.out.println();
			System.out.println("Selecione uma das opções abaixo: ");
			System.out.println("1 - Criar um novo Seminário");
			System.out.println("0 - Voltar");
			System.out.println();
			
			int opcaoSelecionada = ControladorDeOpcoesUtils.getOpcaoSelecionada(input, checkOpcaoSelecionadaValida);
			
			switch(opcaoSelecionada) {
				case 1:
					ProcessadorGeral.addSeminario(criarSeminario(input));
					break;
				case 0:
					return;
			}
			
		} while (true);
	}
	
	private Seminario criarSeminario(Scanner input) {
		System.out.println();
		System.out.println("----- Criação do Seminário -----");
		System.out.println();
		System.out.println("Por favor, preencha os dados abaixo para criar um novo seminário.");
		
		System.out.print("Digite o título do seminário: ");
		String tituloSeminario = input.nextLine();
		
		System.out.print("Digite o endereço do seminário: ");
		String enderecoSeminario = input.nextLine();
		
		Seminario seminario = new Seminario(tituloSeminario, new Local(enderecoSeminario));
		seminario.imprime();
		
		return seminario;
	}
}
