package Aula10;

import java.util.Scanner;

public class ativi3Divisores {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(" Digite um número ");
		int num = entrada.nextInt();	
		int i = 0;
		for (i = 1; i < num; i++) {
			if (num % i ==0) {
				System.out.print(" "+i);
			}
			//System.out.print(" "+i);
			entrada.close();
		}
		System.out.print(" "+i);			
	}
}
