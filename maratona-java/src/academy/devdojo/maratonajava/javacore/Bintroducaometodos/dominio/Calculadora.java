package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

// public é um modificador de acesso (Visibilidade)
public class Calculadora {
	
	// A primeira parte de um método sempre vai ser um modificador de acesso
	// Ex: public
	
	// A segunda parte é o retorno do metódo, pode ser vázio (void) ou pode conter um
	// valor
	// Ex: void, int, boolean, etc...
	
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
	// Paramêtros são variáveis locais que só vão existir dentro do escopo, ou seja,
	// dentro das chaves do método
	
	// Elas só vão se manter "vivas" dentro desse contexto
	// Após isso elas perderão o acesso em memória
	
	// É recomendado que um método possua no máximo 3 argumentos
	// O Ideal é dividir em métodos menores se possível
	
	public void multiplicaDoisNumeros(int num1, int num2) {
		System.out.println(num1 * num2);
	}
}
