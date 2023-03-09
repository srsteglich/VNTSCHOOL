package Aula3;

public class atividade1Variaveis {

	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Tablet";
		int idade = 30;
		int	codigo = 5290;
		char sexo = 'F';
		double preco1 = 5100.0;
		double preco2 = 1000.50;
		double medida = 53.234567;
		
		System.out.println("\nProdutos:\n");
		System.out.printf( "%s, Preco Total: R$ %.2f%n \n",produto1, preco1);
		System.out.printf("%s, Preco Total: R$ %.2f%n \n",produto2, preco2);
		System.out.println("\n");
		System.out.println("Registro: "+ idade +" anos, codigo " + codigo + " e sexo:" + sexo);
		System.out.println("\n \n");
		System.out.printf("Medida com oito casas decimais: %.8f%n \n" ,medida);
		System.out.printf("Medida com duas casas decimais: %.2f%n \n" ,medida);

	}

}
