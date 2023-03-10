package Aula8;

import java.util.Scanner;

public class ativi9Multiplos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(" Digite o 1º valor: ");
		int num1 = entrada.nextInt();
		System.out.println(" Digite o 2º valor: ");
		int num2 = entrada.nextInt();

		if (num1%num2==0 || num2%num1==0) {
			System.out.println(" São Múltiplos");
		} else {
			System.out.println(" Não são Múltiplos");
		}
		if (num1 < num2) {
			System.out.println(" Digitou em Ordem Cresente: "+num1+" - "+num2);
		}else {
			System.out.println(" Digitou em Ordem Descresente: "+num1+" - "+num2);			
		}
		
		entrada.close();
	}

}
