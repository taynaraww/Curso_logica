package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class SOMA_VETOR {
	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		
		 int N, i;
		 double soma, media;
		 double [] vet = new double [N];
		 
		 System.out.print("Quantos numeros voce vai digitar? ");
		 N = sc.nextInt();
		 
		 for (i = 0; i < N; i++) {
			 System.out.print("Digite um numero: ");
			 vet[i] = sc.nextDouble();
		 }
	
		 System.out.println();
		 System.out.print("VALORES = ");
		 for (i = 0; i < N; i++) {
			 System.out.print(String.format("%.1f ", vet[i]));
		 }
		 System.out.println();
		 
		 soma = 0;
		 for (i = 0; i < N; i++) {
			 soma = soma + vet[i];
		 }
		 System.out.print(String.format("%.2f ", soma));
		 
		 media = soma / N;
		 
		 System.out.print(String.format("%.2f ", media));
		 
		 sc.close();
		 }
		} 
