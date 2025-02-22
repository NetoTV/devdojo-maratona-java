package academy.devdojo.maratonajava.javacore.Gassociacao.exercicios.seminario.dominio;

public class Seminario {
	private String titulo;
	private Aluno[] alunos;
	private Local local;
	
	public Seminario(String titulo, Local local) {
		this.titulo = titulo;
		this.local = local;
	}
	
	public Seminario(String titulo, Local local, Aluno[] alunos) {
		this.titulo = titulo;
		this.local = local;
		this.alunos = alunos;
	}
	
	public void imprime() {
		System.out.println("----- Seminário -----");
		System.out.println("Titulo: " + this.titulo);
		
		if(this.alunos != null) {
			System.out.println("Alunos: ");
			
			for(Aluno aluno : this.alunos) {
				System.out.println("- " + aluno.getNome());
				System.out.println("- " + aluno.getIdade());
			}
		}
		
		if(this.local != null) {
			System.out.println("Endereço: " + this.local.getEndereco());
		}
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Aluno[] getAlunos() {
		return alunos;
	}
	
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public Local getLocal() {
		return local;
	}
	
	public void setLocal(Local local) {
		this.local = local;
	}
}
