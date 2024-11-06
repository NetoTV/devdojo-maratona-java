package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
		// O que são Arrays Multidimensionais?
		// Basicamente são Arrays de Arrays
		int[][] arrayOfArrayNums = new int[3][3];
		
		arrayOfArrayNums[0][0] = 31;
		arrayOfArrayNums[0][1] = 28;
		arrayOfArrayNums[0][2] = 12;
		
		arrayOfArrayNums[1][0] = 126;
		arrayOfArrayNums[1][1] = 67;
		arrayOfArrayNums[1][2] = 475;
		
		// Percorrendo com for-loop usando indices
		for(int i = 0; i < arrayOfArrayNums.length; i++) {
		    for(int j = 0; j < arrayOfArrayNums[i].length; j++) {
		    	System.out.println(arrayOfArrayNums[i][j]);
		    }
		} 
		
		// Separação
		System.out.println("-------------------------------------------");
		
		// Percorrendo com foreach
		for(int[] arrayOfNums : arrayOfArrayNums) {
		    for(int num : arrayOfNums) {
		    	System.out.println(num);
		    }
		}
    }
}
