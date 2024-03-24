package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class LANCHONETE {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Codigo do produto comprado: ");
		int codigo = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		int quant = sc.nextInt();
		
		if(codigo == 1) {
			double valor = 5 * quant;
			System.out.print("Valor a pagar: R$" + String.format("%.2f", valor));
		}
		else if(codigo == 2) {
			double valor = 3.5 * quant;
			System.out.print("Valor a pagar: R$" + String.format("%.2f", valor));
		}
		else if(codigo == 3) {
			double valor = 4.8 * quant;
			System.out.print("Valor a pagar: R$" + String.format("%.2f", valor));
		}
		else if(codigo == 4) {
			double valor = 8.9 * quant;
			System.out.print("Valor a pagar: R$" + String.format("%.2f", valor));
		}
		else {
			double valor = 7.32 * quant;
			System.out.print("Valor a pagar: R$" + String.format("%.2f", valor));
		}
		
		
		sc.close();
	}

}
