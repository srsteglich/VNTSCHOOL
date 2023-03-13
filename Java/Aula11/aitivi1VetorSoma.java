package Aula11;

public class aitivi1VetorSoma {
	public static void main(String[] args) {
		int[] vetor = {1,2,3,4};
		int num = 10;
		
		for (int i = 0; i < vetor.length; i++) {
			num = num + vetor[i];
//elem 1    11 <-  10 + 1
//elem 2	13 <-  11 +	2
//elem 3	16 <-  13 + 3
//elem 4    20 <-  16 + 4			
			System.out.println(" Elemento "+ i + " : "+num);
			
		}
	}	
}
