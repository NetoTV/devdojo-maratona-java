package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
	public String nome;
	public int idade;
	// Isso aumenta o consumo de memória pois sempre vai inicializar um array
	// no heap com os valores padrões sendo 0, portanto talvez não seja
	// a melhor forma de resolver o exercício
	// Porém evita null pointer nesse código
	public double[] salarios = new double[3];
	
	public void imprimirDados() {
		String textoImpressao = "Dados do funcionário:"
			   + "\n- Nome = " + this.nome
			   + "\n- Idade = " + this.idade
			   + "\n- Salários = " + getSalariosFormatadosEmTexto();
		System.out.println(textoImpressao);
		imprimirMediaSalarial();
	}
	
	public String getSalariosFormatadosEmTexto() {
		String salariosFormatadosEmTexto = "";
		
		for(int contador = 0; contador < salarios.length; contador++) {
			salariosFormatadosEmTexto += salarios[contador];
			
			boolean isUltimoSalario = contador == salarios.length - 1;
			if(!isUltimoSalario) {
				salariosFormatadosEmTexto += ", ";
			}
		}
		
		return salariosFormatadosEmTexto;
	}
	
	// Nesse caso talvez fosse mais interessante colocar toda essa questão de 
	// média salarial em uma classe que trata apenas isso, por questão da coesão
	// da Classe Funcionário (Isso abaixa a coesão da classe, pois aumenta o número
	// de responsabilidades da mesma!).
	public void imprimirMediaSalarial() {
		System.out.println("- Média salarial = " + getMediaSalarial());
	}
	
	public double getMediaSalarial() {
		return getTotalSalario() / this.salarios.length;
	}
	
	public double getTotalSalario() {
		double totalSalario = 0;
		
		for(double salario : this.salarios) {
			totalSalario += salario;
		}
		
		return totalSalario;
	}
}
