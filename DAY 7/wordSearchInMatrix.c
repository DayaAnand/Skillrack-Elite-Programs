#include<stdio.h>
#include<stdlib.h>
int R,C,found=0;
void search(char matrix[R][C],int row,int col,char word[50],int index){
    if(row>=0 && row<R && col>=0 && col<C){
     if(word[index]==NULL){
        found=1;return;
    }
    if(matrix[row][col]!=word[index]){
        return;
    }
    char backup=matrix[row][col]; //getting the backup of the element -- same element should not be considered
                                   // so setting to hypen,to avoid repeating of same element
    matrix[row][col]='-'; //setting the "-" hypen as hypen is not a character
    search(matrix,row,col-1,word,index+1); //left
    search(matrix,row,col+1,word,index+1); //right
    search(matrix,row-1,col,word,index+1); //up
    search(matrix,row+1,col,word,index+1); //bottom
    matrix[row][col]=backup; // setting back the element with the backup element 
    }
}
int main()
{
    scanf("%d%d",&R,&C);
    char matrix[R][C],str[2],word[50];
    
    for(int row=0;row<R;row++){
        for(int col=0;col<C;col++){
           scanf("%s",str);  //getting the input as string to avoid space problem("%d ") when we get elements as integer
           matrix[row][col]=str[0]; 
        }
    }
    scanf("%s",word);
    for(int row=0;row<R;row++){
        for(int col=0;col<C;col++){
             if(matrix[row][col] == word[0]){
                 search(matrix,row,col,word,0);
                 if(found){
                     printf("yes");
                     return;
                 }
             }   
        }
    }
    printf("no"); 
}
