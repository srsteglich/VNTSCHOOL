package Aula6;

import java.util.Scanner;

public class exer6OperadorTenario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número ");
		int num = entrada.nextInt();
		
		String resul = (num >= 10) ? "é maior que 10":"é menor que 10"; 
		String resul2 = (num >= 5) ? "é maior que 5":"é menor que 5";
		
		System.out.println(" O numero "+num +" " +resul +" e " +resul2);
		
		entrada.close();
	}
}
