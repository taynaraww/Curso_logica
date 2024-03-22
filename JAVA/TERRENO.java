package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class TERRENO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno: ");
		double larg = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		double comp = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		double metro = sc.nextDouble();
		
		double area = larg * comp;
		double preco = area * metro;
		
		System.out.println("Area do terreno = " + String.format("%.2f", area));
		System.out.print("Preco do terreno = " + String.format("%.2f", preco));
		
		sc.close();
	}
}
