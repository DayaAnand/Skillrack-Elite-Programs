import java.util.*;
public class collectMaxGivenCell {

    public static void main(String[] args) {
		//Your Code Here
		Scanner in =new Scanner(System.in);
		int R=in.nextInt();
		int C=in.nextInt();
		int[][] matrix= new int[R][C];
		
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        matrix[row][col]=in.nextInt();
		    }
		}
		
		int startRow=in.nextInt(),startCol=in.nextInt();
		int[][] max = new int[R][C];
		max[startRow][startCol]=matrix[startRow][startCol];
		for(int col=startCol+1;col<C;col++){
		    max[startRow][col]= matrix[startRow][col]+max[startRow][col-1];
		}
		
		for(int row=startRow+1;row<R;row++){
		    max[row][startCol]=matrix[row][startCol]+max[row-1][startCol];
		}
		
		for(int row=startRow+1;row<R;row++){
		    for(int col=startCol+1;col<C;col++){
		        max[row][col]=Math.max(max[row][col-1],max[row-1][col])+matrix[row][col];
		    }
		}
    System.out.println(max[R-1][C-1]);
	}
}