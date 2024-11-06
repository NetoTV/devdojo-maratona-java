package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    // No java os tipos primitivos que forem declarados dentro de um escopo de classe
    // São automaticamente inicializados com um valor padrão
    // Por exemplo:
    int idade;
    // Por padrão int inicializa com o valor "0"
    // Contudo em escopos locais tais como de métodos, isso não ocorre
    // Portanto é obrigatorio a inicialização
    
    public static void main(String[] args) { 
		String[] nomes = new String[4];
		// String é um Objeto, portanto ele é inicializado com null por padrão
		// Por default String inicializa com "null"
		System.out.println(nomes[0]);
		
		nomes[0] = "Hinata";
		nomes[1] = "Ino";
		nomes[2] = "Sakura";
		
		System.out.println("\nArray atual (nomes)");
		
		for(int i = 0; i < nomes.length; i++) {
		    System.out.println(nomes[i]);
		}
		
		// Se você atribuir outro new String[5]
		// Os valores armazenados serão perdidos pois você está mudando referência em
		// memória para o array criado anteriormente
		nomes = new String[5];
		
		System.out.println("\nNovo array (nomes = new String[5];)");
		
		for(int i = 0; i < nomes.length; i++) {
		    System.out.println(nomes[i]);
		}
    }
}
