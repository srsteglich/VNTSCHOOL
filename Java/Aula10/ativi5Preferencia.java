package Aula10;

import java.util.Scanner;

public class ativi5Preferencia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contA=0, contB=0, contC=0; 
		int opc;
		do {
			System.out.println(" Seleciona o produto da tua preferência ou quer sair: ");
			System.out.println(" [1] Produto A");
			System.out.println(" [2] Produto B");
			System.out.println(" [3] Produto C");			
			System.out.println(" [4] Sair");				
			opc = entrada.next().charAt(0);
			
			if (opc == '1') {				
				contA++;
			} else if (opc == '2') {
				contB++;
			} else if (opc == '3') {
				contC++;
			}  

		} while (opc != '4');
		int totCli = contA + contB + contC;
		System.out.println("   Muito Obrigado... \n");
		System.out.println("   Total dos Clientes: "+totCli);
		System.out.println("   Quantidades Produtos Preferido");
		System.out.println("        Produto A "+contA);
		System.out.println("        Produto B "+contB);
		System.out.println("        Produto C "+contC);
		entrada.close();	
	}	
}
