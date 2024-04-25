package exercicios5;

import java.util.Locale;
import java.util.Scanner;

public class DADOS_PESSOAS {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();
		
		double[] altura = new double[N];
		char[] genero = new char[N];
		double media = 0;
		double soma = 0;
		int homem = 0;
		int mulher = 0;
		
		for(int i = 0; i < N; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		double menor = altura[0];
		for(int i = 0; i < N; i++) {
			if(altura[i] < menor) {
				menor = altura[i];
			}
		}
		System.out.println("Menor altura = " + String.format("%.2f", menor));
		
		double maior = altura[0];
		for(int i = 0; i < N; i++) {
			if(altura[i] > maior) {
				maior = altura[i];
			}
		}
		System.out.println("Maior altura = " + String.format("%.2f", maior));
		
		for(int i = 0; i < N; i++) {
			if(genero[i] == 'F') {
				soma = soma + altura[i];
				mulher = mulher + 1;
			}
		}
		if(mulher == 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		}
		else {
			media = soma / mulher;
			System.out.println("Media das alturas das mulheres = " + String.format("%.2f", media));
		}
		
		homem = N - mulher;
		System.out.println("Numero de homens = " + homem);
		
		
		sc.close();

	}

}
