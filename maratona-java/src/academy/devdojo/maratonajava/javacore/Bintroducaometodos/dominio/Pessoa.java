package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

// Acoplamento é quanto uma classe está conectada com outra
// Alto acoplamento é ruim, baixo é bom
public class Pessoa {
	// Quando o modificador de acesso de um atributo é do tipo "private"
	// Apenas o mesmo objeto vai poder visualizar e acessar o dado.
	private String nome;
	private int idade;
	
	public void imprime() {
		// De preferência sempre chamar diretamente a variável dessa forma
		// Pois vai consumir menos processamento e fica mais legível
		// Só usar o get/set dentro do mesmo objeto se for realmente necessário
		System.out.println(this.nome);
		System.out.println(this.idade);
	}
	
	// Quando criarmos atributos privados:
	// Normalmente criamos métodos que vão permitir o acesso a esses atributos
	// Logo o método fica público mas o atributo fica privado
	// o método serve como uma camada de acesso e alteração do atributo
	// Por possuirmos essa "camada" (método setNome), podemos dizer que o acoplamento
	// é baixo.
	// Agora que possuímos uma "camada" podemos adicionar validações nela que serão
	// aplicadas para todos lugares que forem alterar a idade, assim mantendo um padrão
	// em todo o código, assim mantendo o mesmo comportamento de forma igual (Bom).
	// Por convenção no java trabalhamos com métodos get e set
	// Exemplo abaixo:
	public void setNome(String nome) {
		// this referência o objeto atual e o this.nome referência ao 
		// nome do objeto atual
		// já o nome recebido via parâmetro é uma variável local cujo vai armazenar
		// a cópia referência em memória da String que foi passada como argumento para o
		// método setNome
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	// get - Pega um dado
	// set - Atualiza um dado
	public void setIdade(int idade) {
		if(idade < 0) {
			System.out.println("Idade inválida: " + idade);
			return;
		}
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
}
