package Aula8;

import java.util.Scanner;

public class ativi4Media {
	public static void main(String[] args) {
				
		Scanner entra = new Scanner(System.in);
		System.out.println("Digite o 1º nota ");
		double not1 = entra.nextDouble();
		System.out.println("Digite o 2º nota ");
		double not2 = entra.nextDouble();
		System.out.println("Digite o 3º nota ");
		double not3 = entra.nextDouble();
		
		double media = (not1 + not2 + not3) / 3;  
		if (media >= 7) {								 
			System.out.printf("Aporvado, a tua media foi %.2f%n",media);
			
		} else {
			if (media <= 5) {
				System.out.printf("Reporvado, a tua media foi %.2f%n",media);
			}else {
				System.out.printf("Recuperação, a tua media foi %.2f%n",media);	
			}			
		}
			
		entra.close();
		
	}
}
