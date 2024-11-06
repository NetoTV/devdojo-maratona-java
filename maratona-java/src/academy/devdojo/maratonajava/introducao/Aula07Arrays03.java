package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
	public static void main(String[] args) {
		// Podemos declarar arrays de 3 formas no Java
		// 1 -
		// Inicializa uma quantidade x de valores, com os valores padrões 
		// (Nesse caso o valor é zero)
		int[] numeros = new int[3];
		
		// 2 -
		// Inicializa x valores já pré definidos, o valor maximo do array será definido
		// de forma dinâmica na inicialização
		int[] numeros2 = {1,2,3,4,5,6};
		
		// 3 -
		// Inicializa x valores já pré definidos, o valor maximo do array será definido
		// de forma dinâmica na inicialização, porém dessa vez é mais explicito a tipagem na declaração
		int[] numeros3 = new int[]{1,2,3,4,5,6};
		
		// For com indice
		System.out.println("Exemplo com for-loop com indice");
		for(int i = 0; i < numeros3.length; i++) {
		    System.out.println(numeros3[i]);
		}
		
		// Foreach
		System.out.println("\nExemplo com foreach");
		for(int numero : numeros3) {
		    System.out.println(numero);
		}
    }
}
