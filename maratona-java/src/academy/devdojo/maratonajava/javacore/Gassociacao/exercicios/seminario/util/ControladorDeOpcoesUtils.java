package academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.seminario.util;

import java.util.Scanner;
import java.util.function.Function;

public class ControladorDeOpcoesUtils {
	public static int getOpcaoSelecionada(Scanner input, Function<Integer, Boolean> checkOpcaoSelecionadaValida) {
		int opcaoSelecionada = -1;
		
		do {
			try {
				System.out.print("Digite uma opção: ");
				opcaoSelecionada = input.nextInt();
				
				// Essa linha serve para limpar o buffer, se não vai ficar em looping infinito
				// Se quiser validar, basta entrar no Scanner.class:994 o atributo buf vai estar com o texto do último input
				if  (!checkOpcaoSelecionadaValida.apply(opcaoSelecionada)) throw new Exception("Opção inválida!");
				input.nextLine();
				
				break;
			} catch (Exception e) {
				System.out.println();
				System.out.println("Por favor, digite uma opção válida!");
				System.out.println();
				
				input.nextLine();
			}
			
		} while(true);
		
		return opcaoSelecionada;
	}
}
