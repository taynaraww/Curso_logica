package exercicios6;

import java.util.Locale;
import java.util.Scanner;

public class SOMA_MATRIZES {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int M = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int N = sc.nextInt();
		
		int[][] matA = new int[M][N];
		int[][] matB = new int[M][N];
		int[][] matC = new int[M][N];
		
		System.out.println("Digite os valores da matriz A: ");
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matA[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B: ");
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matB[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MATRIZ SOMA: ");
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				matC[i][j] = matA[i][j] + matB[i][j];
				System.out.print(matC[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
