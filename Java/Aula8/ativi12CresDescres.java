package Aula8;

import java.util.Scanner;

public class ativi12CresDescres {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n Digite o 1º número ");
		double A = entrada.nextDouble();
		System.out.println(" Digite o 2º número ");
		double B = entrada.nextDouble();
		System.out.println(" Digite o 3º número ");
		double C = entrada.nextDouble();
		System.out.println(" Seleciona opcao abaixo:");
		System.out.println(" [1] Em ordem crescente");
		System.out.println(" [2] Em ordem descrescente");
		System.out.println(" [3] O maior no meio");
		
		int I = entrada.nextInt();
		double maior =0, menor=0, medio=0;
		
				// float maior = Math.max(A,B);		
		if (A>B && A>C && B>C) {
			maior = A;
			medio =	B;
			menor = C;			
			  //System.out.printf(" "+ C,B,A);
		} else if (A>B && A>C && C>B) {
			maior = A;
			medio =	C;
			menor = B;
			//System.out.printf(" "+ B,C,A);
		} else if (B>A && B>C && A>C) {
			maior = B;
			medio =	A;
			menor = C;
			//System.out.printf(" "+ C,A,B);
		} else if (B>A && B>C && C>A) {
			maior = B;
			medio =	C;
			menor = A;
			//System.out.printf(" "+ A,C,B);
		} else if (C>A && C>B && A>B) {
			maior = C;
			medio =	A;
			menor = B;
			//System.out.printf(" "+ B,A,C);
		} else if (C>A && C>B && B>A) {
			maior = C;
			medio =	B;
			menor = A;
			//System.out.printf(" "+ A,B,C);
		} 		
		System.out.println("---------------------------------------");
		switch (I) {
		case 1: System.out.printf("Em ordem crescente: %.2f - %.2f - %.2f ",menor,medio,maior);		
				break;
				
		case 2: System.out.printf("Em ordem descrescente: %.2f - %.2f - %.2f ",maior,medio,menor);		
				break;

		case 3: System.out.printf("O maior no meio: %.2f - %.2f - %.2f ",medio,maior,menor);		
				break;

		default: System.out.println(" Opção inválido");
			break;
		}
		
		entrada.close(); 
	}	
}
