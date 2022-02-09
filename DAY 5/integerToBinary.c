#include <stdio.h>

void toBinary(int val){
    if(val==0){
        return;
    }
    toBinary(val/2);
    printf("%d ",val%2);
}

int main(){
    int N=9;
    toBinary(N);
    return 0;
}