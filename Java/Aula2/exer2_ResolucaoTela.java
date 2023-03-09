package Aula2;

import java.awt.Dimension;
import java.awt.Toolkit;

public class exer2_ResolucaoTela {
	public static void main(String[] args) {
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		int largura = (int) tela.getWidth();
		int altura = (int) tela.getHeight();
		
		System.out.println("A sua tela tem resolução " + largura + " por " + altura);
	}
}
