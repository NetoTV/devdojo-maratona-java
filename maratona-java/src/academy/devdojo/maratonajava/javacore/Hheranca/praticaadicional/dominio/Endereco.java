package academy.devdojo.maratonajava.javacore.Hheranca.praticaadicional.dominio;

/*
 * Associações entre classes criam dependências (acoplamento). Isso é normal,
 * mas quando usamos associações bidirecionais sem necessidade, acabamos
 * aumentando o acoplamento de forma desnecessária.
 *
 * Quanto maior o acoplamento, menor é a capacidade de reutilização e
 * de manutenção da classe, já que ela passa a depender do funcionamento
 * de outras classes.
 *
 * Por isso, prefira associações unidirecionais sempre que possível.
 *
 * Neste caso, não faz sentido que Endereco conheça Pessoa (HAS-A). Apenas
 * Pessoa precisa conhecer seu Endereco. Assim evitamos uma associação
 * bidirecional desnecessária.
 */
public class Endereco {
	private String rua;
	private String cep;
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
}
