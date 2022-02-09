#include<stdio.h>
#include<stdlib.h>

int main()
{
    char str[100000];
    int K;
    scanf("%s%d",str,&K);
    
    int start=0,end=0,unique=0,max=0;
    int len=strlen(str),arr[128]={0};
    arr[str[end]]=1; //assigning the first element of the arr to be one as end is pointing at 0
    unique=1; //assigning unique as one as the string first element is poiting to one
    while(end<len){
        if(K==unique){
            int curr=end-start+1; //finding the longest substring
            if(curr>max){
                max=curr;
            }
        }
        if(unique<=K){
            end++;
            arr[str[end]]++;
            if(arr[str[end]]==1){ //increment unique only when the hashed array value is one
                unique++; 
            }
        }else{
            arr[str[start]]--;
            if(arr[str[start]]==0){
                unique--;
            }
            start++;
        }
    }
    printf("%d",max);
}
