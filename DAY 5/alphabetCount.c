#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
    char str[100000];
    scanf("%s",&str);
    int ascii[128]={0};
    for(int i=0;i<strlen(str);i++){ //i<strlen(str) can also be coded as str[i] -->loops until the null character
        ascii[str[i]]++;
    }
    for(int i=0;i<128;i++){ //loops until 128 since the total ascii array is of 128 length
        if(ascii[i]!=0){ 	
            printf("%c%d",i,ascii[i]);
        }
    }
}
