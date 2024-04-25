package exercicios5;

import java.util.Scanner;

public class MAIS_VELHO {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int N = sc.nextInt();
		
		String[] nome = new String[N];
		int[] idade = new int[N];
		int posicao = 0;
		
		for(int i = 0; i < N; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		int velho = idade[0];
		
		for(int i = 0; i < N; i++) {
			if(idade[i] > idade[0]) {
				velho = idade[i];
				posicao = i;
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + nome[posicao]);
		
		sc.close();

	}

}
