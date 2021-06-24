#include<stdio.h>
#define max(a,b) a>b?a:b

int main(){
    int i=0,a,b,c,k,g=1;
    int p[100];
    scanf("%d%d",&a,&b);
    c=max(a,b);
    for(k=2;k<=c;k++){
        while(a%k==0&&b%k==0){
            p[i++]=k;
            a/=k;
            b/=k;
        }
        while(a%k==0){
            p[i++]=k;
            a/=k;
        }
        while(b%k==0){
            p[i++]=k;
            b/=k;
        }
    }
    for(k=0;k<i;k++){
        g*=p[k];
    }
    printf("%d",g);
    return 0;
}