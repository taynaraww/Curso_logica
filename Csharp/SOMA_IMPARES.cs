internal class Program {
    private static void Main(string[] args) {

        int a, b, soma, troca;
        Console.WriteLine("Digite dois numeros: ");
        a = int.Parse(Console.ReadLine());
        b = int.Parse(Console.ReadLine());

        if( a > b) {
            troca = a;
            a = b;
            b = troca;
        }
        soma = 0;
        for(int i = a+1; i < b; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
            }
        
        }
        Console.Write("SOMA DOS IMPARES = " + soma);

    }
}