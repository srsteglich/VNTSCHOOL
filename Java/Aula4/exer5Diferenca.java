package Aula4;

public class exer5Diferenca {
	public static void main(String[] args) {
		
		
		String mens1 = "Entrada: ";
		String mens2 = "Saída: DIFERENCA = ";
		int num1 = 5;
		int	num2 = 6;
		int num3 = 7;
		int	num4 = 8;
		int num5 = -7;
		int difer1 = (num1 * num2 - num3 * num4);
		int difer2 = (num1 * num2 - num5 * num4);		
		System.out.println("  Exemplos:\n");
		System.out.printf( "  "+mens1 +num1 +", "+num2+", "+num3+", "+num4+"   "+mens2 +difer1);
		System.out.println("\n"); 
		System.out.printf( "  "+mens1 +num1 +", "+num2+", "+num5+", "+num4+"   "+mens2 +difer2);

		
		
		
	}
}
