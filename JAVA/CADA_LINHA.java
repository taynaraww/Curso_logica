package exercicios6;

import java.util.Locale;
import java.util.Scanner;

public class CADA_LINHA {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int N = sc.nextInt();
		
		int[][] mat = new int[N][N];
		int maior = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
	
		System.out.println("Maior elemento de cada linha: ");
		for(int i = 0; i < N; i++) {
			maior = mat[i][0];
			for(int j = 1; j < N; j++) {
				if(mat[i][j] > maior) {
					maior = mat[i][j];
				}
			}
			System.out.println(maior);
		}
		
		
		
		
		sc.close();
	}

}
