
using System;
using System.Globalization;
internal class Program {
    private static void Main(string[] args) {

        CultureInfo CI = CultureInfo.InvariantCulture;

        double bas, alt;
        Console.Write("Base do retangulo: ");
        bas = double.Parse(Console.ReadLine());
        Console.Write("Altura do retangulo: ");
        alt = double.Parse(Console.ReadLine());

        double area = bas * alt;
        double peri = 2 * (bas + alt);
        double diag = Math.Sqrt(bas * bas + alt * alt);

        Console.WriteLine("AREA = " + area.ToString("F4", CI));
        Console.WriteLine("PERIMETRO = " + peri.ToString("F4", CI));
        Console.WriteLine("DIAGONAL = " + diag.ToString("F4", CI));
    }
}