package exercicios;


import java.util.Locale;
import java.util.Scanner;

public class CONSUMO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distancia percorrida: ");
		int distancia = sc.nextInt();
		System.out.print("Combustível gasto: ");
		double combustivel = sc.nextDouble();
		
		double consumo = distancia / combustivel;
		
		System.out.print("Consumo medio = " + String.format("%.3f", consumo));

		sc.close();
	}

}
