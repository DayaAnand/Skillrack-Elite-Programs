public class pathExistsFromSourceToDestination {
    static int R,C;
    static int sourceR,sourceC,destR,destC;
    static boolean found=false;
    private static void traverse(int[][] matrix, int row, int col) {
        if(row>=0 &&row<R && col>=0 && col<C){ //boundary condition
            if(row==destR && col==destC){//if reached 
                found=true;
                return;
            }
            if(matrix[row][col] ==0 || matrix[row][col]==2){ //0-> no path; 2->already visited
                return;
            }
            matrix[row][col]=2; //modifying as cell visited
            traverse(matrix, row, col-1);//left
            if(!found){
                traverse(matrix, row, col+1);//right
            }

            if(!found){
                traverse(matrix, row+1, col);//Bottom
            }
            if(!found){
                traverse(matrix, row-1, col);//Top
            }
        }
    }
    public static void main(String[] args) {
        R=4;C=5;
        int matrix[][]={{1,0,1,1,0},{0,1,0,1,1},{1,1,0,1,0},{1,1,1,1,1}};
        sourceR=1;sourceC=1;destR=1;destC=4;
        if(matrix[sourceR][sourceC]==0 || matrix[destR][destC]==0){
            System.out.println("NO");
            return;
        }
        traverse(matrix,sourceR,sourceC); //depth search
        System.out.println(found==true?"YES":"NO");
    }


}
