package Aula10;

import java.util.Scanner;

public class ativi8Radioativo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double tempo = 0;
		System.out.println(" Digite a massa inicial:");
		double massa = entrada.nextDouble();
		
		while (massa >= 0.5) {
			massa = massa /2;
			tempo = tempo + 50;
		}
		System.out.println("-------------- Radioativo --------------");		
		System.out.printf(" Massa Final foi %.4f gramas.\n",massa);
		System.out.printf(" O Tempo gasto foi %.0f segundos",tempo );
	
		entrada.close();	
	}	
}
