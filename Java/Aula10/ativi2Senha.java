package Aula10;

import java.util.Scanner;

public class ativi2Senha {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int senha = 2023; 
		int	numdig;	
		do {			
			System.out.println(" Digite o nº da senha:");
			numdig = entrada.nextInt();
			if (senha != numdig) {
				System.out.println(" Senha Invalida e Tente novamente..");
			}			
		} while (senha != numdig);
		System.out.println(" Acesso Permitido...");
		entrada.close();		
	}
}
