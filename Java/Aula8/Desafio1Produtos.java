package Aula8;

import java.util.Scanner;

public class Desafio1Produtos {
	public static void main(String[] args) {
		double  aumento = 0, precaum, imp;			
		Scanner entrada = new Scanner(System.in);
		
// Pag. 17 - Informações de Produtos		
		System.out.println("-------------------------------------------------");
		System.out.println("  Digite o valor do produto: ");
		double preco = entrada.nextDouble();
		
		System.out.println(" Digite o número da categoria ");
		System.out.println(" [1]–limpeza  [2]–alimentação  [3]–vestuário"); 
		int catg = entrada.nextInt();		
					
		System.out.println(" Digite a letra para situação ");
		System.out.println(" [R]–precisa refrigerar  [N]–não precisa refrigerar");
		String situa = entrada.next().toUpperCase();
		//System.out.println(" teste 23 "+situa);
		
// Pag 18 - Preço com aumento		
		System.out.println("-------------------------------------------------");
		if (preco <= 25) {
			if (catg == 1) {
				aumento = preco * 0.05;
				//System.out.println(" estou na linha 29 " +aumento);
			}else if (catg == 2) {
				aumento = preco * 0.08;
			}else if (catg == 3) {
				aumento = preco * 0.10;				
			}
		} else {
			if (catg == 1) {
				aumento = preco * 0.12;
				//System.out.println(" estou na linha 38 " +aumento); 
			}else if (catg == 2) {
				aumento = preco * 0.15;
			}else if (catg == 3) {
				aumento = preco * 0.18;				
			}			
		}
		//System.out.printf(" linha 45 - Preco %.2f - aumento %.2f\n",preco,aumento);
		
		precaum = preco + aumento;
		System.out.printf(" O valor foi aumentado R$ %.2f\n",precaum);
		
// Pag 19 - Preco com desconto		
		System.out.println("-------------------------------------------------");
		if (catg ==2 && situa == "R")  {
			imp = precaum * 0.05;
			precaum = precaum - imp;
			//System.out.println(" linha 55  ");
			System.out.printf(" O Imposto é de R$ %.2f\n" ,imp);
			System.out.printf(" E o valor com descontado foi R$ %.2f\n",precaum);			
		} else {
			imp = precaum * 0.08;
			precaum = precaum - imp;			
			//System.out.println(" linha 61  ");
			System.out.printf(" O Imposto é de R$ %.2f\n" ,imp);
			System.out.printf(" E o valor com descontado foi R$ %.2f\n",precaum);			
		}

// Pag 20 - Novo Preço e Classificação		
		System.out.println("-------------------------------------------------");
		if (precaum <= 50) {
			System.out.println("     Tá Barato... ");					
		} else if (precaum > 50 && precaum <= 120) {
			System.out.println("     Tá Normal... ");			
		} else {
			System.out.println("     Tá caro...");
		}
			
		System.out.println("-------------------------------------------------");		
		entrada.close();
	}	
}
