package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 números de um dado valor.
    public static void main(String[] args) {
	int valorMaximo = 50;
	for(int i = 0; i <= valorMaximo; i++) {
	    int limiteInterno = 25;
	    boolean isForaDoLimiteInterno = i > limiteInterno;
	    
	    if(isForaDoLimiteInterno) {
		break;
	    }
	    
	    System.out.println(i);
	}
    }

}
