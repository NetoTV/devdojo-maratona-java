package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes
    // ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
	 double valorCarro = 35000;
	 
	 for(int parcela = 1; parcela <= valorCarro; parcela++) {
	     double valorParcela = valorCarro / parcela;
	     boolean isParcelavel = valorParcela >= 1000;
	     
	     if(!isParcelavel) {
		 break;
	     }
	     
	     System.out.println(parcela + "x de R$ " + valorParcela);
	 }
	 
    }
}
