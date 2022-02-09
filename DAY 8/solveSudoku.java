import java.util.*;
class Slot{
    int r,c;
}

public class solveSudoku {
    
    static final int R=9,C=9;
    public static void main(String[] args) {
		//Your Code Here
		Scanner in = new Scanner(System.in);
		int matrix[][] =new int [R][C];
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        matrix[row][col]=in.nextInt();
		    }
		}
        if(solve(matrix)){ //if true printing the matrix
            for(int row=0;row<R;row++){
                for(int col=0;col<C;col++){
                    System.out.print(matrix[row][col]+" ");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("Not Solved");
         }
	}
	private static boolean solve(int[][] matrix){
	    Slot slot = getFreeSlot(matrix); //getting the freeslot to fill in the values
	    if(slot==null){ //if null which means that the sudoku is solved
	        return true;
	    }
	    for(int digit=1;digit<=9;digit++){
	        if( canFillRow(matrix,slot,digit) && canFillCol(matrix,slot,digit) && canfillSubMatrix(matrix,slot,digit)){ //checking that we can fill in the value
	            matrix[slot.r][slot.c]=digit; //setting the digit value 
	            
	            if(solve(matrix)){
	                return true;
	            }
	            
	            matrix[slot.r][slot.c]=0; //backtracking here --> if the sudoku is not solved with the above condition then setting the value to zero
	            
	        } 
	    }
	    return false;
	}
	private static Slot getFreeSlot(int[][] matrix){
	    for(int row=0;row<R;row++){
	        for(int col=0;col<C;col++){
	            if(matrix[row][col]==0){
	                Slot slot = new Slot();
	                slot.r=row;
	                slot.c=col; 
	                return slot;
	            }
	        }
	    }
	    return null;
	}
	
	private static boolean canFillRow(int [][] matrix,Slot slot,int digit){
	    for(int col=0;col<C;col++){
	        if(matrix[slot.r][col]==digit){
	            return false;    //returning false as already the digit is present in the matrix along the row and we cannot fill
	        }
	    }
	    return true;
	}

	private static boolean canFillCol(int [][] matrix,Slot slot,int digit){
	    for(int row=0;row<C;row++){
	        if(matrix[row][slot.c]==digit){
	            return false; //returning false as already the digit is present in the matrix along the col and we cannot fill
	        }
	    }
	    return true;
	}
	
	private static boolean canfillSubMatrix(int [][] matrix,Slot slot,int digit){
	    int startRow = (slot.r/3)*3;
	    int startCol = (slot.c/3)*3;
	    for(int row=startRow;row<=startRow+2;row++){ //submatrix is 3*3 so the end condition of the loop is startRow+2
	        for(int col=startCol;col<=startCol+2;col++){ //submatrix is 3*3 so the end condition of the loop is startCol+2
	            if(matrix[row][col] == digit){
	                return false; //returning false as already the digit is present in the matrix (submatrix) and we cannot fill
	            }
	        }
	    }
	    return true;
	}
}