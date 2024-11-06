package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
	// Imprima o dia da semana, considerando 1 como domingo
	byte dia = 8;
	
	// A estrutura switch só suporta os seguintes tipos:
	// char, int, byte, short, enum, String
	// É necessario colocar um break no final de cada case
	// Caso contrario as linhas dos cases abaixo serao executadas
	// Mesmo que o número não bata com a validação do case nas demais
	
	switch(dia) {
		case 1:
		    System.out.println("Dom");
		    break;
		case 2:
		    System.out.println("Seg");
		    break;
		case 3:
		    System.out.println("Ter");
		    break;
		case 4:
		    System.out.println("Qua");
		    break;
		case 5:
		    System.out.println("Qui");
		    break;
		case 6:
		    System.out.println("Sex");
		    break;
		case 7:
		    System.out.println("Sab");
		    break;
		default:
		    System.out.println("Opção de dia inválida!");
		    break;
	}
	
	char sexo = 'M';
	
	switch (sexo) {
		case 'M':
		    System.out.println("Sexo Masculino!");
		    break;
		case 'F':
		    System.out.println("Sexo Feminino!");
		    break;
		default:
		    System.out.println("Opção de sexo inválida!");
		    break;
	}
    }
}
