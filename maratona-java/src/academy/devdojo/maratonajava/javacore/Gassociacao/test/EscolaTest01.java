package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {

	public static void main(String[] args) {
		Professor professor1 = new Professor("Jiraya Sensei");
		Professor professor2 = new Professor("Kakashi Sensei");
		// Muitos para um - Vários professores podem estar na mesma escola
		Professor[] professores = new Professor[] {professor1, professor2};
		
		// Associacao unidirecional pois apenas a escola sabe quais são 
		// os professores
		Escola escola = new Escola("Konoha", professores);
		escola.imprime();
	}

}
