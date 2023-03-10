package Aula8;

import java.util.Scanner;

public class ativi6Solidario {
	public static void main(String[] args) {
		System.out.println("\n Seleciona a opcao para Doar");
		System.out.println(" [1] para doar R$ 10,00 ");
		System.out.println(" [2] para doar R$ 25,00 ");
		System.out.println(" [3] para doar R$ 50,00 ");
		System.out.println(" [4] para doar outro valores ");		
		System.out.println(" [5] para sair ");
		Scanner opcao = new Scanner(System.in);
		int num = opcao.nextInt() ;
		
		switch (num) {
		case 1: System.out.println(" Valor da doação R$ 10");
				System.out.println(" Obrigado pela doação");			
				break;
		case 2: System.out.println(" Valor da doação R$ 25");
				System.out.println(" Obrigado pela doação");			
				break;
		case 3: System.out.println(" Valor da doação R$ 50");
				System.out.println(" Muito Obrigado pela doação");			
				break;
		case 4: System.out.println(" Qual o valor para doar?");
				Double valor = opcao.nextDouble();
				System.out.printf(" Valor da doação R$ %.2f%n",valor);
				System.out.println(" Muito Obrigado pela doação");			
				break;
		case 5: System.out.println(" Solicitação cancelada!!!");
				break;
		default: System.out.println(" O opção escolhido é inválido! Digite um número entre 1 a 5.");
			break;
		}
		opcao.close();
	}
}
