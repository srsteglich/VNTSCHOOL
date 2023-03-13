package Aula9;

import java.util.Scanner;

public class ativi3Fatorial {
	public static void main(String[] args) {
		char resp;		
		Scanner entrada = new Scanner(System.in);
		do {			
			System.out.println(" Digite um número ");
			int num = entrada.nextInt();
			int fator = 1;
			
			do {
				fator = fator * num;
				System.out.print(" "+num);
				num--;				
			} while (num >= 1);
			
			System.out.print(" = "+fator);		
			System.out.println("\n Quer continuar? [s/n]");
			resp = entrada.next().charAt(0);			
		} while (resp != 'n');
		System.out.println(" Saiu do programa...");
		entrada.close();
	}	
}
