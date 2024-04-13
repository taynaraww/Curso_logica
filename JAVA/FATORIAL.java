package exercicios4;

import java.util.Scanner;

public class FATORIAL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de N: ");
		int N = sc.nextInt();
		
		int fatorial = 1;
		for(int i=1; i <= N; i++) {
			fatorial = fatorial *  i;
		}
		
		System.out.println("FATORIAL = " + fatorial);
		
		sc.close();

	}

}
