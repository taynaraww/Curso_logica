package exercicios3;

import java.util.Scanner;

public class COMBUSTIVEL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		int codigo = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		while(codigo != 4) {
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();
			if(codigo == 1) {
				alcool = alcool + 1;
			}
			else if(codigo == 2) {
				gasolina = gasolina + 1;
			}
			else if(codigo == 3) {
				diesel = diesel + 1;
			}
			else if(codigo == 4) {
				System.out.println("MUITO OBRIGADO");
			}
		}
		
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		
		sc.close();

	}

}
