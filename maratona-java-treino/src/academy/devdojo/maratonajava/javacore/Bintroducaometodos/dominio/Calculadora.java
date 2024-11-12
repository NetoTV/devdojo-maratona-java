package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
	
	// é realizada a cópia local dos argumentos passados, pois ambos, são do tipo primitivo inteiro
	public void alteraDoisNumeros(int numero1, int numero2) {
		System.out.println("Valor variáveis locais começo (Cópia dos bits): " + numero1 + " " + numero2);
		numero1 = 747;
		numero2 = 47;
		
		System.out.println("Valor variáveis locais após alteração: " + numero1 + " " + numero2);
	}
}
