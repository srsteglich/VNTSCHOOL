package Aula8;

import java.util.Scanner;

public class ativi3Financiamento {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		System.out.println("Digite o teu salario ");
		int sal = entra.nextInt();
		
		if (sal >= 5 ) {
			System.out.printf("O " + sal + " salario, então  Financiamento Concedido");			
		} else {
			System.out.printf("O " + sal + " salario, então  Financiamento Negado");			
		}		
		entra.close();
	}

}
