package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class TEMPO_DE_JOGO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hora inicial: ");
		int horaInicio = sc.nextInt();
		System.out.print("Hora final: ");
		int horaFim = sc.nextInt();
		
		if(horaFim > horaInicio) {
			int duracao = horaFim - horaInicio;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		else {
			int duracao = 24 - horaInicio + horaFim;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		
		
		sc.close();

	}

}
