#include<stdio.h>
#include<stdlib.h>

int main()
{
    char str[100000];
    int K;
    scanf("%s%d",str,&K);
    int start=0,end=0,unique=0,max=0;
    int maxStart=0,maxEnd=0;
    int len=strlen(str),arr[128]={0};
    arr[str[end]]=1;
    unique=1;
    while(end<len){
        if(K==unique){
            int curr=end-start+1;
            if(curr>max){
                max=curr; 
                maxStart=start;
                maxEnd=end;
            }
        }
        if(unique<=K){
            end++;
            arr[str[end]]++;
            if(arr[str[end]]==1){
                unique++;
            }
        }
        else{
            arr[str[start]]--;
            if(arr[str[start]]==0){
                unique--;
            }
            start++;
        }
    }
    for(int index=maxStart;index<=maxEnd;index++){
        printf("%c",str[index]);
    }
}
