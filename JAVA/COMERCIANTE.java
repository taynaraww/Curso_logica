package exercicios5;

import java.util.Locale;
import java.util.Scanner;

public class COMERCIANTE {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		int N = sc.nextInt();
		
		String[] nome = new String[N];
		double[] compra = new double[N];
		double [] venda = new double[N];
		int abaixo = 0;
		int entre = 0;
		int acima = 0;
		double porcento = 0;
		double Tcompra = 0;
		double Tvenda = 0;
		double Tlucro = 0;
		
		for(int i = 0; i < N; i++) {
			System.out.println("Produto " + (i+1) + ":");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Preco de compra: ");
			compra[i] = sc.nextDouble();
			System.out.print("Preco de venda: ");
			venda[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < N; i++) {
			double lucro = venda[i] - compra[i];
			porcento = lucro * 100 / compra[i];
			if(lucro < 10) {
				abaixo = abaixo + 1;
			}
				else if(lucro <= 20) {
					entre = entre + 1;
				}
				else {
					acima = acima + 1;
			}
		}
		
		for(int i = 0; i < N; i++) {
			 Tcompra = Tcompra + compra[i];
			 Tvenda = Tvenda + venda[i];
			 Tlucro = Tvenda - Tcompra;
		}
		System.out.println();
		System.out.println("RELATORIO: ");
		System.out.println("Lucro abaixo de 10%: " + abaixo);
		System.out.println("Lucro entre 10% e 20%: " + entre);
		System.out.println("Lucro acima de 20%: " + acima);
		System.out.println("Valor total de compra: " + String.format("%.2f", Tcompra));
		System.out.println("Valor total de venda: " + String.format("%.2f", Tvenda));
		System.out.println("Lucro total: " + String.format("%.2f", Tlucro));
		
		
		sc.close();
	}

}
