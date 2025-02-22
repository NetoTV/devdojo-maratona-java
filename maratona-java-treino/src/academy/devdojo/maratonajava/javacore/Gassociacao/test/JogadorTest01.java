package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {

	// Antes de falar sobre associação, vamos ver primeiramente como é o código do java, quando possuímos
	// arrays do tipo de referência (Objeto)
	
	// Associacao é como dois objetos podem se relacionar ou se relacionam
	// A associação normalmente é determinada em 4 tipos, sendo as seguintes:
	// Um para um (Ex: Um jogador pode controler apenas 1 personagem)
	// Um para muitos (Ex: Uma guilda pode ter vários jogadores)
	// Muitos para um (Ex: Vários jogadores podem pertencer a uma mesma guilda)
	// Muitos para muitos (Ex: Vários pessoas podem ter vários jogos - Steam)
	
	// Além disso a associação pode ser unidirecional ou bidirecional
	// Isso é:
	// Se um Time pode ter vários jogadores e eu declarei uma classe Time com um atributo do tipo array de Jogador
	// isso é uma relação unidirecional, porém caso eu tivesse também dentro do Jogador
	// um atributo chamado Time, o relacionamento seria bidirecional, pois o relacionamento estaria presente em 
	// ambas classes
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Pelé");
		Jogador jogador2 = new Jogador("Maradona");
		Jogador jogador3 = new Jogador("Mbappé");
		
		// Caso nos queiramos agrupar os jogadores acima em um array, devemos fazer da seguinte forma:
		// Primeiro, iremos criar um array de jogadores:
		Jogador[] jogadores = new Jogador[] { jogador1, jogador2, jogador3 };
		// Estamos criando um array de Jogador, cujo irá receber a referência em memória de 3 objetos distintos
		// A variável de referência "jogadores" faz referência ao array com 3 posições
		// Porém possuímos as variáveis jogador1, jogador2 e jogador3 
		// e cada um deles fazem referência a objetos em memória
		// portanto cada posição do indice vai fazer referência ao mesmo endereço de memória que as variáveis
		// que foram passadas como argumento para o array.
		
		for (Jogador jogador : jogadores) {
			jogador.imprime();
		}
		
		// Quando um array é criado, os valores presentes dentro do mesmo serão apenas uma cópia do valor passado
		// para o índice, portanto se o valor que for passado como argumento for alterado, não irá afetar o valor
		// dentro do índice, apenas se for um atributo de um tipo de referência
		// Segue o exemplo abaixo:
		// int numero1 = 5;
		// int numero2 = 15;
		// 
		// int[] numeros = new int[2];
		// 
		// numeros[0] = numero1;
		// numeros[1] = numero2; 
		// 
		// for(int numero : numeros) {
		// 	System.out.println(numero);
		// }
		// 
		// numero1 = 0;
		// 
		// for(int numero : numeros) {
		// 	System.out.println(numero);
		// }
		
	}

}
