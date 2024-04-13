package exercicios4;

import java.util.Scanner;

public class PAR_IMPAR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			System.out.print("Digite um numero: ");
			int X = sc.nextInt();
			
			if(X % 2 != 0 && X < 0) {
				System.out.println("IMPAR NEGATIVO");
			}
			else if(X % 2 == 0 && X < 0) {
				System.out.println("PAR NEGATIVO");
			}
			else if(X % 2 != 0 && X > 0) {
				System.out.println("IMPAR POSITIVO");
			}
			else if(X % 2 == 0 && X > 0) {
				System.out.println("PAR POSITIVO");
			}		
			else {
				System.out.println("NULO");
			}
		}
		
		
		sc.close();

	}

}
