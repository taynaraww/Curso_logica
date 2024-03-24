package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class MULTIPLOS {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x % y == 0 || y % x == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();

	}

}
