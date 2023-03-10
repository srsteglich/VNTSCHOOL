package Aula8;

import java.util.Scanner;

public class ativi2PositivoParImpar {
	public static void main(String[] args) {
		
	Scanner entra = new Scanner(System.in);
	System.out.println("Digite o 1º número ");
	int num = entra.nextInt();
	
	if (num > 0) {
		
		if (num % 2 == 0) {
			System.out.println("Resto do " + num + " então é PAR.");
		}else {
			System.out.println("Resto do " + num + " então é IMPAR.");
		}
	} else {
		System.out.println(" O número é NEGATIVO ou Zero");
	}
		
		
		
	entra.close();

	}
	
	
}
