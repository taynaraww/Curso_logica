package exercicios2;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class BASKARA {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Coeficiente a: ");
		double a = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		double b = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if (a == 0 || delta < 0)
	    {
			System.out.print("Esta equacao nao possui raizes reais");
	    }
	    else
	    {
	        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	        System.out.println("X1 = " + String.format("%.4f", x1));
	        System.out.print("X2 = "  + String.format("%.4f", x2));
	    } 
		
		
		sc.close();

	}

}
