package Aula10;

import java.util.Scanner;

public class ativi8MediaAlunos {
	public static void main(String[] args) {
		double totmed =0, media;		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++) {
			System.out.println(" Digite o nome do aluno ");
			String nome = entrada.next();
			System.out.println(" Digite a 1ª Nota ");
			double not1 = entrada.nextDouble();
			System.out.println(" Digite a 2ª Nota ");
			double not2 = entrada.nextDouble();
			media = (not1 + not2) / 2;
			totmed = totmed + media;
			//System.out.println("  "+totmed);
			if (media >= 6) {
				System.out.printf(" O aluno %s foi Aprovado e a tua média foi %.2f\n",nome,media);
			} else {
				System.out.printf(" O aluno %s foi Reprovado e a tua média foi %.2f\n",nome,media);
			}
		}			
		//totmed = totmed /3;
		double tottur = totmed /3;
		System.out.println("----------------------------------------------------------------");
		System.out.printf(" A média da turma foi %.2f",tottur);
		
		entrada.close();		
		
	}
}
