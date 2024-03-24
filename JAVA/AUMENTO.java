package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class AUMENTO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salario da pessoa: ");
		double salario = sc.nextDouble();
		
		
		if(salario <= 1000.00) {
			double porcento = 20;
			double aumento = salario * porcento / 100;
			double novoSalario = salario + aumento;
			System.out.println("Novo salario = " + String.format("%.2f", novoSalario));
			System.out.println("Aumento = " + String.format("%.2f", aumento));
			System.out.println("Porcentagem = " + porcento + "%");
		}
		else if(salario > 1000.00 && salario <= 3000.00) {
			double porcento = 15;
			double aumento = salario * porcento / 100;
			double novoSalario = salario + aumento;
			System.out.println("Novo salario = " + String.format("%.2f", novoSalario));
			System.out.println("Aumento = " + String.format("%.2f", aumento));
			System.out.println("Porcentagem = " + porcento + "%");
		}
		else if(salario > 3000.00 && salario <= 8000.00) {
			double porcento = 10;
			double aumento = salario * porcento / 100;
			double novoSalario = salario + aumento;
			System.out.println("Novo salario = " + String.format("%.2f", novoSalario));
			System.out.println("Aumento = " + String.format("%.2f", aumento));
			System.out.println("Porcentagem = " + porcento + "%");
		}
		else {
			double porcento = 5;
			double aumento = salario * porcento / 100;
			double novoSalario = salario + aumento;
			System.out.println("Novo salario = " + String.format("%.2f", novoSalario));
			System.out.println("Aumento = " + String.format("%.2f", aumento));
			System.out.println("Porcentagem = " + porcento + "%");
		}
		
		
		sc.close();

	}

}
