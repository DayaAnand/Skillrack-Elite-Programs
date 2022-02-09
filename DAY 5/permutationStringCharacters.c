#include<stdio.h>
#include<stdlib.h>

void swap(char str[],int x,int y){
    char temp=str[x];
    str[x]=str[y];
    str[y]=temp;
}

void permute(char str[], int left,int right){
    if(left==right){
        printf("%s\n",str);
        return;
    }
    for(int index=left;index<=right;index++){
        swap(str,left,index);
        permute(str,left+1,right);
        swap(str,left,index);
    }
}

int main()
{
    char str[50];
    int len;
    scanf("%s%n",str,&len);
    permute(str,0,len-1);
    return 0;
}