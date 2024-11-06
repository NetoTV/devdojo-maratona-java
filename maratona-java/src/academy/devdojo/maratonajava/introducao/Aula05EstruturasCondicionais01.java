package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
	
	// O If serve para realizar condições dentro do seu código
	// A sintaxe recomendada é a seguinte:
	
	if(true) {
	    // Faço Algo aqui
	}
	
	// Porém é possível escrever Ifs sem as chaves
	// Funciona apenas quando dentro do If tiver apenas UMA LINHA A SER EXECUTADA
	boolean omitindoChaves = true;
	if (omitindoChaves)
	    System.out.println("Omitindo chaves!");
	
	// Assim também funciona
	if (omitindoChaves) System.out.println("Omitindo chaves(2)!\n");
	
	/* ======================================================================== */
	
	int idade = 19;
	boolean isAutorizadoComprarBebida = idade >= 18;
	
	if (isAutorizadoComprarBebida) {
	    System.out.println("Pode comprar bebida alcoólica!");
	}
	
	// Operador Lógico de Negação
	// - NOT (!): O elemento precisa ser FALSE para resultar em TRUE.
	
	// Inverte o resultado do valor booleano
	if (!isAutorizadoComprarBebida) {
	    System.out.println("Não pode comprar bebida alcoólica!");
	}
	
	// Caso de certificação
	
	// Primeiro atribui o valor para a variável 'c'
	// Depois verifica o valor da variável
	// Caso true entra no IF
	
	boolean c = false;
	if (c = true) {
	    System.out.println("A variável 'c' é true\n");
	}
	
	// If e Else
	boolean minhaCondicao = false;
	if(minhaCondicao) {
	    System.out.println("Posso fazer algo quando minhaCondicao for true");
	} else {
	    System.out.println("Posso fazer algo quando minhaCondicao não for true");
	}
    }
}
