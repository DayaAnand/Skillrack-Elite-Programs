import java.util.*;
public class streetTravelCount {

    public static void main(String[] args) {
		//Your Code Here
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		int matrix[][] = new int[N][N];
		for(int row=0;row<N;row++){
		    for(int col=0;col<N;col++){
		        matrix[row][col]=in.nextInt();
		    }
		}
        int source=in.nextInt()*N+in.nextInt();    //converting given input values to numerical representation
        int destination= in.nextInt()*N+in.nextInt();  
        boolean visited[] = new boolean[N*N]; 
        int streets[] = new int[N*N];  //street array to track the number of streets travelled
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(source);
        visited[source]=true;
        streets[source]=0; //marking the source as zero as it is not considered in street count since it is a street
        while(!queue.isEmpty()){
            int node = queue.poll(); //polling first as we have already added the source to the queue	 
            List<Integer> related = getRelated(matrix,node,N); //getRelated func is to get all adjacent connected 
            
            for(Integer relNode:related){ //traversing the related list 
                if(!visited[relNode]){
                    queue.add(relNode);
                    visited[relNode]=true;
                    streets[relNode]=1+streets[node]; //incrementing the street count
                    if(relNode==destination){ //if the node is equal to the destination 
                        System.out.println(streets[relNode]);  //printing the last count of street reaching the index
                        return;
                    }
                }
            }
        }
        System.out.println(streets[destination]); //printing the count if the value is zero then no path exists
	}
	private static List<Integer> getRelated(int [][] matrix,int node,int N){
	    List<Integer> nodes = new ArrayList<>();
	    int nodeRow=node/N,nodeCol=node%N; //calculating row and col index //refer the docs  
	    
	    
	    for(int col=nodeCol-1;col>=0;col--){ // left traversal find all possible street in left direction
	        if(matrix[nodeRow][col]==1){
	            nodes.add(nodeRow*N+col);   
	        }
	        else{
	            break;
	        }
	    }
	    
	    for(int col=nodeCol+1;col<N;col++){ //right 
	        if(matrix[nodeRow][col]==1){
	            nodes.add(nodeRow*N+col);
	        }
	        else{
	            break;
	        }
	    }
	    
	    
	    for(int row=nodeRow-1;row>=0;row--){ //Top
	        if(matrix[row][nodeCol]==1){
	            nodes.add(row*N+nodeCol);
	        }
	        else{
	            break;
	        }
	    }
	    
	    
	    for(int row=nodeRow+1;row<N;row++){ //Bottom
	        if(matrix[row][nodeCol]==1){
	            nodes.add(row*N+nodeCol);
	        }
	        else{
	            break;
	        }
	    }
	    
	    return nodes;
	}
}
