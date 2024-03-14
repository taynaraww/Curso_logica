package curso_programacao;
import java.util.Scanner;

public class SOMA_IMPARES {
public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
 int a, b, soma, troca, i;
 
 System.out.println("Digite dois numeros: ");
 a = sc.nextInt();
 b = sc.nextInt();
 
 if (a > b) {
	 troca = a;
	 a = b;
	 b = troca;
 }
 
 soma = 0;
 
 for (i = a+1; i < b; i++) {
	 if (i % 2 != 0)
		 soma = soma + i;
 }

 System.out.print("SOMA DOS IMPARES = " + soma);
			
  sc.close();
 
}
}
