package Aula4;

public class exer8CalcularAreas {
	public static void main(String[] args) {
			
	double a = 3;
	double b = 4;	
	double c = 5;
	
	double trian = (a * c)/2;					// area = (b*h) /2  --> (a*c)/2
	double circu = Math.PI * Math.pow(c, 2);	// area = PI * r*r   --> PI * (c*c)
	double trape = (a+b) * c/2;					// area = (B + b) . h /2   --> (a+b) * c/2
	double quadr = Math.pow(b, 2);				// area = b * h   --> b * b
	double retan =  a * b;						// area = b * h  -->  a * b
		

	System.out.println("\n   Exemplos:\n");						 		//   
	System.out.printf( "   Entrada: %.0f, %.0f, %.0f   Saída: TRIANGULO: %.3f%n ",a, b, c, trian);
	System.out.printf( "                            CIRCULO: %.3f%n ",circu);	
	System.out.printf( "                            TRAPEZIO: %.3f%n ",trape);	
	System.out.printf( "                            QUADRADO: %.3f%n ",quadr);	
	System.out.printf( "                            RETANGULO: %.3f%n ",retan);		
	
	}
}
