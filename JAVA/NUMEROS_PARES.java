package exercicios5;

import java.util.Scanner;

public class NUMEROS_PARES {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		
		int pares = 0;
		int[] numero = new int[N];
		
		for(int i = 0; i < N;  i++){
			System.out.print("Digite um numero: ");
			numero[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		for(int i = 0; i < N; i++) {
			if(numero[i] % 2 == 0) {
				System.out.print(numero[i] + " ");
			}
		}
		
		System.out.println();
		for(int i = 0; i < N; i++) {
			if(numero[i] % 2 == 0) {
				pares = pares + 1;
			}
		}
		System.out.println("QUANTIDADE DE PARES = " + pares);
		
		sc.close();

	}

}
