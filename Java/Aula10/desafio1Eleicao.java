package Aula10;

import java.util.Scanner;

public class desafio1Eleicao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cand1=0, cand2=0, cand3=0, cand4=0, cand5=0; 
		int voto, totcand=0, maior;
		
		do {
			System.out.println(" Seleciona um candiato: ");
			System.out.println(" [1] Renato");
			System.out.println(" [2] Geromel");
			System.out.println(" [3] Luan");
			System.out.println(" [4] Paulo Numes");
			System.out.println(" [5] Tarciso");						
			System.out.println(" [6] Sair");				
			voto = entrada.next().charAt(0);
			

			if (voto == '1') {
				cand1++;
			} else if (voto == '2')  {
				cand2++;
			} else if (voto == '3')  {
				cand3++;
			} else if (voto == '4')  {
				cand4++;
			} else if (voto == '5')  {
				cand5++;
			} else if (voto >= '7') {
				System.out.println(" Voto Inválido!!! \n");
			}
			if (voto <= '5') {
				totcand++;
			}	
		
						
		} while (voto != '6');
		
		System.out.println("-------------------------------------");
		System.out.println(" O Renato teve "+cand1+" votos");
		System.out.println(" O Geromel teve "+cand2+" votos");
		System.out.println(" O Luan teve "+cand3+" votos");
		System.out.println(" O Paulo Numes teve "+cand4+" votos");
		System.out.println(" O Tarciso teve "+cand5+" votos");	
		System.out.println("\n O Total dos Eleitores "+totcand);
		maior = Math.max(cand1, Math.max(cand2, Math.max(cand3, Math.max(cand4, cand5))));
		System.out.println(" O candidato vendedor com "+maior+" votos." );
		entrada.close();
	}
}
