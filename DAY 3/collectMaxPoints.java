import java.util.*;
public class collectMaxPoints {

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
		int max[][] = new int[R][C];
        max[0][0]=matrix[0][0]; //assigning the first element
        for(int col=1;col<C;col++){
            max[0][col]=matrix[0][col]+max[0][col-1];
        }
        for(int row=1;row<R;row++){
            max[row][0]=matrix[row][0]+max[row-1][0];
        }
        for(int row=1;row<R;row++){
            for(int col=1;col<C;col++){
                max[row][col]=Math.max(max[row][col-1],max[row-1][col])+ matrix[row][col];
            }
        }
        System.out.println(max[R-1][C-1]);
	}
}