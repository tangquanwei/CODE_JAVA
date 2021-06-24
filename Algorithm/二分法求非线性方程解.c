#include <stdio.h>
#include <math.h>

double f(double x)
{
    return pow(x, 3)-2;//expression here
}
int main()
{
    double a, b, c;
    a = -1;
    b = 3;
    while (fabs(a - b) >= 0.0001)//precision
    {
        c = (a + b) / 2;
        if (f(c) == 0)
            break;
        else if (f(a) * f(c) > 0)
            a = c;
        else
            b = c;
    }
    printf("%.20lf",c);
    return 0;
}