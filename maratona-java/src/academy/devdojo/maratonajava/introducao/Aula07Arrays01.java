package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
	// Arrays são Objetos que podem carregar multiplos valores do mesmo tipo
	// variáveis desse tipo são consideradas um tipo de referência
	// Para declarar um array deve se escrever new tipoDoArray[QUANTIDADE_MAXIMA_DE_VALORES];
	// Observação: O Tamanho dos arrays não pode ser aumentado dinamicamente
	// Isto é, em tempo de execução.
	// Por Exemplo:
	int[] idades = new int[3];
	
	// Isso vai printar a posição em memoria do array no Heap
	System.out.println("Posição em memória: " + idades);
	
	// Isso vai printar o valor dentro do array na posição 0
	// Por padrão os valores inicializados dentro do array serão 0
	System.out.println(idades[0]);
	
	idades[0] = 21;
	idades[1] = 19;
	idades[2] = 23;
	
	System.out.println(idades[0]);
	System.out.println(idades[1]);
	System.out.println(idades[2]);
	
	// Caso você tente chamar uma posição do array cujo esteja fora dos limites definidos
	// na criação do mesmo, você terá um java.lang.ArrayIndexOutOfBoundsException
	System.out.println(idades[3]);
	
	// Isso vale também para caso você atribua um valor a um índice inexistente
	idades[3] = 50;
	
	// Quando ocorre uma Exception o programa para de funcionar, portanto a 
	// linha abaixo não será executada em tempo de execução
	System.out.println("oi");
    }
}
