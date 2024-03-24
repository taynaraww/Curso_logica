package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class NOTAS {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double notaF = nota1 + nota2;
		
		System.out.print("NOTA FINAL = " + String.format("%.1f", notaF));
		
		System.out.println();
		if(notaF < 60.0) {
			System.out.println("REPROVADO");
		}
		
		sc.close();

	}

}
