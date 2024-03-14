#include <stdio.h>

int main()
{
    int N, i;
    double soma, media;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &N);

    double vet[N];

    for (i = 0; i < N; i++){
        printf("Digite um numero: ");
        scanf("%lf", &vet[i]);
    }

    soma = 0;
    printf("\nVALORES = ");
    for (i = 0; i < N; i++){
        printf("%.1lf ", vet[i]);
    }
    printf("\n");

    for (i = 0; i < N; i++){
        soma = soma + vet[i];
        media = soma / N;
    }
    printf("SOMA = %.1lf\n", soma);
    printf("MEDIA = %.1lf\n", media);

    return 0;
}
