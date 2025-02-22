package academy.devdojo.maratonajava.javacore.Gassociacao.test;

// A Classe Scanner faz parte do pacote java.util que é um pacote muito conhecido no mundo Java
import java.util.Scanner;

public class LeituraDoTecladoTest01 {

	public static void main(String[] args) {
		// Para realizar a leitura das teclas pressionadas pelo teclado
		// Iremos chamar uma Classe do Java que é responsável especificamente para
		// esse propósito (Leitura dos dados do teclado)
		// Ela se chama Scanner
		
		// para criarmos uma Instância do Scanner, precisamos passar um dado do tipo InputStream
		// como argumento, o System.in é do tipo InputStream, por isso funciona dessa forma
		Scanner entradaDeDados = new Scanner(System.in);
		// o Next faz a leitura do que for escrito no console, porém é importante se atentar que
		// ele vai pegar apenas a primeira palavra que for escrita, delimitada por espaço " "
		// String next = entradaDeDados.next();
		// System.out.println(next);
		// Por exemplo, se você escrever "AOBA MEU"
		// o valor que vai ser retornado pelo método next() vai ser apenas o texto "AOBA".
		// Portanto se você quer ler todo o texto digitado incluindo os espaços, 
		// utilize o "nextLine()"
		System.out.println("Digite seu nome abaixo");
		String nome = entradaDeDados.nextLine();
		System.out.println("Digite sua idade");
		int idade = entradaDeDados.nextInt();
		System.out.println("Digite M ou F para seu sexo");
		// o método charAt pode ser usado em objetos do tipo de referência String,
		// o mesmo espera um parâmetro inteiro que irá ser utilizado para acessar um indíce
		// do texto existente na String portanto o charAt(0) irá acessar a primeira letra 
		// presente em uma string
		char sexo = entradaDeDados.next().charAt(0);
		
		System.out.println("-----------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
	}

}
