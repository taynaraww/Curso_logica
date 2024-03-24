package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class OPERADORA {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de minutos: ");
		int minutos = sc.nextInt();
		
		double valorP = 50.0; 
		
		if(minutos > 100) {
			valorP = valorP + 2 * (minutos - 100);
		}
		
		System.out.println("Valor a pagar: R$" + valorP);
		
		sc.close();

	}

}
