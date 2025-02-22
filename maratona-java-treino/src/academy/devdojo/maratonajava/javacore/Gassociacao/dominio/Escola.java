package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
	private String nome;
	// Relacionamento de 1 - N (Um para muitos, uma escola pode ter vários professores diferentes)
	private Professor[] professores;
	
	// Nossa escola vai poder ser criada sem ter os professores inicialmente
	public Escola(String nome) {
		this.nome = nome;
	}

	public Escola(String nome, Professor[] professores) {
		this(nome);
		this.professores = professores;
	}
	
	public void imprime() {
		System.out.println(this.nome);
		
		if(this.professores != null) {
			for(Professor professor : professores) {
				System.out.println("Professor " + professor.getNome());
			}
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor[] getProfessores() {
		return professores;
	}

	public void setProfessores(Professor[] professores) {
		this.professores = professores;
	}
}
