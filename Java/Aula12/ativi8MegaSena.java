package Aula12;

import java.util.Random;

public class ativi8MegaSena {

	public static void main(String[] args) {
		
		Random gera = new Random(); 
		int i, j=0, aux;
		int num[] = new int[6];
		
		for (i = 0; i < num.length; i++) {
			num[i] = gera.nextInt(60);								
		}
				
		for (i = 1; i < num.length; i++) {
			for (j = 0; j < i; j++) {				
				if (num[j] > num[i]) {
					aux = num[j];
					num[j] = num[i];
					num[i]= aux;
				}
			}			
		}

		System.out.println("\n    Números da Mega Sena ");
		for (i = 0; i < num.length; i++) {
			System.out.print("    "+num[i]);
		}		
	}
}
