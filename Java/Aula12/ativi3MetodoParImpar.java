package Aula12;

import java.util.Scanner;

public class ativi3MetodoParImpar {

	public static void main(String[] args) {
		int num;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número ");
		num = entrada.nextInt();
		
		tela("\n  O número "+num+ " digitado... É " + resto(num));
		
	entrada.close();
	}
	
	public static void tela(String s) {
		System.out.println(s);
	}
	
	public static String resto(int num) {		
		if (num % 2 == 0) {
			 return " Par";
		}else {
			 return " Impar";
		}  			
	}
	
}
