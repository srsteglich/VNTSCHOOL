package Aula9;

import java.util.Scanner;

public class ativi1ContagemCresDesc {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int conta;
		System.out.println(" Digite o número incial ");
		int nIncial = entrada.nextInt();
		System.out.println(" Digite o número final ");
		int nFinal = entrada.nextInt();
		conta = nIncial;
		if (nIncial < nFinal) {			
			while (conta <= nFinal) {				
				System.out.print("  "+nIncial );
				nIncial ++;
				conta ++;
			}			
		} else 			
			while (conta >= nFinal) {				
				System.out.print("  "+nIncial );
				nIncial --;
				conta --;
			}

		entrada.close();
	}
}
