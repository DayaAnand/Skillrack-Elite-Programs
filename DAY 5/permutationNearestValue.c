#include<stdio.h>
#include<stdlib.h>
int x,closest;
void swap(char str[],int x,int y){
    char temp=str[x];
    str[x]=str[y];
    str[y]=temp;
}

int absDiff(int a,int b){
    return a>b? a-b:b-a;
}

void permute(char str[],int left,int right){
    if(left==right){
        int curr = atoi(str);
        if(absDiff(x,curr) < absDiff(x,closest)){
            closest=curr;
        }
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
    scanf("%s%n%d",str,&len,&x);
    closest = atoi(str);
    permute(str,0,len-1);
    printf("%d",closest);
    return 0;
}
