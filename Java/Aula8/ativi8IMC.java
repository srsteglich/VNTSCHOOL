package Aula8;

import java.util.Scanner;

public class ativi8IMC {
	public static void main(String[] args) {		 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o teu peso ");
		double peso = entrada.nextDouble();
		System.out.println("Digite a tua altura ");
		double altu = entrada.nextDouble();
		double IMC = peso/ (altu * altu);
		
		if (IMC <16) {
			System.out.printf(" O seu IMC foi %.2f%n situação é Magreza Grave", IMC);
		} else if (IMC >=16 && IMC <17) {
			System.out.printf(" O seu IMC foi %.2f%n situação é Magreza Moderada", IMC);
		} else if (IMC >=17 && IMC <18.5) {
			System.out.printf(" O seu IMC foi %.2f%n situação é Magreza Leve", IMC);
		} else if (IMC >=18.5 && IMC <25) {
			System.out.printf(" O seu IMC foi %.2f%n situação é Saudável", IMC);
		} else if (IMC >=25 && IMC <30) {
			System.out.printf(" O seu IMC foi %.2f%n situação é Sobrepeso", IMC);
		} else if (IMC >=30 && IMC <35) {
			System.out.printf(" O seu IMC foi %.2f%n situação é  Obesidade Grau I", IMC);
		} else if (IMC >=35 && IMC <40) {
			System.out.printf(" O seu IMC foi %.2f%n situação é  Obesidade Grau II", IMC);
		} else {
			System.out.printf(" O seu IMC foi %.2f%n situação é  Obesidade Grau III", IMC);
		}
		
		entrada.close();
	}
}
