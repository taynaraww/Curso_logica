package exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class MEDIA_PONDERADA {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos você vai digitar? ");
		int N = sc.nextInt();
		
		double media = 0;
		for(int i=0; i < N; i++) {
			System.out.println("Digite tres numeros: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			media = (a * 2 + b * 3 + c * 5) / 10;
			System.out.println("MEDIA = " + String.format("%.1f", media));
		}
		
		
		sc.close();

	}

}
