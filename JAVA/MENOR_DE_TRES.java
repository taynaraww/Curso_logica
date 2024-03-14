package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class MENOR_DE_TRES {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
	int a, b, c;
	
	System.out.print("Primeiro valor: ");
	a = sc.nextInt();
	System.out.print("Segundo valor: ");
	b = sc.nextInt();
	System.out.print("Terceiro valor: ");
	c = sc.nextInt();
	
	if (a < b && a < c) {
		System.out.print("MENOR = " + a);
	}
	else if (b < c) {
		System.out.print("MENOR = " + b);
	}
	else {
		System.out.print("MENOR = " + c);
	}
		
	sc.close();
}
}
