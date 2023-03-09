package Aula4;

public class exer4Raio {

	public static void main(String[] args) {

		String mens1 = "Entrada: ";
		String mens2 = "Saída: A=";
		double  num1 = 2.00;
		double	pi = 3.14159;
		double  area = pi *(num1*num1);
		System.out.println();		
		System.out.println("  Exemplos:\n");
		System.out.printf( "  "+mens1 +"%.2f   "+mens2+"%.2f",num1,area);		
		System.out.println("\n"); 
		System.out.printf( "  "+mens1 +"%.2f   "+mens2+"%.4f",num1,area);	
		
	}
}
