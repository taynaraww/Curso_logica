package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class TROCO_VERIFICADO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço unitário do produto: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		int quant = sc.nextInt();
		System.out.print("Dinehiro recebido: ");
		double dinheiro = sc.nextDouble();
		
		if(dinheiro >= preco * quant) {
			double troco = dinheiro - (preco * quant);
			System.out.print("TROCO = " + String.format("%.2f", troco));
		}
		else{
			double diferenca = preco * quant - dinheiro;
			System.out.print("DINEHIRO INSUFICIENTE. FALTAM " + String.format("%.2f", diferenca) + " REAIS.");
		}
		sc.close();

	}

}
