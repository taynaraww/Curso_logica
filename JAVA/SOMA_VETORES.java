package exercicios5;

import java.util.Scanner;

public class SOMA_VETORES {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int N = sc.nextInt();
		
		int[] vetA = new int[N];
		int[] vetB = new int[N];
		int soma = 0;
		
		System.out.println("Digite  os valores de A:");
		for(int i = 0; i < N; i++) {
			vetA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores de B:");
		for(int i = 0; i < N; i++) {
		vetB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0; i < N; i++) {
			soma = vetA[i] + vetB[i];
			System.out.println(soma);
		}
		
		sc.close();

	}

}
