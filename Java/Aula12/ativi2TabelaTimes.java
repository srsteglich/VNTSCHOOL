package Aula12;

import java.util.Scanner;

public class ativi2TabelaTimes {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		String nome[] = new String[10];

		for (int i = 0; i < nome.length; i++) {
			System.out.println(" Digite o nome do time: ");
			nome[i] = entrada.next();
		}
		System.out.println("-----------------------------------");
		for (int i = 0; i < nome.length; i++) {
			for (int j = 0; j < nome.length; j++) {
				if (nome[i] != nome[j]) {
					System.out.println(nome[i]+" ( ) X ( ) "+nome[j]);
				}				
			}
		}
		System.out.println("-----------------------------------");		
		entrada.close();
	}
}
