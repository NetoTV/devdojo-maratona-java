package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.nome = "Ferrari";
		carro1.modelo = "F80";
		carro1.anoLancamento = 2013;
		
		System.out.printf("Carro - nome = %s, modelo = %s, ano de lançamento = %d\n",
				carro1.nome, carro1.modelo, carro1.anoLancamento);
		
		Carro carro2 = new Carro();
		carro2.nome = "Bentley";
		carro2.modelo = "Bentayga";
		carro2.anoLancamento = 2015;
		
		// É possível mudar a referência de uma variável de referência no meio do código
		// Ex:
		// carro2 = carro1;
		
		System.out.printf("Carro 2 - nome = %s, modelo = %s, ano de lançamento = %d",
				carro2.nome, carro2.modelo, carro2.anoLancamento);
	}

}
