package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
	private String nome;
	private double velocidadeMaxima;
	// Quando usamos a palavra reservada static em um atributo, dizemos que o
	// mesmo deixa de ser um dado relacionado diretamente com a instância (O próprio objeto)
	// e começa a fazer parte da própria classe, como se fosse um metadado da mesma
	// Nesse momento ele faz parte da própria classe "Carro"
	// Logo esse valor se torna "global" para todas as classes que podem acessa-lo
	// Todas instâncias dessa classe compartilham esse mesmo valor em memória
	private static double velocidadeLimite = 250;
	
	// Devemos criar atributos estáticos, quando os mesmos não dependem uma única 
	// instância, o mesmo deve possuír um valor que possa ser compartilhado entre todas instâncias da classe
	// e também possa ser utilizado para ser chamado em outros lugares do código, pois o mesmo vai se tornar parte da classe
	// como um "metadado"
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void imprime() {
		System.out.println("----------");
		System.out.println("Nome " + this.nome);
		System.out.println("Velocidade máxima " + this.velocidadeMaxima);
		// Quando acessamos valores com o "static" devemos chamar o nome da classe
		// para acessar o dado, pois o mesmo faz parte da classe agora e não mais do objeto em si
		// Contudo ainda é possível possível acessar o mesmo via o this.velocidadeLimite,
		// porém não é o ideal, o ideal é acessar o mesmo via o nome da classe
		System.out.println("Velocidade limite " + Carro.velocidadeLimite);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	// Podemos criar um método estático, quando o mesmo não depende de nenhum atributo da instância da classe
	// Obs: Métodos estáticos podem ser chamados em métodos não estáticos
	public static double getVelocidadeLimite() {
		// o this não existe nesse contexto pois o método é estático, sendo assim
		// esse método pode ser chamado sem a necessidade de uma instância
		// e a instância equivale ao this.
		// O this só pode ser usado em métodos não estáticos (Sem o "static").
		return velocidadeLimite;
	}
	
	// Podemos criar um método estático, quando o mesmo não depende de nenhum atributo da instância da classe
	// Obs: Métodos estáticos podem ser chamados em métodos não estáticos
	public static void setVelocidadeLimite(double velocidadeLimite) {
		// o this não existe nesse escopo pois o método é estático, sendo assim
		// esse método pode ser chamado sem a necessidade de uma instância
		// e a instância equivale ao this.
		// O this só pode ser usado em métodos não estáticos (Sem o "static").
		Carro.velocidadeLimite = velocidadeLimite;
	}
}
