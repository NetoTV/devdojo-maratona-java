package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {

    public static void main(String[] args) {
	// while, do while, for
	int contador = 0;
	
	// Repete enquanto a condição for true
	while (contador < 10) {
	    System.out.println("Contagem While " + ++contador);
	}
	
	// O Do antes do while é executado ao menos uma vez
	// Apos isso ele verifica a condição
	// Se true, repete o bloco do
	contador = 0;
	do {
	    System.out.println("Contagem Do While " + ++contador);
	} while (contador < 10);
	
	// For
	// Usado para contagem com indices
	
	for(int i = 1; i <= 10; i++) {
	    System.out.println("Contagem Do For " + i);
	}

	// É possivel usar outras váriaveis também
	for(contador = 1; contador <= 10; contador++) {
	    System.out.println("Contagem Do For Com Contador " + contador);
	}
    }

}
