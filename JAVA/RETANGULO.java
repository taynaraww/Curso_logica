package curso_programacao;
import java.util.Locale; 
import java.util.Scanner; 

public class RETANGULO {
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);
	
	double base, area, alt, peri, diag;
	
   System.out.print("Base do retangulo: ");
   base = sc.nextDouble();
   System.out.print("Altura do retangulo: ");
   alt = sc.nextDouble();
   
   area = base * alt;
   peri = 2 * base + 2 * alt;
   diag = Math.sqrt(Math.pow(base, 2.0) + Math.pow(alt, 2.0));
   
   System.out.println("AREA = " + String.format("%.4f", area));
   System.out.println("PERIMETRO = " + String.format("%.4f", peri));
   System.out.println("DIAGONAL = " + String.format("%.4f", diag));
   
   sc.close ();
	}
	}
