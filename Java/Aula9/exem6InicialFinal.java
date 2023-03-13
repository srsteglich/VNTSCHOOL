package Aula9;

import java.util.Scanner;

public class exem6InicialFinal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(" Digite o valor inicial: ");
		int numI = entrada.nextInt();
		System.out.println(" Digite o valor final: ");
		int numF = entrada.nextInt();
		
		do {
			numI++;
			System.out.println(" O valor é "+numI);						
		} while (numI != numF);

		entrada.close();
	}
}
