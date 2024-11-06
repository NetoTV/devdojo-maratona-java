package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro, descubra em quantas vezes
    // ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
	 double valorCarro = 35000;
	 double valorMinimoParcela = 1000;
	 
	 for(int parcela = (int) valorCarro; parcela >= 1; parcela--) {
	     double valorParcela = valorCarro / parcela;
	     
	     // Esse código não é eficiente pois processa muita coisa
	     // Seria mais eficiente usar break; para parar o for com uma
	     // condição em específico
	     System.out.println("Processando parcela " + parcela);
	     
	     if(valorParcela < valorMinimoParcela) {
		 // O continue pula para a próxima iteração do for-loop
		 continue;
	     }
	     
	     System.out.println(parcela + "x de R$ " + valorParcela);
	 }
	 
    }
}
