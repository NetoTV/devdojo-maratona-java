package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

/*
 * Quando realizamos associação no Java estamos acoplando as classes
 * Se o acoplamento for bidirecional (ambas classes conheceram umas as outras), faz com que o acoplamento seja forte.
 * Isso faz com que seja mais díficil de reutilizarmos as classes.
 * Por tanto só deve se realizar o acoplamento bidirecional na associação quando realmente faz sentido.
 * Nesse contexto, faz sentido a Pessoa ter um Endereço, mas não faz sentido o Endereço ter uma Pessoa.
 * */
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
