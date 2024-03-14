#include <stdio.h>


int main()
{
    int N, i, multi;

    printf("Deseja a tabuada para qual valor? ");
    scanf("%d", &N);

    for (i = 1; i <= 10; i++) {
        multi = N * i;
        printf("%d X %d = %d\n", N, i, multi);

    }

    return 0;
}
