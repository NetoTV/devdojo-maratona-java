package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {

	// Associação
	// A associação é o relacionamento entre dois objetos
	// Tipos de associações:
	// Jogador 1 -- 1 Personagem (Um jogador só pode ter 1 personagem e o personagem só pode pertencer a 1 jogador).
	// Time 1 -- N Jogador (Um time pode ter N (vários) jogadores).
	// Jogador N -- 1 Time (N (vários) jogadores podem ser do mesmo time).
	// Estudante N -- N Curso (N (vários) estudantes podem estar inscritos em N (vários) cursos e vários cursos podem ter vários estudantes).
	
	// 1 -- 1 - Um para um
	// 1 -- N - Um para muitos
	// N -- 1 - Muitos para um
	// N -- N - Muitos para muitos
	
	
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Pelé");
		Jogador jogador2 = new Jogador("Ronaldo");
		Jogador jogador3 = new Jogador("Neymar");
		Jogador[] jogadores = new Jogador[] {jogador1, jogador2, jogador3};
		
		// Podemos dizer que após a criação das variáveis acima,
		// Os Objetos em memória possuem duas referências em memória
		// uma sendo a própria variável, por exemplo jogador1 e a outra
		// sendo a posição 0 do array "jogadores"
		
		// Veja que a mesma referência em memória exibida ao printar os dados
		System.out.println("jogador1 = " + jogador1);
		System.out.println("jogadores[0] = " + jogadores[0]);
		
		for (Jogador jogador : jogadores) {
			jogador.imprime();
		}
	}

}
