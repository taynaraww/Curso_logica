#include <stdio.h>
#include <math.h>

int main()
{

    double base, altu, area, peri, diago;

    printf("Base do retangulo: ");
    scanf("%lf", &base);
    printf("Altura do retangulo: ");
    scanf("%lf", &altu);

    area = base * altu;
    peri = 2 * (base + altu);
    diago = sqrt(pow(base , 2.0) + pow(altu, 2.0));

    printf("AREA = %.4lf\n", area);
    printf("PERIMETRO = %.4lf\n", peri);
    printf("DIAGONAL = %.4lf\n", diago);

    return 0;
}
