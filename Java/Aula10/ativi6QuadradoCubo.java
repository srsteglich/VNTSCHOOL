package Aula10;

import java.util.Scanner;

public class ativi6QuadradoCubo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Digite um número ");
		float num = entrada.nextFloat();
		System.out.print("\n   Aos Números  : ");
		for (int i = 1; i <= num; i++) {			
			System.out.print("  "+i);
		}
		System.out.println();
		System.out.print("\n   Aos Quadrados: ");
		for (int i = 1; i <= num; i++) {			
			System.out.printf("  %.0f",Math.pow(i,2));			
		}
		System.out.println();
		System.out.print("\n   Aos Cubos    : ");
		for (int i = 1; i <= num; i++) {			
			System.out.printf("  %.0f",Math.pow(i,3));			
		}
		
		
		entrada.close();
	}
}
