package Aula10;

import java.util.Scanner;

public class ativi1Primo {
	public static void main(String[] args) {
		int conta = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println(" Digite um número ");
		int num = entrada.nextInt();	
		
		if (num == 1) {
			System.out.println(" O número "+num+", Não é número primo... ");
		} else {
			System.out.println(" Os dividores do nº "+num+" são: ");
			if (num <= 10) {
				for (int i = 1; i <= num; i++) {					
					if (num % i == 0) {
						System.out.print(" "+i);
						conta++;							
					}					
				}				
			} else {
				for (int i = 1; i < num; i++) {
					if (num % i == 0) {
						System.out.print(" "+i);
						conta++;	
					}									
				}
				conta++;
				System.out.print(" "+num);
			}			
			System.out.println("\n-------------------------------");
			if (conta == 2) {
				System.out.println(" O nº "+num+", É número primo...");
			} else {
				System.out.println(" O nº "+num+", Não é número primo...");				
			}			
			System.out.println("-------------------------------");						
		}		
		entrada.close();
	}	
}
