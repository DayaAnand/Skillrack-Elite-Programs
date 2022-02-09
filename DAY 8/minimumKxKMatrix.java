import java.util.*;
public class minimumKxKMatrix {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in = new Scanner(System.in);
        int R=in.nextInt();
        int C=in.nextInt();
        
        int[][] rowSum= new int[R][C+1]; //if solving in c language we have to initialize first column of the matrix to zero
        
        for(int row=0;row<R;row++){
            for(int col=1;col<=C;col++){
                int curr=in.nextInt();
                rowSum[row][col] = curr+rowSum[row][col-1]; //adding previous column value to the present column value each time
            }
        }
        int K=in.nextInt();
        
        int minSum = Integer.MAX_VALUE; //assigning max value
        for(int row=0;row<=R-K;row++){
            for(int col=1;col<=C-K+1;col++){
                int sum=0;
                for(int srow=row;srow<row+K;srow++){
                    sum+=rowSum[srow][col+K-1]-rowSum[srow][col-1];  //subtracting 3th column value with 0th column value --one iteration
                }
                minSum =Math.min(minSum,sum);
            }
        }
        System.out.println(minSum);
	}
}
