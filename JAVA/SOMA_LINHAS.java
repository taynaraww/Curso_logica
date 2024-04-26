package exercicios6;

import java.util.Locale;
import java.util.Scanner;

public class SOMA_LINHAS {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int M = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int N = sc.nextInt();
		
		double[][] mat = new double[M][N];
		double[] vet = new double[N];
		
		for(int i = 0; i < M; i++) {
			System.out.println("Digite os elementos da " + (i+1) + "a. linha: ");
			for(int j = 0; j < N; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		for(int i = 0; i < M; i++) {
			vet[i] = 0;
			for(int j = 0; j < N; j++) {
				vet[i] = vet[i] + mat[i][j];
			}
		}
	
		System.out.println("VETOR GERADO: ");
		for(int i = 0; i < M; i++) {
			System.out.println(vet[i]);
		}
		
		sc.close();
	}

}
