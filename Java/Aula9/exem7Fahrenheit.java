package Aula9;

import java.util.Scanner;

public class exem7Fahrenheit {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 
		char resp;
		do {
			System.out.println(" Digite o valor Celsius ");
			double cel = entrada.nextDouble();
			double fah = cel * 1.8 + 32;
			System.out.println(" A temperatura do Fahrenheit é: "+fah);
			
			System.out.println(" Deseja contiuar? [s] / [n]");
			resp = entrada.next().charAt(0);			
		} while (resp != 'n');
		
		System.out.println(" Saiu do programa... ");
		entrada.close();

	}

}
