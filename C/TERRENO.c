#include <stdio.h>

int main ()
{

    double larg, area, comp, valor, preco;

    printf("Digite a largura do terreno: ");
    scanf("%lf", &larg);

    printf("Digite o comprimento do terreno: ");
    scanf("%lf", &comp);

    printf("Digite o valor do metro quadrado do terreno: ");
    scanf("%lf", &valor);

    area = larg * comp;
    preco = area * valor;

    printf("AREA DO TERRENO = %.2lf\n", area);
    printf("PRECO DO TERRENO = %.2lf\n", preco);

    return 0;
}
