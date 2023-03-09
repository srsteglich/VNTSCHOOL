package Aula7;

import java.util.Scanner;

public class atividade2VaCinema {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("  Digite o raio do círculo? ");
		double raio = entrada.nextDouble();
		
		if (raio>0) {
			double area = Math.PI * raio; 
			System.out.printf(" A area do círculo é %.2f",area);		
		}else {
			System.out.println(" Não dá pra calcular, precisa maior que o 0...");			
		}			
		entrada.close();
	
	}
}
