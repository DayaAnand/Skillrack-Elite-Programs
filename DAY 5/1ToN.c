#include <stdio.h>

void print(int val){
    if(val==0){
        return;
    }
    print(val-1);
    printf("%d ",val);
}

int main(){
    int N=5;
    print(N);
    return 0;
}