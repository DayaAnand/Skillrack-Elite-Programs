import java.util.*;
public class matrixZigZagFromTopLeft {

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

        int row=0,col=0,direction=1; //to begin topleft so row=0,col=0,direction=1 --> up
        for(int iter=1;iter<=R+C-1;iter++){ //it runs 9 times if R=3 and C=7;
            if(direction==1){ //moving up
                while(row>=0 && col<C){ //boundary condition
                    System.out.print(matrix[row][col]+" ");
                    row--;
                    col++;
                }
                direction=-1;
                //Top overflow     
                if(row<0 && col<C){ //out of bound
                    row=0;
                }
                //Right overflow
                if(col>=C){
                    col=C-1;
                    row+=2;
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
                if(col<0 && row<R){
                    col=0;
                }
                //Bottom overflow
                if(row>=R){
                    row=R-1;
                    col+=2;
                }
            }
        }
	}
}


