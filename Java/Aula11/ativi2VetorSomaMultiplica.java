package Aula11;

public class ativi2VetorSomaMultiplica {
	public static void main(String[] args) {
		int [][] matriz1 = {{1,2},{4,5}};
		int [][] matriz2 = {{7,8},{10,11}};
		int [][] matrizSoma = new int[2][2];
		int [][] matrizMult = new int[2][2];

// Soma		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];				
			}			
		}
		System.out.println("\n    Somando   ");
		System.out.print("-------------------");
		for (int i = 0; i < matrizSoma.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < matrizSoma.length; j++) {
				System.out.print("  " + matrizSoma[i][j] + "\t");
			}			
		}
// Multiplicacao
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				matrizMult[i][j] = matriz1[i][j] * matriz2[i][j];				
			}			
		}
		System.out.println("");
		System.out.println("\n  Multiplicação   ");
		System.out.print("-------------------");
		for (int i = 0; i < matrizMult.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < matrizMult.length; j++) {
				System.out.print("  " + matrizMult[i][j] + "\t");
			}			
		}
		
		
	
		
		
		
		
	}
}
