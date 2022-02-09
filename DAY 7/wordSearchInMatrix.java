import java.util.Scanner;

public class wordSearchInMatrix {
    static int R,C;
    static boolean found=false;
    private static void search(char[][] matrix, int row, int col, char[] word, int index) {
        if(row>=0 && row<R && col>=0 && col<C){
            if(word[index]!='\0'){
               found=true;
               return;
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
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        R=5;
        C=8;
        char matrix[][] = new char[R][C];
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
               String str=in.next();  //getting the input as string to avoid space problem("%d ") when we get elements as integer
               matrix[row][col]=str.charAt(0); 
            }
        }
        in.nextLine();
        char[] word=in.nextLine().toCharArray();
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                 if(matrix[row][col] == word[0]){
                     search(matrix,row,col,word,0);
                     if(found){
                         System.out.println("yes");
                         return;
                     }
                 }   
            }
        }
        System.out.println("no"); 
    }

}
