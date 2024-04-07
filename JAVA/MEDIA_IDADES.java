package exercicios3;

import java.util.Locale;
import java.util.Scanner;

public class MEDIA_IDADES {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as idades: ");
		int idade = sc.nextInt();
		
		int cont = 0;
		double soma = 0;
		while(idade >= 0) {
			soma = soma + idade;
			cont = cont + 1;
			idade = sc.nextInt();
		}
		
		double media = soma / cont;
		if(cont == 0) {
			System.out.println("IMPOSSÍVEL CALCULAR");
		}
		else {
			System.out.println("MEDIA = " + String.format("%.2f", media));
		}
		
		sc.close();

	}

}
