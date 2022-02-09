import java.util.*;
public class matrixTraversalClockwise {

    public static void printLeftToRight(int matrix[][],int row,int startCol,int endCol){
        for(int col=startCol;col<=endCol;col++){
            System.out.print(matrix[row][col]+" ");
        }
    }
    
    public static void printTopToBottom(int matrix[][],int col,int startRow ,int endRow){
        for(int row=startRow;row<=endRow;row++){
            System.out.print(matrix[row][col]+" ");
        }
    }
    public static void printRightToLeft(int matrix[][],int row,int startCol,int endCol){
        for(int col=endCol;col>=startCol;col--){
            System.out.print(matrix[row][col]+" ");
        }
    }
    public static void printBottomToTop(int matrix[][],int col,int startRow,int endRow){
        for(int row=endRow;row>=startRow;row--){
            System.out.print(matrix[row][col]+" ");
        }
    }
    
    public static void main(String[] args) {
		//Your Code Here
		Scanner in=new Scanner(System.in);
		int R=in.nextInt();
		int C=in.nextInt();
		int matrix[][] = new int[R][C];
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        matrix[row][col]=in.nextInt();
		    }
		}
		
		int topRow=0,bottomRow=R-1,leftCol=0,rightCol=C-1;
		while(topRow<=bottomRow && leftCol<=rightCol){
		    printLeftToRight(matrix,topRow,leftCol,rightCol);
		    printTopToBottom(matrix,rightCol,topRow+1,bottomRow);
		    if(topRow!=bottomRow){
		        printRightToLeft(matrix,bottomRow,leftCol,rightCol-1);
		    }
		    if(leftCol!=rightCol){
		        printBottomToTop(matrix,leftCol,topRow+1,bottomRow-1);
		    }
		    topRow++;
		    bottomRow--;
		    leftCol++;
		    rightCol--;
		}

	}
}