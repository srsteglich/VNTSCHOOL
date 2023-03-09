package Aula3;

import java.util.Scanner;

public class exer4Media {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	     System.out.println("Informe seu nome: ");
	     String nome = entrada.nextLine();
	     System.out.println("Informe sua idade: ");
	     int idade = entrada.nextInt();
	     System.out.println("Informe a 1ª nota: ");
	     double not1 = entrada.nextDouble();
	     System.out.println("Informe a 2ª nota: ");
	     double not2 = entrada.nextDouble();
	     System.out.println("Informe a 3ª nota: ");
	     double not3 = entrada.nextDouble();
	     System.out.println("Informe a 4ª nota: ");
	     double not4 = entrada.nextDouble();
	     double media = (not1 + not2 + not3 + not4) / 4;
	     System.out.println("O aluno "+nome+ " e a sua idade "+idade+" anos");
	     System.out.printf("As tuas notas %.2f - %.2f - %.2f - %.2f e a tua média %.2f",not1,not2,not3,not4,media);
	     														  
	     entrada.close();
	}

}
