package exercicios5;

import java.util.Locale;
import java.util.Scanner;

public class APROVADOS {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int N = sc.nextInt();
		
		String[] nome = new String[N];
		double[] nota1 = new double[N];
		double[] nota2 = new double[N];
		double media = 0;
		
		
		for(int i = 0; i < N; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			sc.nextLine();
			nome[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		
		for(int i = 0; i < N; i++) {
			media = (nota1[i] + nota2[i]) / 2;
			if(media >= 6.0) {
				System.out.println(nome[i]);
			}
		}
		
		
		sc.close();
	}

}
