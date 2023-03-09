package Aula6;

import java.util.Scanner;

public class exer8Bhaskara {
	public static void main(String[] args) {
		double a, b, c,delta, x1, x2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println(" Digite um número do A: ");
		a = entrada.nextDouble();
		System.out.println(" Digite um número do B: ");
		b = entrada.nextDouble();
		System.out.println(" Digite um número do C: ");
		c = entrada.nextDouble();
		
		delta = Math.pow(b, 2) - 4 * (a-c);		
		System.out.printf(" Valor da Delta: %.0f%n",delta );
		
		if (delta < 0) {
			System.out.println(" Valor negativo, não possuim raizes reais.");
		}else {
			if (delta == 0 ) {
				x1 = (-b + Math.sqrt(delta)) / 2 * a;
				System.out.println(" A Formula Bhaskara é "+ x1);
				System.out.println(" Possui um raiz...");
			}else {
				x1 = (-b + Math.sqrt(delta)) / 2 * a;
				x2 = (-b - Math.sqrt(delta)) / 2 * a;
				System.out.printf(" A Formula Bhaskara é %.2f  e %.2f%n",x1,x2);
				System.out.println(" Possui dois raizes...");	
			}
		}					
		entrada.close();
	}
}
