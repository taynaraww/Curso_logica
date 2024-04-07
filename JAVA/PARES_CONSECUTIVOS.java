package exercicios3;

import java.util.Scanner;

public class PARES_CONSECUTIVOS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero interio: ");
		int x = sc.nextInt();
		
		int soma = 0;
		while(x != 0) {
			if(x % 2 != 0) {
				x = x + 1;
			}
			soma = 5 * x + 20;
			System.out.println("SOMA = " + soma);
			System.out.print("Digite um numero interio: ");
			x = sc.nextInt();
		}
		
		
		sc.close();

	}

}
