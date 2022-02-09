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
        int currCount[128]={0}; //this array is for a specific string 
        for(int chindex=0;str[chindex];chindex++){
            char ch=str[chindex];
            if(currCount[ch]==0 && (asciiCount[ch]==index || asciiCount[ch]==index-1 )){ 
                //currCount==0 to avoid duplicate charcters // This can also be coded as >=index-1 (for ==index || ==index-1)
                currCount[ch]++;
                asciiCount[ch]++;
            }
        }
    }
    for(int ascii=1;ascii<128;ascii++){
        if(asciiCount[ascii]==N || asciiCount[ascii]==N-1){ //this can also be coded as N>=-1 (for ==N || ==N-1)
            printf("%c",ascii);
        }
    }
    
}
