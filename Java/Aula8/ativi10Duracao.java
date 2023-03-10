package Aula8;

import java.util.Scanner;

public class ativi10Duracao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println(" Digite o Hora Inicial: ");
		int hini = entrada.nextInt();
		System.out.println(" Digite o Hora Final: ");
		int hfim = entrada.nextInt();
		
		if (hini > hfim) {
			System.out.println(" A duração do jogo foi " +(24-(hini-hfim))+ " horas.");
		} else if ( hfim > hini ) {
			System.out.println(" A duração do jogo foi " +(hfim-hini)+ " horas.");			
		} else {
			System.out.println(" A duração do jogo foi 24 horas.");
		}
		
		entrada.close();
	}
}
