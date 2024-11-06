package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
	double salarioEmEuro = 68508;
	double taxaImpostoHolanda = 0;
	
	if (salarioEmEuro > 0) {
	    if (salarioEmEuro <= 34712) {
		taxaImpostoHolanda = salarioEmEuro * 0.0970;
	    } else if (salarioEmEuro >= 34713 && salarioEmEuro <= 68507) {
		taxaImpostoHolanda = salarioEmEuro * 0.3735;		
	    } else {
		taxaImpostoHolanda = salarioEmEuro * 0.4950;
	    }
	}
	
	System.out.println("Taxa a ser paga: € " + taxaImpostoHolanda);
    }
}
