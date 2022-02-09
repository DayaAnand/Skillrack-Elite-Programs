#include<stdio.h>
#include<stdlib.h>
int R,C,found=0;
int sourceR,sourceC,destR,destC;

void traverse(int matrix[R][C],int row,int col){
    if(row>=0 && row <R && col>=0 && col<C){ //boundary condition
        if(row==destR && col==destC){ //if reached 
            found=1;return;
        }
        
        if(matrix[row][col] ==0 || matrix[row][col]==2){ //0-> no path; 2->already visited
            return;
        }
        matrix[row][col]=2; //modifying as cell visited
        traverse(matrix,row,col-1); //left
        if(!found){
            traverse(matrix,row,col+1); //Right
        }
        if(!found){
            traverse(matrix,row+1,col); //Bottom
        }
        if(!found){
            traverse(matrix,row-1,col); //Top
        }
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
    scanf("%d%d%d%d",&sourceR,&sourceC,&destR,&destC);
    if(matrix[sourceR][sourceC]==0 || matrix[destR][destC]==0){
        printf("no");return;
    }
    traverse(matrix,sourceR,sourceC); //depth search
    printf(found==1?"yes":"no");
    return 0;
}

