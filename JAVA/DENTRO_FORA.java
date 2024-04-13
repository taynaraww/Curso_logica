package exercicios4;

import java.util.Scanner;

public class DENTRO_FORA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		
		int dentro = 0;
		int fora = 0;
		
		for(int i=0; i<N; i++){
			System.out.print("Digite um numero: ");
			int X = sc.nextInt();
			if(X >= 10 && X <= 20) {
				dentro = dentro + 1;
			}
			else {
				fora = fora + 1;
			}
		}
		System.out.println(dentro + " DENTRO");
		System.out.print(fora + " FORA");
		
		sc.close();
	}

}
