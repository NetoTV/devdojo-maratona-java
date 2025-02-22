package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

// public é um modificador de acesso (Visibilidade)
public class Calculadora {
	
	// A primeira parte de um método sempre vai ser um modificador de acesso
	// Ex: public
	
	// A segunda parte é o retorno do metódo, pode ser vázio (void) ou pode conter um
	// valor
	// Ex: void, Tipos primitivos (boolean, int), Tipos de Referência, etc...
	
	// A terceira parte é nome do método (Para nomenclatura é utilizada
	// a mesma convenção das variáveis).
	
	// A Quarta parte é os parenteses "()"
	// A Quinta é as chaves "{}" (O Corpo do método)
	// Dentro do "corpo do método" estará o código que será executado no momento que
	// o método for "chamado".
	
	public void somaDoisNumeros() {
		System.out.println(5 + 4);
	}
	
	public void subtraiDoisNumeros() {
		System.out.println(1 - 3);
	}
	
	// Métodos com paramêtros
	// Paramêtros são variáveis locais que só vão existir dentro do escopo
	// enquanto o método estiver executando, ou seja, dentro das chaves ({}).
	
	// As variáveis locais só vão se manter "vivas" enquanto o método
	// estiver sendo executado.
	// Após isso elas perderão o acesso em memória
	
	// É recomendado que um método possua no máximo 3 parâmetros
	// O Ideal é dividir em métodos menores caso o mesmo passe de 3 argumentos
	
	// num1 e num2 são os "parâmetros" (variáveis locais do método)
	public void multiplicaDoisNumeros(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	// Métodos com retorno
	// o retorno de um método pode ser um tipo primitivo ou um tipo de referência (Objeto)
	// caso o método possua um retorno em sua definição, porém
	// não tenha a palavra return escrita dentro do seu "corpo", 
	// irá ocorrer um erro de compilação.
	
	public double divideDoisNumeros(double num1, double num2) {
		if (num2 == 0) {
			return 0;
		}
		
		return num1 / num2;
	}
	
	public void imprimeDivisaoDoisNumeros(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Não existe divisão por zero!");
			return; // Esse return funciona como um "break" do for, ele vai sair para fora do método
			// sem retornar nada
		}
		
		// Poderiamos utilizar um else em vez do return caso quiséssemos 
		// Ex:
		// if (num2 == 0) {
		//	System.out.println("Não existe divisão por zero!");
		// } else {
		//	System.out.println(num1 / num2);
		// }
		
		System.out.println(num1 / num2);
	}
	
	// Parametrôs como tipo primitivo
	// Quando passamos um tipo primitivo como argumento para um parâmetro de um método
	// será criado uma variável local que irá armazenar uma cópia do valor do argumento recebido.
	// Isto é, ela não salva o endereço de memória / Referência do valor recebido.
	// Logo caso o valor da variável seja alterado dentro durante a execução do método
	// o valor do argumento cujo foi passado como parâmetro não será afetado.
	// Exemplo abaixo e na classe CalculadoraTest04
	public void alteraDoisNumeros(int numero1, int numero2) {
		// A alteração desses valores não irá afetar a variável que foi passada como
		// argumento para o método, pois é realizada a copia dos dados para as
		// variáveis locais int numero1, int numero2, pois ambas são tipos primitivos.
		// É realizado uma "cópia" dos bits presentes no argumento!!!
		numero1 = 2;
		numero2 = 3;
		
		System.out.println("(Escopo local - método alteraDoisNumeros) Valor numero1 = " + numero1);
		System.out.println("(Escopo local - método alteraDoisNumeros) Valor numero2 = " + numero2);
	}
	
	public void somaArray(int[] numeros) {
		int soma = 0;
		
		for(int numero: numeros) {
			soma += numero;
		}
		
		System.out.println(soma);
	}
	
	// Por baixo dos panos o java transforma o "varargs" em um array
	// O VarArgs é uma forma mais simples de trabalhar com multiplos
	// dados do mesmo tipo como argumento, podendo receber múltiplos números em
	// sequência ex: somaVarArgs(1, 2, 3, 4) e convertendo os mesmos
	// para um array posteriormente, ou podendo receber um array inteiro
	// de uma vez só
	// Ele aceita receber um array
	// Contúdo quando trabalhamos com varargs podemos receber apenas
	// 1 tipo de parâmetro caso o varargs esteja no começo
	// Ex: (int... numeros, String texto) - Isso vai causar um erro de
	// compilação, só é possível utilizar varargs com outros parametros
	// se ele for o último parâmetro.
	// Ex: (String texto, int... numeros)
	public void somaVarArgs(int... numeros) {
		int soma = 0;
		
		for(int numero: numeros) {
			soma += numero;
		}
		
		System.out.println(soma);
	}
}
