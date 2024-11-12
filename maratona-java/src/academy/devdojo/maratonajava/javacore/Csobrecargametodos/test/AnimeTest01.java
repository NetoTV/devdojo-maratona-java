package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {

	public static void main(String[] args) {
		Anime anime = new Anime();
		// anime.setNome("Akudama Drive");
		// anime.setTipo("TV");
		// anime.setEpisodios(12);
		
		// Criando método init para substituir os sets acima
		anime.init("Akudama Drive", "TV", 12);
		// Método com sobrecarga
		anime.init("Akudama Drive 2", "TV", 12, "Ação");
		
		anime.imprime();
	}

}
