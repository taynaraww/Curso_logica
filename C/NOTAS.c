#include <stdio.h>


int main()
{
  double nota1, nota2, media;

   printf("Digite a primeira nota: ");
   scanf("%lf", &nota1);
   printf("Digite a segunda nota: ");
   scanf("%lf", &nota2);

   media = (nota1 + nota2);

   printf("NOTA FINAL = %.1lf\n", media);
    if (media < 60.0) {

        printf("REPROVADO\n");
    }

    return 0;
}
