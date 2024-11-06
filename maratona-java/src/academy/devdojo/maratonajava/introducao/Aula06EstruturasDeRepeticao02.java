package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {

    public static void main(String[] args) {
	// Imprima todos os números pares de 0 até 1000000
	for(int contador = 0; contador <= 1000000; contador++) {
	    boolean isNumeroPar = contador % 2 == 0;
	    if(isNumeroPar) {		
		System.out.println(contador);
	    }
	}
    }

}
