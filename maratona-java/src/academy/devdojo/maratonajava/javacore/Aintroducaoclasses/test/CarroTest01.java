package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
		Carro carro1 = new Carro();
		
		carro1.nome = "Lamborghini";
		carro1.modelo = "Aventador";
		carro1.ano = 2011;
		
		System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
		
		System.out.println("============================");
		
		Carro carro2 = new Carro();
		
		carro2.nome = "Ferrari";
		carro2.modelo = "F40";
		carro2.ano = 1987;
		
		System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}
