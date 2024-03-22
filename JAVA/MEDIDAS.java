package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MEDIDAS {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a medida de A: ");
		double a = sc.nextDouble();
		System.out.print("Digite a medida de B: ");
		double b = sc.nextDouble();
		System.out.print("Digite a medida de C: ");
		double c = sc.nextDouble();
		
		double areaQ = a * 4;
		double areaTri = a * b / 2;
		double areaTrap = (a + b) * c / 2;
		
		System.out.println("AREA DO QUADRADO = " + String.format("%.4f", areaQ));
		System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", areaTri));
		System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", areaTrap));
		
		
		
		
		sc.close();
	}

}
