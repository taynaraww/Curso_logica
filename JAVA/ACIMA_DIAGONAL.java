package exercicios6;

import java.util.Locale;
import java.util.Scanner;

public class ACIMA_DIAGONAL {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int N = sc.nextInt();
		
		int[][] mat = new int[N][N];
		int soma = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				soma = soma + mat[i][j];
			}
		}
		System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
		
		
		
		
		sc.close();
	}

}
