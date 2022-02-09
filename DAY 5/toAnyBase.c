#include<stdio.h>
char digits[] = "0123456789ABCDEF";

void toBase(int val, int base){
    if(val==0){
        return;
    }
    toBase(val/base,base);
    printf("%c",digits[val%base]);
}

int main(){
    int N=14;
    int base=2;
    toBase(N,base);
    return 0;
}