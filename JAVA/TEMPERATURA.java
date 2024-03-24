package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class TEMPERATURA {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		char escala = sc.next().charAt(0);
		
		if(escala == 'F') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			double F = sc.nextDouble();
			double C =  (F - 32) * 5 / 9;
			System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", C));
		}
		else {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9 * C / 5 + 32;
			System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", F));
		}
		sc.close();

	}

}
