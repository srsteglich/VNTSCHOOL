package Aula3;

import java.util.Scanner;

public class exer3Triangulo {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        System.out.println("Informe o valor da base: ");
	        int b = entrada.nextInt();
	        System.out.println("Informe o valor da altura: ");
	        int h = entrada.nextInt();
	        float area = (b * h) / 2;
	        System.out.println(" A base do Triangulo é "+ b + " e a altura do Triangulo é " + h);
	        System.out.printf(" A área do Triangulo é %.0f%n",area);
	        	      
	     entrada.close();
	}

}
