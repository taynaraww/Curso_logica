package exercicios6;

import java.util.Locale;
import java.util.Scanner;

public class MATRIZ_GERAL {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int N = sc.nextInt();
		
		double[][] mat = new double[N][N];
		double soma = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextDouble();
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(mat[i][j] > 0) {
					soma = soma + mat[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("SOMA DOS POSITIVOS: " + soma);
		
		System.out.println();
		System.out.print("Esolha uma linha: ");
		int linha = sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");
		for(int j = 0; j < N; j++) {
			System.out.print(mat[linha][j] + " ");
		}
		System.out.println();
		
		System.out.println();
		System.out.print("Esolha uma coluna: ");
		int coluna = sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");
		for(int i = 0; i < N; i++) {
			System.out.print(mat[i][coluna] + " ");
		}
		System.out.println();
		
		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL: ");
		for(int i = 0; i < N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2.0);
				}
			}
		}
		
		System.out.println();
		System.out.println("MATRIZ ALTERADA: ");
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}

}
