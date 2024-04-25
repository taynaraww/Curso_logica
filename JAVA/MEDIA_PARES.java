package exercicios5;

import java.util.Locale;
import java.util.Scanner;

public class MEDIA_PARES {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		
		double[] vet = new double[N];
		double soma = 0;
		double media = 0;
		double pares = 0;
		
		for(int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < N; i++) {
			if(vet[i] % 2 == 0) {
				pares = pares + 1;
				soma = soma + vet[i];
			}
		}
		
		if(pares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else{
			media = soma / pares;
			System.out.println("MEDIA DOS PARES = " + String.format("%.1f", media));
		}

		sc.close();

	}

}
