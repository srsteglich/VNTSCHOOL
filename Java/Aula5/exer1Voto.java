package Aula5;

import java.util.Scanner;

public class exer1Voto {
	public static void main(String[] args) {
		int idade;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a tua idade: ");
		idade = entrada.nextInt();
		
		String voto = ((idade >= 16 && idade < 18) || (idade > 70))? "O voto é opcional":"O voto não é opcional"; 
		System.out.println(voto);
		
		entrada.close();
	}	
}
