import java.util.*;

class islandCount {
    static int R,C;
    private static void dfs(int[][] matrix,int row,int col){
        if(row>=0 && row<R && col>=0 && col<C ){
            if(matrix[row][col]==0){
                return;
            }
            matrix[row][col]=0;
            dfs(matrix,row-1,col);    //top
            dfs(matrix,row+1,col);    //bottom
            dfs(matrix,row,col-1);    //left
            dfs(matrix,row,col+1);    //right
            dfs(matrix,row-1,col-1);  //topLeft  
            dfs(matrix,row+1,col+1);  //bottomRight
            dfs(matrix,row-1,col+1);  //topRight
            dfs(matrix,row+1,col-1);  //bottomLeft
        }
    }
    public static void main(String[] args) {
		//Your Code Here
		Scanner in= new Scanner(System.in);
		 R=in.nextInt();
		 C=in.nextInt();
		int[][] matrix = new int[R][C];
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        matrix[row][col]=in.nextInt();
		    }
		}
		int islandCount=0;
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        if(matrix[row][col]==1){
		            dfs(matrix,row,col);
		            islandCount++;
		        }
		    }
		}
		System.out.println(islandCount);
	}
}