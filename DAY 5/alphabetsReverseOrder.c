#include <stdio.h>

void printAlphabetsReverse(char CH1,char CH2){
    if(CH2!=(CH1-1)){
      printf("%c ",CH2);
      printAlphabetsReverse(CH1,CH2-1);
    }
}

int main(){
    char CH1='a';
    char CH2='g';
    printAlphabetsReverse(CH1,CH2);
    return 0;
}