package Aula10;

public class ativi7AumentoSalario {
	public static void main(String[] args) {
		double salar = 2000;
		 		
		for (int ano = 2011; ano < 2016; ano++) {
			if (ano == 2011) {
				salar = salar + (salar* 0.015);
			} else if (ano >= 2012) {
				salar = salar + (salar* 0.030);
			}
			System.out.printf("  No ano %d, o Salário foi %.2f\n",ano,salar);
		}		
	}	
}
