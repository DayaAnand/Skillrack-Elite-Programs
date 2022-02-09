import java.util.*;
public class matrixZigZagFromBottomRight {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in = new Scanner(System.in);
        int R=in.nextInt();
        int C=in.nextInt();
        int matrix[][] = new int[R][C];
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                matrix[row][col]=in.nextInt();
            }
        }
        int row=R-1,col=C-1,direction=1; //as starting from the bottom right
        for(int iter=1;iter<=R+C-1;iter++){
            if(direction==1){ //moving up
                while(row>=0 && col<C){
                    System.out.print(matrix[row][col]+" ");
                    row--;
                    col++;
                }
                direction=-1;
                //Top overflow
                if(row<0){
                    row=0;
                    col=col-2;
                }
                //Right overflow
                if(col>=C && row>=0){
                    col=C-1;
                }
            }
            else{ //moving down
                while(row<R && col>=0){
                    System.out.print(matrix[row][col]+" ");
                    row++;
                    col--;
                }
                direction=1;
                //Left overflow
                if(col<0){
                    col=0;
                    row=row-2;
                }
                //Bottom overflow
                if(row>=R){
                    row=R-1;
                }
            }
        }
        
	}
}  
