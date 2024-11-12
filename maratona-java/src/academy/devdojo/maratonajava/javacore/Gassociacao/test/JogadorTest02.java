package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {

	public static void main(String[] args) {
		Jogador jogador = new Jogador("Pelé");
		jogador.imprime();

		System.out.println("--------------------");
		
		Time time = new Time("Seleção brasileira");
		// Essa associação é unidirecional pois até o momento
		// o Time não conhece o Jogador, apenas o Jogador
		// conhece o Time.
		
		// Um para muitos (1 Time pode estar presente em vários jogadores)
		jogador.setTime(time);
		
		jogador.imprime();
	}

}
