package Aula12;

import java.util.Scanner;

public class ativi4ElementosMatriz {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int num[][] = new int[3][3];
		int somaTot=0, somaLin3=0, somaCol2=0, somaDiag=0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.println(" Digite um valor da matriz de "+i+" - "+j+" para: ");
				num[i][j] = entrada.nextInt(); 
				somaTot = somaTot + num[i][j];  // Soma Total dos elementos
				
				if (i == 2) {
					System.out.println("   estou na linha 18 "+num[i][j] );
					somaLin3 = somaLin3 + num[i][j]; //Soma na Linha 3
				}
				
				if (j == 1) {
					somaCol2 = somaCol2 + num[i][j]; //Soma na Coluna 2
				}
				
				if (i == j) {
					somaDiag = somaDiag + num[i][j]; //Soma na Diagonal Principal
				}
								
			}
		}
		
		System.out.println("\n Mostrar as Matrizes ");
		for (int i = 0; i < num.length; i++) {	
			System.out.println(" ");
			for (int j = 0; j < num.length; j++) {
				System.out.print(" "+num[i][j] + "\t");
			}
		}
		System.out.println("\n ----------------------------");
//a) Soma total dos elementos
		System.out.println("\n Soma Total dos elementos: " +somaTot);
//b) Soma dos elementos da linha 3.
		System.out.println(" Soma na Linha 3: " +somaLin3);		
//c) Soma dos elementos da coluna 2.		
		System.out.println(" Soma na Coluna 2: " +somaCol2);
//d) Soma dos elementos da diagonal principal.		
		System.out.println(" Soma na Diagonal Principal: " +somaDiag);		
		
		entrada.close();
	}
}
