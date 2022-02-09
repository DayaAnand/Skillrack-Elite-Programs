#include<stdio.h>
#include<stdlib.h>
#define ULL unsigned long long int

ULL findHCF(ULL a,ULL b){
    return b==0 ? a:findHCF(b,a%b); // Euclidean algorithm
}

int main()
{
    int N;
    scanf("%d",&N);
    ULL hcf,currNum;
    scanf("%llu",&hcf); //first input as HCF
    for(int ctr=2;ctr<=N;ctr++){
        scanf("%llu",&currNum);
        hcf=findHCF(hcf,currNum);
    }
    printf("%llu",hcf);
}