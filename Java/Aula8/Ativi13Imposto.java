package Aula8;

import java.util.Scanner;

public class Ativi13Imposto {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("  Digite o salário: ");
		double salar = entrada.nextDouble();
		double imp =0;
		
		if (salar > 4664.68) {
			imp = (salar * 0.275);
			System.out.printf(" O salário de R$ %.2f para pagar o Imposto de Renda é de R$ %.2f.",salar,imp);	
			
		}else if (salar>3751.06 && salar<=4664.68) {
			imp = (salar * 0.225);
			System.out.printf(" O salário de R$ %.2f para pagar o Imposto de Renda é de R$ %.2f.",salar,imp);
			
		}else if (salar>2826.66 && salar<=3751.06) {
			imp = (salar * 0.15);
			System.out.printf(" O salário de R$ %.2f para pagar o Imposto de Renda é de R$ %.2f.",salar,imp);
			
		}else if (salar>1909.99 && salar<=2826.66) {
			imp = (salar * 0.075);
			System.out.printf(" O salário de R$ %.2f para pagar o Imposto de Renda é de R$ %.2f.",salar,imp);
			
		}else {
			System.out.printf(" O salário de R$ %.2f é Isento para pagar o Imposto de Renda.",salar);
		}			
		entrada.close();
		
	}
}
