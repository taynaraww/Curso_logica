package exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class EXPERIENCIAS {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos se teste serao digitados? ");
		int N = sc.nextInt();
		
		int totalCoelho = 0;
		int totalRato = 0;
		int totalSapo = 0;
		
		for(int i=0; i < N; i++) {
			System.out.print("Quantidade de cobaias: ");
			int Qcobaia = sc.nextInt();
			System.out.print("Tipo de cobaias: ");
			char Tcobaia = sc.next().charAt(0);
			
			if(Tcobaia == 'R') {
				totalRato = totalRato + Qcobaia;
			}
			else if (Tcobaia == 'S') {
				totalSapo = totalSapo + Qcobaia;
			}
			else {
				totalCoelho = totalCoelho + Qcobaia;
			}
		}
		
		int totalCobaia = totalRato + totalSapo + totalCoelho;
		double pCoelho = ((double) totalCoelho / totalCobaia) * 100;
		double pSapo = ((double) totalSapo / totalCobaia) * 100;
		double pRato = ((double) totalRato / totalCobaia) * 100;
		
		System.out.println();
		System.out.println("RELATÓRIO FINAL: ");
		System.out.println("Total: " + totalCobaia + " cobaias");
		System.out.println("Total de coelhos: " + totalCoelho);
		System.out.println("Total de ratos: " + totalRato);
		System.out.println("Total de sapos: " + totalSapo);
		System.out.println("Percentual de coelhos " + String.format("%.2f", pCoelho));
		System.out.println("Percentual de ratos " + String.format("%.2f", pRato));
		System.out.println("Percentual de sapos " + String.format("%.2f", pSapo));
		
		
		sc.close();

	}

}
