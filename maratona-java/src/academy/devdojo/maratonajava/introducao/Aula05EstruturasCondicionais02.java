package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
	int idade = 15;
	// Variáveis que estão dentro de métodos possuem escopo local
	// Toda variável de escopo local, deve ser inicializada antes
	// que você tente executá-las
	
	String categoria = "Categoria ";
	
	// Usar else if quando quiser validar múltiplos cenários diferentes
	if(idade < 15) {
	    categoria += "Infantil";
	} else if(idade >= 15 && idade < 18) {
	    categoria += "Juvenil";
	} else {
	    categoria += "Adulto";
	}
	
	System.out.println(categoria);
    }
}
