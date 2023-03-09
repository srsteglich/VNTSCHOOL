package Aula6;

import java.util.Scanner;

public class exer7SomaSubtracao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("  Digite um número: ");
		double num1 = entrada.nextDouble();
		System.out.println("  Digite outro número: ");
		double num2 = entrada.nextDouble();
		
		String mens = (num1 > num2)? "A soma dos números" :"A subtração dos números" ;
		
		if (mens == "A soma dos números") {
			double soma = num1 + num2; 			
			System.out.printf("  %s:  %.0f + %.0f = %.0f",mens,num1,num2,soma);						
		}else  {
			double subtr = num1 - num2; 
			System.out.printf("  %s:  %.0f - %.0f = %.0f",mens,num1,num2,subtr);										
		}   
		
		entrada.close();				
	}
}
