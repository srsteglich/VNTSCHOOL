package Aula12;

import java.util.Scanner;

public class ativi1Media5Alunos {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		String nome[] = new String[5];
		double not1[] = new double[5];		
		double not2[] = new double[5];
		double totMedia = 0, medTurma, media = 0;
		
		for (int i = 0;i <not1.length; i++) {
			System.out.println(" Digite o nome do aluno: ");
			nome[i] = entrada.next();
			System.out.println(" Digite a primeira nota: ");
			not1[i] = entrada.nextDouble();
			System.out.println(" Digite a segunda nota: ");
			not2[i] = entrada.nextDouble();
			media = (not1[i] + not2[i]) /2;
			totMedia = totMedia + media;			
		}
		medTurma = totMedia / 5;
		System.out.println("\n ------------------------------ ");
		System.out.println(" Média da Turma: "+medTurma);

		for (int i = 0; i <not1.length; i++) {
			media = (not1[i] + not2[i]) /2;
			if (media >= medTurma) {				
				System.out.printf( " O aluno %s a tua media %.2f%n",nome[i],media);
			}		
		}
		
		entrada.close();
	}
}
