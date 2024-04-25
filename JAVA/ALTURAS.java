package exercicios5;

import java.util.Locale;
import java.util.Scanner;

public class ALTURAS {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();
		
		double media = 0;
		double soma = 0;
		double porcento = 0;
		int cont = 0;
		
		String[] nome = new String[N];
		int[] idade = new int[N];
		double[] altura = new double[N];
		
		
		for(int i = 0; i < N; i++){
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		System.out.println();	
		for(int i = 0; i < N; i++) {
			soma = soma + altura[i];
		}
		media = soma / N;
		System.out.println("Altura média: " + String.format("%.2f", media));
		
		for(int i = 0; i < N; i++) {
			if(idade[i] < 16) {
				cont = cont + 1;
			}
		}
		porcento = cont * 100 / N;
		System.out.println("Pessoas com menos de 16 anos: " + porcento + "%");
		
		for(int i = 0; i < N; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		
		sc.close();

	}

}
