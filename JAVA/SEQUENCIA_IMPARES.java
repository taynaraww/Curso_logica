package exercicios4;

import java.util.Scanner;

public class SEQUENCIA_IMPARES {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		int X = sc.nextInt();
		
		for(int i=1; i<X; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
			
		sc.close();
	}

}
