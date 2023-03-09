package Aula4;

public class exer6Salario {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 160;
		int num3 = 50;
		
		int	num4 = 2;
		int num5 = 200;
		int num6 = 75;

		double salar1 = (num2 * num3);
		double salar2 = (num5 * num6);		

		System.out.println("\n   Exemplos:\n");
		System.out.printf( "   Entrada:   %d, %d, %d  Saída: NUMERO = %d, SALARIO = R$ %.2f%n",num1, num2, num3, num1, salar1 );
		System.out.printf( "   Entrada:   %d, %d, %d  Saída: NUMERO = %d, SALARIO = R$ %.2f%n",num4, num5, num6, num2, salar2 );		
				
	}
}
