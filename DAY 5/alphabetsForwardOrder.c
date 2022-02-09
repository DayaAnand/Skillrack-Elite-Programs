#include <stdio.h>

void printAlphabets(char CH1,char CH2){
    if(CH1<=CH2){
      printf("%c ",CH1);
      printAlphabets(CH1+1,CH2);
      
    }
}

int main(){
    char CH1='a';
    char CH2='g';
    printAlphabets(CH1,CH2);
    return 0;
}