package Aula5;

import java.util.Scanner;

public class exer3Quinzena {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia do mês: ");
		int dia = entrada.nextInt();
		
		String quinz = dia <= 15 ? "É Primeira Quinzena":"É Segunda Quinzena"; 
		System.out.println(quinz);
		
		entrada.close();
	}
}
