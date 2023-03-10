package Aula8;

import java.util.Scanner;

public class ativi11Intervalo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println(" Digite o valor: ");
		int valor = entrada.nextInt();
		
		if (valor >= 0 & valor <= 25) {
			System.out.println(" Intervalo de [0,25]");
		} else if (valor > 25 & valor <= 50) {
			System.out.println(" Intervalo de [26,50]");
		}  else if (valor > 50 & valor <= 75) {
			System.out.println(" Intervalo de [51,75]");
		} else if (valor > 75 & valor <= 100) {
			System.out.println(" Intervalo de [76,100]");
		} else {
			System.out.println(" Fora do Intevalo");
		}
		
		entrada.close();
	}

}
