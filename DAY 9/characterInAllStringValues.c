#include<stdio.h>
#include<stdlib.h>

int main()
{
    int N;  
    scanf("%d",&N);
    char str[10000];
    int asciiCount[128]={0}; 
    for(int index=0;index<N;index++){
        scanf("%s",str);
        for(int chindex=0;str[chindex];chindex++){ //loops until the null character is found in the string
            char ch= str[chindex];
            if(asciiCount[ch]==index){ //this condition is to avoid duplicate value incremented
                asciiCount[ch]++;
            }
        }
    }
    for(int ascii=1;ascii<128;ascii++){
        if(asciiCount[ascii]==N){ //printing only when the count is equal to N
            printf("%c",ascii);
        }
    }
}