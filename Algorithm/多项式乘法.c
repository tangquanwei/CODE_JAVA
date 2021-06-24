#include <stdio.h>

int main()
{
    int i, j, m, n;

    scanf("%d", &m);
    double a[m + 1];
    for (i = 0; i <= m; i++)
        scanf("%lf", &a[i]);

    scanf("%d", &n);
    double b[n + 1];
    for (i = 0; i <= n; i++)
        scanf("%lf", &b[i]);

    double c[m + n + 1];
    for (i = 0; i <= m + n; i++)
        c[i] = 0;

    for (i = 0; i <= m; i++)
        for (j = 0; j <= n; j++)
            c[i + j] += a[i] * b[j];

    printf("%f*x^%d", c[0], 0);
    for (i = 1; i <= m + n; i++)
        printf(" + %f*x^%d", c[i], i);

    return 0;
}