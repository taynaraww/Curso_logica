package exercicios3;

import java.util.Scanner;

public class QUADRANTE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores das coordenadas X e Y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) { 
			 if(x > 0 && y > 0) {
					System.out.println("QUADRANTE 1");
				}
				else if(x < 0 && y > 0) {
					System.out.println("QUADRANTE 2");
				}
				else if(x < 0 && y < 0) {
					System.out.println("QUADRANTE 3");
				}
				else {
					System.out.println("QUADRANTE 4");
				}
			 System.out.println("Digite os valores das coordenadas X e Y: ");
			 x = sc.nextInt();
			 y = sc.nextInt();
		}
		
		
		
		sc.close();

	}

}
