package exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class DIVISAO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos voce vai digitar? ");
		int N = sc.nextInt();
		
		double divisao = 0;
		for(int i=0; i < N; i++) {
			System.out.print("Entre com o numerador: ");
			int numerador = sc.nextInt();
			System.out.print("Entre com o denominador: ");
			int denominador = sc.nextInt();
			
			if (denominador == 0) {
				System.out.println("DIVIÃO IMPOSSÍVEL");
			}
			else {
				divisao =  (double) numerador / denominador;
				System.out.println("DIVISÃO = " + String.format("%.2f", divisao));
			}
		}
		
		
		
		sc.close();

	}

}
