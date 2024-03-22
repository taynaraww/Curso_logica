package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class TROCO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		int quant = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		double dinheiro = sc.nextDouble();
		
		double troco = dinheiro - (preco * quant);
		
		System.out.println("TROCO = " + String.format("%.2f", troco));
		
		sc.close();
	}

}
