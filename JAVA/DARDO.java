package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class DARDO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as tres distancias: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if(a > b && a > c) {
			System.out.print("MAIOR DISTANCIA = " + String.format("%.2f", a));
		}
		else if(b > c) {
			System.out.print("MAIOR DISTANCIA = " + String.format("%.2f", b));
		}
		else {
			System.out.print("MAIOR DISTANCIA = " + String.format("%.2f", c));
		}
		
		sc.close();

	}

}
