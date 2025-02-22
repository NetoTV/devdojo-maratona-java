package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
	
	public void imprime(Estudante estudante) {
		System.out.println("----------------------");
		
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
		
		// Isso vai alterar diretamente o valor no HEAP
		// Pois está utilizando o endereço de memória presente na variável local estudante que é uma cópia
		// do endereço de memória que foi passado como argumento para o método.
		// Logo ao acessar estudante.nome você está alterando o valor do atributo "nome" que está no heap.
		// Portanto todos lugares no código que possuam um acesso a esse endereço de memória poderão ver essa
		// mesma alteração, pois todos apontam para o mesmo lugar.
		// Isso é, ao alterar o atributo no heap via o endereço de memória, você está alterando o dado direntamente
		// no heap e consequentemente afetando todos lugares que estão usando esse mesmo atributo com base no
		// endereço de memória.
		estudante.nome = "Gohan";
		
		// Nesse caso a variável estudante que foi passada como argumento
		// não será afetada, pois a variável que está ficando null é a local, 
		// uma cópia que existe apenas dentro do escopo desse método atual.
		estudante = null;
		
		// A váriavel local possui a cópia do endereço de memória, portanto alterar ela direntamente, não afeta
		// o dado no HEAP, apenas se acessarmos algum atributo do mesmo, por exemplo: "estudante.nome"
		
		// Basicamente a variável local recebe uma cópia do endereço
		// de memória que foi passado via argumento
		// e ao alterar qualquer atributo referente a esse endereço
		// de memória, estará alterando o atributo do objeto real e não uma cópia
		// Contudo como a variável em si possui apenas uma cópia do
		// endereço de memória, alterar a mesma não irá afetar o objeto
		// original, apenas irá perder a referência em memória nesse mesmo escopo e alterar o valor presente
		// na variável local que existe dentro do método atual.
		
		System.out.println("\nValor variável local estudante ImpressoraEstudante.imprime = " + estudante);
	}
}
