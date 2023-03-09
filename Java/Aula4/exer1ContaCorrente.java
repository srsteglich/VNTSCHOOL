package Aula4;

import java.util.Scanner;

public class exer1ContaCorrente {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome ");
		String nome = entrada.nextLine();
		System.out.println("Digite a agência ");
		String agencia = entrada.nextLine();
		System.out.println("Digite a conta corrente ");
		String conta = entrada.nextLine();
		
		System.out.printf("O nome do correntista " +nome);
		System.out.printf("A tua agencia: "+agencia+" e a tua conta corrente: "+conta);
		entrada.close();
		
		
	}
}
