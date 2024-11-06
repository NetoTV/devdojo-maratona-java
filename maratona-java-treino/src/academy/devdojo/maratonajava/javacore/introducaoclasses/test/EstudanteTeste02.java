package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
	public static void main(String[] args) {
		// No java quando declaramos variáveis do tipo reference, é necessário inicializar
		// as mesmas caso contrário o compilador irá acusar de erro quando as mesmas forem
		// utilizadas
		// 
		// Ex: String texto;
		// System.out.println(texto); // Erro de compilação
		//
		// Contudo, os atributos de uma classe, inicializam com valores padrões
		// No caso das variáveis de referência, elas inicializam como null
		// int inicializa como 0
		// char inicializa como um caractere vazio
		
		Estudante estudante = new Estudante();
		System.out.println(estudante);
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
		
	}
}
