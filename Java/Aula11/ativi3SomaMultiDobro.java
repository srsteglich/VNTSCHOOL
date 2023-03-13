package Aula11;

import java.util.Scanner;

public class ativi3SomaMultiDobro {
	public static void main(String[] args) {
		int num1, num2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o Primeiro Nº: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o Segundo Nº: ");
		num2 = entrada.nextInt();
		
		imprime("\n Soma: " + somar(num1, num2));
		imprime(" Multi: " + multir(num1, num2));
		imprime(" Dobro do Primeiro: " + dobra1(num1));
		imprime(" Dobro do Segundo: " + dobra2(num2));		
				
		entrada.close();
		}
		
	public static void imprime(String s) {
		System.out.println(s);
	}
		
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
		
	public static int multir(int num1, int num2) {			
		return num1 * num2;
	}
		
	public static int dobra1(int num1) {			
		return num1 + num1; 
	}		
		
	public static int dobra2(int num2) {			
		return num2 + num2; 
	}		
	
}
