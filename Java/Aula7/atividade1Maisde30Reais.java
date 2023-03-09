package Aula7;

import java.util.Scanner;

public class atividade1Maisde30Reais {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("  Quanto grana que tem ? R$");
		double din = entrada.nextDouble();
		
		if (din>30) {
			System.out.println(" Vá ao cimena...");		
		}else {
			System.out.println(" Vá ao pra casa vendo TV...");			
		}			
		entrada.close();
	}
}
