package exercicios4;

import java.util.Scanner;

public class TABUADA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Deseja a tabuada para qual valor? ");
		int N = sc.nextInt();
		
		
		for(int i = 1; i <= 10; i++) {
			int multi = N * i;
			System.out.println(N + " X " + i + " = " + multi);
		}
	
		sc.close();
	}

}
