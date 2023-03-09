package Aula3;

import java.util.Scanner;

public class exer2Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informa dois valores interios:");
		int x = entrada.nextInt();
		int y = entrada.nextInt();
		System.out.println("Escolha uma operação: " + "\n"
				+ "1 - Adição" + "\n"
				+ "2 - Subtracao" + "\n"
                + "3 - Muliplicacao" + "\n"
                + "4 - Divisao");
		byte op = entrada.nextByte();
		switch (op) {
			case 1: System.out.println(x + " + " + y + " = " + (x+y));
					break;
			case 2: System.out.println(x + " - " + y + " = " + (x-y));
					break;
			case 3: System.out.println(x + " x " + y + " = " + (x*y));
					break;
			case 4: System.out.println(x + " / " + y + " = " + ((double)x / (double)y));
					break;
			default: System.out.println("Operação Invalida!!!");		
			
		}
		
		entrada.close();
	}
}
