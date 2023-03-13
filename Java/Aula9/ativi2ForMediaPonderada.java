package Aula9;

import java.util.Scanner;

public class ativi2ForMediaPonderada {
	public static void main(String[] args) {		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Quantos alunos? ");
		int alunos = entrada.nextInt();
		
		for (int i = 0; i < alunos; i++) {
			System.out.println(" Digite o nome do aluno ");
			String nome = entrada.next();
			System.out.println(" Digite a 1ª Nota ");
			double not1 = entrada.nextDouble();
			System.out.println(" Digite a 2ª Nota ");
			double not2 = entrada.nextDouble();
			System.out.println(" Digite a 3ª Nota ");
			double not3 = entrada.nextDouble();	
			double medpond = ((not1*2)+(not2*3)+(not3*5)) / 10;
			System.out.println("--------------------------------------------------");
			System.out.println(" O aluno "+nome+" e a tua média ponderada "+medpond);
			System.out.println("--------------------------------------------------");
		}
	
		entrada.close();
	}
}
