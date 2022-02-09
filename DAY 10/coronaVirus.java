import java.util.*;
public class coronaVirus {

    public static void main(String[] args) {
		//Your Code Here
		Scanner in = new Scanner(System.in);
		int R=in.nextInt();
		int C=in.nextInt();
		int healthy=0,days=0;
		int matrix[][] = new int[R][C];
		Queue<Integer> queue = new ArrayDeque<>(); 
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        matrix[row][col]=in.nextInt();
		        if(matrix[row][col]==1){
		            healthy++;
		        }
		        if(matrix[row][col]==2){
		            queue.add(row*C+col); //adding the single representation of a node in a matrix
		        }
		    }
		}
        queue.add(-1); //adding -1 so as to indicate the end of a day
		
        while(!queue.isEmpty()){
            int node=queue.poll(); 
            
            if(node==-1){   //-1 is the demarker 
                if(!queue.isEmpty()){
                    days++;
                    queue.add(-1);
                }
                continue;
            }
            
            int row=node/C,col=node%C;
            if(col!=0 && matrix[row][col-1]==1){ //left //left has a healthy person and he will be infected
                matrix[row][col-1]=2;
                queue.add(row*C+col-1);
                healthy--;
            }
            
            if(col!=C-1 && matrix[row][col+1] ==1){ //right
                matrix[row][col+1]=2;
                queue.add(row*C+col+1);
                healthy--;  
            }
            
            if(row!=0 && matrix[row-1][col] ==1){ //top
                matrix[row-1][col]=2;
                queue.add((row-1)*C+col);
                healthy--;
            }
            
            if(row!=R-1 && matrix[row+1][col] ==1){ //bottom
                matrix[row+1][col]=2;
                queue.add((row+1)*C+col);
                healthy--;
            }
        }
        
        System.out.println(healthy==0 ? days :-1);
	}
}