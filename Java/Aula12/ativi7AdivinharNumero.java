package Aula12;

import java.util.Random;
import java.util.Scanner;

public class ativi7AdivinharNumero {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		Random gera = new Random(); 		
		int num = gera.nextInt(100);
		int conta=0, num2 = 0; 
		//System.out.println("  "+num);
		do {
			System.out.println(" Digite um numero: ");
			num2 = entrada.nextInt();
			if (num < num2) {
				System.out.println(" o nº "+num2 +" é maior que o nº escolhido....\n");
			}else if (num > num2) {
				System.out.println(" o nº "+num2 +" é menor que o nº escolhido....\n");
			}
			
			conta++;
		} while (num != num2);
		System.out.println(" Foram "+conta+" tentativas." );
		entrada.close();
	}
}
