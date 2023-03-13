package Aula10;

import java.util.Scanner;

public class ativi4SCartesiano {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x1, y1;
		
		do {

			System.out.println("  Digite o valor do X? ");
			x1 = entrada.nextInt();

			System.out.println("  Digite o valor do Y? ");
			y1 = entrada.nextInt();

			if (x1 > 0.0 && y1 > 0.0) {
				System.out.println("  Eixo Primeiro Quadrante \n");
			} else if (x1 < 0.0 && y1 > 0.0) {
				System.out.println("  Eixo Segundo Quadrante \n");
			} else if (x1 < 0.0 && y1 < 0.0) {
				System.out.println("  Eixo Terceiro Quadrante \n");
			} else if (x1 > 0.0 && y1 < 0.0) {
				System.out.println("  Eixo Quarto Quadrante \n");
			}
			
		} while (x1 != 0.0 && y1 != 0.0);
		
		System.out.println("   Algoritmo Interrompido!!!");
		entrada.close();
	}

}
