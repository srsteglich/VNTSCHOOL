package Aula7;

import java.util.Scanner;

public class atividade3FaixaEtaria {
	public static void main(String[] args) {
		 	
		Scanner entrada = new Scanner(System.in);
		System.out.println("  Digite o nome do atletas? ");
		String nome = entrada.nextLine();

		System.out.println("  Digite a idade do atletas? ");
		int idade = entrada.nextInt();
		
		if (idade>=5 && idade<=10) {			 
			System.out.printf(" O atleta "+nome+" e a tua idade "+idade+" anos e a sua categoria Infantil");		
		}else if (idade>=11 && idade<=15) {
			System.out.printf(" O atleta "+nome+" e a tua idade "+idade+" anos e a sua categoria Juvenil");			
		}else if (idade>=16 && idade<=20) {
			System.out.printf(" O atleta "+nome+" e a tua idade "+idade+" anos e a sua categoria Junior");
		}else if (idade>=21 && idade<=25) {
			System.out.printf(" O atleta "+nome+" e a tua idade "+idade+" anos e a sua categoria Profissional");	
		}else {
			System.out.printf(" Não existe a idade para essa categoria.");
		}			
		entrada.close();
	}	
}
