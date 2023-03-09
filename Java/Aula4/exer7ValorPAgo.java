package Aula4;

public class exer7ValorPAgo {
	public static void main(String[] args) {
		
		int id1 = 12;
		int unid1 = 1;
		double preco1 = 5.30;		
		int	id2 = 16;
		int unid2 = 2;
		double preco2 = 5.10;
		
		int id3 = 13;
		int unid3 = 2;
		double preco3 = 15.30;		
		int	id4 = 161;
		int unid4 = 4;
		double preco4 = 5.20;
		
		double vpagar1 = (unid1 * preco1) + (unid2 * preco2);
		double vpagar2 = (unid3 * preco3) + (unid4 * preco4);		

		System.out.println("\n   Exemplos:\n");
		System.out.printf( "   Entrada:   %d, %d, %.2f   Saída: VALOR A PAGAR: R$ %.2f%n",id1, unid1, preco1,vpagar1);
		System.out.printf( "              %d, %d, %.2f",id2, unid2, preco2);
		System.out.println("\n");
		System.out.printf( "   Entrada:   %d, %d, %.2f   Saída: VALOR A PAGAR: R$ %.2f%n",id3, unid3, preco3,vpagar2);		
		System.out.printf( "              %d, %d, %.2f",id4, unid4, preco4);		
	}
}
