package Aula12;


import java.util.Random;

public class ativi6VetorOrdemCresc {
	public static void main(String[] args) {

		Random gera = new Random(); 
		int i, j=0, aux;
		int num[] = new int[10];
		// Coloquei em numeros randomico, pra não precisa digitar
		System.out.println("     Lista dos Números ");
		for (i = 0; i < num.length; i++) {
			num[i] = gera.nextInt(50);			
			System.out.print(" "+num[i]);			
		}
				
		for (i = 1; i < num.length; i++) {
			for (j = 0; j < i; j++) {				
				if (num[j] > num[i]) {
					aux = num[j];
					num[j] = num[i];
					num[i]= aux;
				}
			}			
		}
		System.out.println("");
		System.out.println("\n    Lista de Nº Ordenados ");
		for (i = 0; i < num.length; i++) {
			System.out.print(" "+num[i]);
		}		
	}
}
