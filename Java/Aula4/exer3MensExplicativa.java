package Aula4;

public class exer3MensExplicativa {

	public static void main(String[] args) {
	
		String mens1 = "Entrada: ";
		String mens2 = "Saída: SOMA = ";
		int num1 = 10;
		int	num2 = 30;
		int num3 = -30;
		int	num4 = 10;
		int num5 = 0;
		int	num6 = 0;
		
		System.out.println("Exemplos:\n");
		System.out.printf( mens1 +num1 +", "+num2+"   "+mens2+(num1+num2));
		System.out.println("\n"); 
		System.out.printf( mens1 +num3 +", "+num4+"   "+mens2+(num3+num4));
		System.out.println("\n");
		System.out.printf( mens1 +num5 +", "+num6+"   "+mens2+(num5+num6));		
			
	}
}
