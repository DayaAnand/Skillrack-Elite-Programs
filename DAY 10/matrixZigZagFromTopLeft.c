#include<stdio.h>
#include<stdlib.h>

int main()
{
    int R, C;
    scanf("%d%d", &R, &C);
    int matrix[R][C];
    for(int row = 0; row <R; row++){
        for(int col = 0; col < C; col++){
            scanf("%d", &matrix[row][col]);
        }
    }
    int row = 0, col = 0, direction = 1;
    for(int iter = 1; iter <= R + C - 1; iter++){
        if(direction == 1){
            while(row >= 0 && col < C){
                printf("%d ", matrix[row][col]);
                row--;
                col++;
            }
            direction = -1;
            //Top overflow
            if(row < 0 && col < C){
                row = 0;
            }
            //Right overflow
            if(col >= C){
                col = C - 1;
                row += 2;
            }
        }
        else{
            while(row < R && col >= 0){
                printf("%d ", matrix[row][col]);
                row++;
                col--;
            }
            direction = 1;
            //Left overflow
            if(col < 0 && row < R){
                col = 0;
            }
            //Bottom overflow
            if(row >= R){
                row = R - 1;
                col += 2;
            }
        }
    }
}
