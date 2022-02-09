import java.util.*;
public class largestSquareSubMatrix {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in = new Scanner(System.in);
        int R=in.nextInt();
        int C=in.nextInt();
        int matrix[][] = new int[R][C];
        int parallelMatrix[][] = new int[R][C];
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                matrix[row][col]=in.nextInt();
                if(row==0 || col==0){
                    parallelMatrix[row][col]=matrix[row][col];
                }
            }
        }
        //commented line alternate code for this problem
        // for(int row=0;row<R;row++){
        //     parallelMatrix[row][0]=matrix[row][0];
        // }
        
        // for(int col=0;col<C;col++){
        //     parallelMatrix[0][col]=matrix[0][col];
        // }
        int maxValue=0; 
        
        for(int row=1;row<R;row++){
            for(int col=1;col<C;col++){
                if(matrix[row][col]!=0){
                    int left = parallelMatrix[row][col-1];  //checking for left
                    int top = parallelMatrix[row-1][col];   //checking for top
                    int topLeft = parallelMatrix[row-1][col-1]; //checking for topLeft

                    //parallelMatrix[row][col]=matrix[row][col]+Math.min(Math.min(parallelMatrix[row-1][col],parallelMatrix[row][col-1]),parallelMatrix[row-1][col-1]);
                    //matrix[row][col]=1 will be one so it can be directly coded as 1


                    parallelMatrix[row][col]=matrix[row][col]+Math.min(Math.min(top,topLeft),left);
                    
                    if(parallelMatrix[row][col]>maxValue){
                        maxValue=parallelMatrix[row][col];
                    }

                }
            }
        }
        System.out.println(maxValue);
	}
}
