package exercicios;

import java.util.Scanner;

public class DURACAO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a duração em segundos: ");
		int duracao = sc.nextInt();
		
		int horas = duracao / 3600;
		int resto = duracao % 3600;
		
		int minutos = resto / 60;
		int segundos = resto % 60;
		
		System.out.print(horas + ":" + minutos + ":" + segundos);
		
		
		sc.close();
	}

}
