package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class PAGAMENTO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Valor por hora: ");
		double valorHora = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		int horasTrab = sc.nextInt();
		
		double pagamento = valorHora * horasTrab;
		
		System.out.print("O pagamento para " + nome + " deve ser " + String.format("%.2f", pagamento));
		
		
		sc.close();
	}

}
