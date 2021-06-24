/*
保留2筛掉2的倍数
保留3筛掉3的倍数
保留5筛掉5的倍数 

保留N筛掉N的倍数 
直到小于n的质数的倍数都被去掉
*/
#include <stdio.h>
int main()
{
    int n, i, j;
    scanf("%d", &n);
    int a[n];

    for (i = 2; i < n; i++)
        a[i] = i;
    for (i = 2; i < n; i++)
    {
        for (j = i + i; j <= n; j += i)
            a[j] = 0;
    }
    for (i = 2; i < n; i++)
        if (a[i] != 0)
            printf("%-3d", a[i]);

    return 0;
}