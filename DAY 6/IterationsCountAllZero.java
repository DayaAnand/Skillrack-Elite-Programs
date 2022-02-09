public class IterationsCountAllZero {
    static int R,C;
    static int iterations=0;
    public static void main(String[] args) {
        R=5;C=5;
        int matrix[][]={{5,6,0,5,6},{1,8,8,0,2},{5,5,5,0,6},{4,5,5,5,0},{8,8,8,8,8}};
        int K=6;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(K==matrix[row][col]){
                    iterations++;
                    traverse(matrix,row,col);
                }
            }
        }
        System.out.println(iterations);
    }
    private static void traverse(int[][] matrix, int row, int col) {
        if(row>=0&&row<R && col>=0 && col<C){  //checking boundary condition and row and column should not excceed the limit
            if(matrix[row][col]==0){ //base condition
                return;
            }
            matrix[row][col] = 0;
            traverse(matrix,row,col-1);
            traverse(matrix,row,col+1);
            traverse(matrix,row+1,col);
            traverse(matrix,row-1,col);
        }
    }
}
