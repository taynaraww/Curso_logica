package exercicios3;

import java.util.Locale;
import java.util.Scanner;

public class SENHA_FIXA {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.print("Senha Invalida! Tente novamente: ");
			senha = sc.nextInt();
		}
		
		if(senha == 2002) {
			System.out.println("Acesso permitido!");
		}
		
		
		sc.close();

	}

}
