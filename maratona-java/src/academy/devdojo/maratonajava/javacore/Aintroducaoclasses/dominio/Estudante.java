package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

// As classes de dominio ou model ou domain, 
// são classes que representam o mapeamento de algo do mundo real
// Elas não possuem o método main
// O método main no Java é o ponto de entrada para a execução das classes, por tanto os mesmos são utilizados
// para inicializar execução de um programa Java.
// As classes no java, são "templates" (Plantas) que vão dar origem a objetos
// Por exemplo uma Forma de Bolo
// Todo bolo que for feito com essa forma vai ter o mesmo formato, contudo o sabor e os ingredientes podem variar
// dessa forma podemos pensar que os ingredientes seriam um atributo do tipo array, logo todo bolo irá possuir
// um atributo ingredientes.
// Ex:
// public class Bolo {
// 		public String[] ingredientes;
//
//		public void assar() {
//			// Aqui vai a lógica de assar o bolo
//		}
// }
//
// Bolo boloLaranja = new Bolo();
// boloLaranja.ingredientes = new String[] { "Laranja", "Ovos", "Leite", "Farinha" };
// boloLaranja.assar();
//
// Bolo boloChocolate = new Bolo();
// boloLaranja.ingredientes = new String[] { "Chocolate", "Ovos", "Leite", "Farinha" };
// boloLaranja.assar();
//
// Como podemos ver acima, ambos bolos possuem o mesmo padrão de atributos e comportamentos
// porem cada um possui ingredientes diferentes.
//
// Poranto, a classe diz como o objeto deve ser e o que ele deve possuir
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

