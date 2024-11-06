package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
		// Por default, os valores dentro de cada posição serao null
		// Pois não foi declarado um tamanho inicial para o array de dentro
		int[][] arrayOfArrayInt = new int[3][];
		int[] arrayInt = {1, 2, 3};
		
		// Formas de atribuir valores as posições do array
		arrayOfArrayInt[0] = new int[2];
		arrayOfArrayInt[1] = arrayInt;
		arrayOfArrayInt[2] = new int[] {1, 2, 3, 4, 5, 6};
		
		// Outra forma de declarar multidimensional
		int[][] arrayInt2 = {{0, 0}, {1, 2}, {1, 2, 3, 4, 5, 6}};
		
		for(int[] arrayBase : arrayInt2) {
		    System.out.println("\n-----");
	
		    for(int num : arrayBase) {
			System.out.print(num + " ");
		    }
		}
    }
}
