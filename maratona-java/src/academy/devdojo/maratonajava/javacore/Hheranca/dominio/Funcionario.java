package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

/*
 * A classe Funcionario é uma versão mais específica da classe Pessoa.
 *
 * Isso significa que:
 * - Todo Funcionário também É uma Pessoa (relação IS-A).
 * - Portanto, ele herda automaticamente tudo o que uma Pessoa possui
 *   (nome, cpf, endereço).
 *
 * Além disso, a classe Funcionario adiciona características que só fazem
 * sentido para quem é funcionário — como o atributo "salario".
 *
 * -----------------------------
 * Quando usar herança?
 * -----------------------------
 * Use herança apenas quando a frase “Um X É um Y” realmente fizer sentido
 * em português.
 *
 * Exemplo que faz sentido:
 * - "Um Funcionário É uma Pessoa."  → herança válida.
 *
 * Exemplo que NÃO faz sentido:
 * - "Um Carro É um Motor." → errado → isso seria composição, não herança.
 *
 * Ou seja:
 * - Herança deve representar especialização.
 * - Funcionario é uma Pessoa mais especializada.
 *
 * ---------------------------------------------------------------
 * Como funciona na memória? (Explicação importante)
 * ---------------------------------------------------------------
 * Mesmo que Funcionario herde de Pessoa, NÃO são criados dois objetos.
 * Existe apenas *um único objeto* na memória.
 *
 * Esse objeto contém:
 * - a parte da classe Pessoa (superclasse)
 * - a parte da classe Funcionario (subclasse)
 *
 * Quando usamos:
 * - super → acessamos o comportamento da superclasse, MAS no mesmo objeto.
 * - this  → acessamos os membros da classe atual (Funcionario), MAS no mesmo objeto.
 *
 * Ou seja: super e this não criam objetos diferentes. Eles apenas indicam
 * de qual “camada” da classe o método pertence, mas tudo ocorre dentro
 * do mesmo objeto.
 */

public class Funcionario extends Pessoa {
	
	private double salario;
	
	static {
		System.out.println("Dentro do bloco inicialização estático de Funcionario");
	}
	
	{
		System.out.println("Dentro do bloco inicialização de Funcionario 1");
	}
	
	{
		System.out.println("Dentro do bloco inicialização de Funcionario 2");
	}
	
	/*
	 * Como Funcionario estende Pessoa, ele deve seguir as regras de construção
	 * estabelecidas pela superclasse.
	 *
	 * Regra da herança para construtores:
	 * Se a classe mãe (Pessoa) declara qualquer construtor (ou seja, não possui
	 * mais um construtor padrão gerado automaticamente pelo compilador), a
	 * subclasse (Funcionario) é obrigada a invocar explicitamente um dos
	 * construtores da superclasse.
	 *
	 * Isso é feito por meio da palavra-chave 'super', passando os argumentos
	 * exigidos pelo construtor apropriado da superclasse.
	 *
	 * Caso a superclasse possua um construtor padrão (sem parâmetros) e você
	 * não invoque 'super' explicitamente, o compilador inserirá automaticamente
	 * uma chamada implícita a super().
	 *
	 * Importante: a chamada ao construtor da superclasse sempre ocorre antes de
	 * qualquer outra instrução do construtor da subclasse — é a primeira operação
	 * executada no processo de construção do objeto.
	 *
	 * Observação adicional: em Java, toda classe herda, direta ou indiretamente,
	 * da classe java.lang.Object. Portanto, mesmo quando uma classe não declara
	 * explicitamente uma superclasse, ela estende Object por padrão. Assim, se
	 * nenhuma chamada explícita a super() for fornecida, o compilador insere
	 * automaticamente super(), que nesse caso invoca o construtor padrão de
	 * Object, completando a cadeia de inicialização da hierarquia de classes.
	 */
	public Funcionario(String nome) {
	    super(nome);
	    System.out.println("Dentro do construtor de funcionário");
	}
	
	/*
	 * Sobrescrita (override):
	 * -----------------------
	 * Ao sobrescrever um método, mantemos:
	 * - nome do método igual
	 * - tipo de retorno igual
	 * - parâmetros iguais
	 *
	 * A ideia é modificar o comportamento herdado da superclasse (Pessoa)
	 * para algo mais adequado à classe mais específica (Funcionario).
	 *
	 * Sobre o uso de "super.imprime()":
	 * --------------------------------
	 * Aqui chamamos a versão do método "imprime" que pertence à classe Pessoa.
	 * Isso não cria um novo objeto! Ele apenas invoca o comportamento da
	 * superclasse usando o MESMO objeto Funcionario que já existe na memória.
	 *
	 * Depois disso, imprimimos também o salário, que é específico de Funcionario.
	 */
	public void imprime() {
		super.imprime(); // executa o comportamento do método imprime da classe Pessoa
		System.out.println(this.salario); // imprime o comportamento específico do Funcionario
	}
	
	public void relatorioPagamento() {
		/* Se nós tentarmos executar essa linha abaixo:
		 * System.out.println(this.nome);
		 * a mesma não irá compilar, pois o atributo nome possui o modificador de acesso "private" e portanto o mesmo só pode ser
		 * acessado a partir da classe Pessoa, mesmo que a classe Funcionario herde os atributos da classe Pessoa.
		 * 
		 * Para resolver isso, teremos que mudar o modificador de acesso do atributo nome para "protected"
		 * protected -> Qualquer subclasse, em qualquer pacote vai ter acesso direto aos atributos. 
		 * Independente de onde elas estiverem.
		 * Porém todas as classes que estiverem no mesmo pacote também terão acesso a variável.
		 */
		System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
