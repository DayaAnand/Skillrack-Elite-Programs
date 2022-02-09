#include <stdio.h>
#include <string.h>
int main()
{
    char str1[100000],str2[100000];
    scanf("%s\n%s",str1,str2);
    int R=strlen(str1),C=strlen(str2);
    int matrix[R][C],maxLen=0;
    for(int row=0;row<R;row++){
        for(int col=0;col<C;col++){
            if(str1[row]==str2[col]){
                matrix[row][col]=(row==0||col==0)?1:1+matrix[row-1][col-1];
                if(matrix[row][col]>maxLen){ // even without this condition we can get the result using the commented lines below
                    maxLen=matrix[row][col];
                }
            }
            else{
                matrix[row][col]=0;
            }
        }
    }
    printf("%d",maxLen);
    // printf("%d",matrix[R-1][C-1]); // this can also be done to get the answer //this cannot be done as the last element in the array will not hold the value always..refer note
    return 0;
}
