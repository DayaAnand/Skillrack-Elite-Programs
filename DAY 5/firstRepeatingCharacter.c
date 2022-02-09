#include<stdio.h>
#include<stdlib.h>

int main()
{
    char str[100000];
    scanf("%s",str);
    int ascii[128]={0};
    for(int i=0;str[i]!='\0';i++){ //if null it will exist the loop
        if(ascii[str[i]] ==1){
            printf("%c",str[i]);
            return;
        }
        ascii[str[i]]++; //incrementing the value at last -- also check java code --> there we have incremented first and check ascii[i]==2
    }
}
