package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

// As classes de dominio ou model ou domain, 
// são classes que representam o mapeamento de algo do mundo real
// Elas não possuem o método main
// O método main é o ponto de entrada para a execução das classes no java.
// As classes no java, são "templates" (Plantas) que vão dar origem a objetos
// Isto é, ela diz como o objeto deve ser e o que ele deve possuir
// Esse "template" pode ter duas coisas
// - Atributos (Nome, sexo, idade)
// Atributos são a caracteristicas que vão representar o objeto 
// - Comportamento (Métodos)
public class Estudante {
    // Atributos da Classe
	// É possível inicializar um objeto de uma classe com um valor padrão usando 
	// a forma abaixo:
    public String nome = "Default";
    public int idade;
    public char sexo;
}

