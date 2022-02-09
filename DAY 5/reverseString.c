#include <stdio.h>

void reverse(char str[],int index){
    if(str[index]!='\0'){
      reverse(str,index+1);
      printf("%c",str[index]);
    }
}

int main(){
    char str[]="SkillRack";
    reverse(str,0);
    return 0;
}