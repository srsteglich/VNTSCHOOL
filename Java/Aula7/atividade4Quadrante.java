package Aula7;

import java.util.Scanner;

public class atividade4Quadrante {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("  Digite o valor do X? ");
		double x1 = entrada.nextDouble();

		System.out.println("  Digite o valor do Y? ");
		double y1 = entrada.nextDouble();
		
		if (x1 == 0.0 && y1== 0.0 ) {
			System.out.println("  Origem ");
		} else if ( x1 == 0.0) {
			System.out.println("  Eixo Y ");
		} else if ( y1 == 0.0) {
			System.out.println("  Eixo X ");
		} else if (x1 > 0.0 && y1 > 0.0 )  {
			System.out.println("  Eixo Primeiro Quadrante ");
		} else if (x1 < 0.0 && y1 > 0.0 )  {
			System.out.println("  Eixo Segundo Quadrante ");
		} else if (x1 < 0.0 && y1 < 0.0 )  {
			System.out.println("  Eixo Terceiro Quadrante ");
		} else {
			System.out.println("  Eixo Quarto Quadrante ");
		}
		entrada.close();
	}
}
