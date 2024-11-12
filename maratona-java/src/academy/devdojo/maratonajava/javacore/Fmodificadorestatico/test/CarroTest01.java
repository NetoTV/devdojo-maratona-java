package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
	public static void main(String[] args) {
		Carro c1 = new Carro("BMW", 290);
		Carro c2 = new Carro("Mercedes", 300);
		Carro c3 = new Carro("Mercedes", 280);
		
		// Como velocidadeLimite é um valor estático, não é necessário haver uma instância
		// para acessar o valor dela, pois agora ela é publica e faz parte da classe como um "metadado"
		// Carro.velocidadeLimite = 400;
		Carro.setVelocidadeLimite(150);
		
		c1.imprime();
		c2.imprime();
		c3.imprime();
	}
}
