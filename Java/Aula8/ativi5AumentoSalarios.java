package Aula8;

import java.util.Scanner;

public class ativi5AumentoSalarios {
	public static void main(String[] args) {
		double salnovo = 0;
		double aumento = 0 ;
		Scanner entra = new Scanner(System.in);

		System.out.println("Digite o nome do funcionario ");
		String nome = entra.next();
		System.out.println("Digite o seu salario ");
		double salatual = entra.nextDouble();
		
		if (salatual <= 3) {
			salnovo = salatual + (salatual * 0.20);
			aumento = 20;
		}else if (salatual >= 4 && salatual <= 6)   {
			salnovo = salatual + (salatual * 0.15);
			aumento = 15;
		}else if (salatual >= 7 && salatual <= 9)   {
			salnovo = salatual + (salatual * 0.12);
			aumento = 12;
		}else if (salatual >= 10 && salatual <= 12) {
			salnovo = salatual + (salatual * 0.10);
			aumento = 10;
		}else if (salatual >= 13 && salatual <= 15) {
			salnovo = salatual + (salatual * 0.07);
			aumento = 7;
		}else if (salatual >= 16) {
			salnovo = salatual;
			aumento = 0;
		}
																											 
		System.out.printf(" O %s esteve aumento de  %.0f por cento, e com salario atual %.2f e o novo salario é %.2f",nome,aumento,salatual,salnovo);
		
		entra.close();
	}

}
