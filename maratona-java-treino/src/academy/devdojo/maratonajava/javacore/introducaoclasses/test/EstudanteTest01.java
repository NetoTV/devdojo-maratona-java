package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

	public static void main(String[] args) {
		// Váriavel de referência do tipo Estudante
		// Para criar um novo estudante, devemos criar uma instância da classe Estudante
		// ou seja, vamos criar um objeto cujo possui toda a padronização do que é um
		// Estudante
		// Para fazermos isso escrevemos new Estudante();
		// Isso vai criar um objeto do tipo Estudante.
		Estudante estudante = new Estudante();
		
		// No caso para acessarmos os atributos de um objeto, utilizamos o endereço de memoria
		// cujo fica salvo na variável de referência (Estudante estudante).
		// Ex: academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante@372f7a8d
		System.out.println(estudante);
		
		estudante.nome = "Josias";
		estudante.idade = 21;
		estudante.sexo = 'M';
				
		// Objetos são salvos no HEAP
	}
}

//	Variáveis de referência
//
//	As variáveis de referência podem referenciar objetos a partir de seu endereço de
//	memória.
//
//	é possível trocar o endereço de memória ou seja referenciar a variável de referência
//	a um novo objeto, basta utilizar o operador de atribuição "=".
//
//	Ex:
//
//	Estudante estudante = new Estudante();
//	estudante.nome = "Paulo";
//
// Criando um novo estudante e substituindo o atual
//	estudante = new Estudante();
//	estudante.nome = "Josias";
