package Aula12;

import java.util.Scanner;

public class ativi12MarizNaoNegativo {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int num[][] = new int[3][4];
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(" Digite um valor da matriz de "+i+" - "+j+" para: ");
				num[i][j] = entrada.nextInt(); 							
			}
		}
		System.out.println("\n--------------------------------");
		System.out.println("   Mostrar as Matrizes ");
		for (int i = 0; i < 3; i++) {	
			System.out.println(" ");
			for (int j = 0; j < 4; j++) {
				System.out.print(" "+num[i][j] + "\t");
			}
		}

		System.out.println("\n--------------------------------");		
		System.out.println("\n  Mostrar as Matrizes Modificada ");
		for (int i = 0; i < 3; i++) {	
			System.out.println(" ");
			for (int j = 0; j < 4; j++) {
				
				if (num[i][j] > 0 ) {
					System.out.print(" "+num[i][j] + "\t");					
				} else {
					num[i][j] = 0;
					System.out.print(" "+num[i][j] + "\t");
				}

			}
		}

		entrada.close();
	
	}

}
