#include<stdio.h>
#include<stdlib.h>
#define R 9
#define C 9
int main()
{
int rflags[9],cflags[9],smflags[9]; //rflags to check for unique elements from 1-9 //same cflags for column // smflags for sub matrix
for(int index =0;index<9;index++){
    rflags[index]=cflags[index]=smflags[index]=1;
}
int digit;
for(int row=0;row<R;row++){
    for(int col=0;col<C;col++){
        scanf("%d",&digit);
        rflags[row] |= (1<<digit);
        cflags[col] |= (1<<digit);
        smflags[(row/3)*3+col/3] |= (1<<digit); // fomula for sub matrix (row/3)*3+col/3 when row = 3
    }
}
int val=(1<<10)-1; //10000000000 - 1 so nine ones will be there
for(int index=0;index<9;index++){
    if(rflags[index]!=val || cflags[index] !=val || smflags[index] !=val){
        printf("INVALID");
        return;
    }
}
printf("VALID");
}
