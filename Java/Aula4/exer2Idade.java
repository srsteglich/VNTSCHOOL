package Aula4;

import java.util.Scanner;

public class exer2Idade {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	     System.out.println("Informe seu nome: ");
	     String nome = entrada.nextLine();
	     System.out.println("Informe o ano que nasceu: ");
	     int anonasc = entrada.nextInt();
	     System.out.println("Informe o ano atual: ");
	     int anoatual = entrada.nextInt();
	     
	     int idade = anoatual - anonasc;
	     System.out.println("O "+nome+ " e a sua idade "+idade+" anos");	     
	     														  
	     entrada.close();
		
		
	}
}
