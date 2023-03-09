package Aula5;

import java.util.Scanner;

public class exer4Desconto {
	public static void main(String[] args) {
		double max = 30;
		double preco;
		double desc;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("\n Digite o preço: ");		
		preco = entrada.nextDouble();
		desc = preco < max ? preco-preco*0.10 : preco-preco*0.20;
		System.out.printf(" Com Desconto ficaria: %.2f ",desc);
		
		entrada.close();
	}
}
