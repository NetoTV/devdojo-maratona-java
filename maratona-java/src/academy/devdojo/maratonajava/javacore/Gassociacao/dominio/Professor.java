package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
	private String nome;
	private String especialidade;
	// Associação unidirecional (Professor -> Seminario):
	// Esta classe mantém uma referência para Seminario[], indicando que um Professor
	// pode estar associado a vários Seminarios. É unidirecional porque a classe
	// Seminario não possui referência de volta para Professor, ou seja, apenas
	// o Professor conhece os Seminarios associados.
	private Seminario[] seminarios;

	public Professor(String nome) {
		this.nome = nome;
	}

	public Professor(String nome, String especialidade) {
		this(nome);
		this.especialidade = especialidade;
	}
	
	public Professor(String nome, String especialidade, Seminario[] seminarios) {
		this(nome, especialidade);
		this.seminarios = seminarios;
	}
	
	public void imprime() {
		System.out.println("--------");
		System.out.println("Professor: " + this.nome);
		
		if (this.seminarios == null) return;
		System.out.println("## Seminários cadastrados ##");
		
		for (Seminario seminario : this.seminarios) {
			System.out.println(seminario.getTitulo());
			System.out.println(seminario.getLocal().getEndereco());
			
			Aluno[] alunos = seminario.getAlunos(); // <- Variável para melhorar clareza
			
			if (alunos == null || alunos.length == 0) continue;
			System.out.println("** Alunos **");
			
			for (Aluno aluno : alunos) {
				System.out.println("Aluno: " + aluno.getNome() + ", idade: " + aluno.getIdade());
			}
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public Seminario[] getSeminarios() {
		return seminarios;
	}
	
	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
}
