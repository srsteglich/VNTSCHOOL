package Aula9;

import java.util.Scanner;

public class ativi4Altura {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int conta = 1, numM = 0;
		double maisalto = 0;
		
		System.out.println(" Quantas pessoas? ");
		int N = entrada.nextInt();
		
		do {
			System.out.println(" Digite a tua altura ");
			double altu = entrada.nextDouble();
			System.out.println(" Escolhe a teu sexo [m] ou [f] ");
			char sexo = entrada.next().charAt(0) ;
			if (altu > maisalto) {
				maisalto = altu;
			}
			if (sexo == 'm') {
				numM ++;
			}			
			conta++;
		} while (N >= conta);
		System.out.println("------------------------------------");
		System.out.println(" O mais alto de todos tem: "+maisalto);
		System.out.println(" A quantidade de Homens é "+numM);
		entrada.close();
	}

}
