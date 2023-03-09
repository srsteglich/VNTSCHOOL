package Aula6;

import java.util.Scanner;

public class exer5Triangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("  Digite a base do Triangulo: ");
		int b = entrada.nextInt();
		System.out.println("  Digite um lado do Triangulo: ");
		int a = entrada.nextInt();
		System.out.println("  Digite outro lado do Triangulo: ");
		int c = entrada.nextInt();
		
		if ((a+b)>c && (a+c)>b && (b+c)>a)  {
			if ((a==b) && (a==c) &&(b==c))  {
				System.out.println("  O triângulo é Equilátero ");
			}else if ((a!=b) && (a!=c) &&(b!=c) ) {
				System.out.println("  O triângulo é Escaleno ");				
			}else {
				System.out.println("  O triângulo é Isóceles ");
			}					
		}else {
			System.err.println("  O triângulo não será condição perfeita....");
		}			
		entrada.close();
	}
}
