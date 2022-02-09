#include<stdio.h>
#include<stdlib.h>
int R,C,interations=0;

void traverse(int matrix[R][C],int row,int col){
    if(row>=0&&row<R && col>=0 && col<C){  //checking boundary condition and row and column should not excceed the limit
        if(matrix[row][col]==0){ //base condition
            return;
        }
        matrix[row][col] = 0;
        traverse(matrix,row,col-1);
        traverse(matrix,row,col+1);
        traverse(matrix,row+1,col);
        traverse(matrix,row-1,col);
    }
}

int main()
{
    scanf("%d%d",&R,&C);
    int matrix[R][C];
    for(int row=0;row<R;row++){
        for(int col=0;col<C;col++){
            scanf("%d",&matrix[row][col]);
        }
    }
    int K;
    scanf("%d",&K);
    
    for(int row=0;row<R;row++){
        for(int col=0;col<C;col++){
            if(K==matrix[row][col]){
                interations++;
                traverse(matrix,row,col);
            }
        }
    }
    printf("%d",interations);
}
