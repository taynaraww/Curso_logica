#include <stdio.h>

int main()
{
    int N, menor;
    double soma, media, porcen;

    printf("Quantas pessoas serao digitadas? ");
    scanf("%d", &N);

    char nome[N][50];
    int idade[N];
    double altura[50];

    for (int i = 0; i < N; i++){
        printf("Dados da %da pessoa:\n", i + 1);
        printf("Nome: ");
        fseek(stdin, 0, SEEK_END);
        gets(nome[i]);
        printf("Idade: ");
        scanf("%d", &idade[i]);
        printf("Altura: ");
        scanf("%lf", &altura[i]);
    }
    soma = 0;
     for (int i = 0; i < N; i++){
        soma = soma + altura[i];
     }
    media = soma / N;
    printf("\nAltura media: %.2lf\n", media);

    menor = 0;
    for (int i = 0; i < N; i++){
        if(idade[i] < 16){
            menor = menor + 1;
        }
     }
    porcen = menor * 100.0 / N;
    printf("Percentual de pessoas menores de 16 anos: %.1lf %%\n", porcen);

     for (int i = 0; i < N; i++){
        if(idade[i] < 16){
            printf("%s\n", nome[i]);
        }
     }


    return 0;
}
