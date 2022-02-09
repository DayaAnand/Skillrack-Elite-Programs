import java.util.*;
public class minimumSwapsDescendingOrder {

    public static void main(String[] args) {
		//Your Code Here
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		int arr[] = new int[N+1];
		for(int index=N;index>=1;index--){ //getting the matrix in reverse order
		    arr[index]=in.nextInt();
		}
		boolean visited[] = new boolean[N+1];
		int totalswaps=0;
		for(int index=1;index<=N;index++){  
		    if(visited[arr[index]]){
		        continue;
		    }
		    if(arr[index]==index){
		        visited[arr[index]]=true;
		        continue;
		    }
		    int edges=0,cycleIndex=index;
		    while(!visited[arr[cycleIndex]]){
		        visited[arr[cycleIndex]]=true;
		        edges++;
		        cycleIndex=arr[cycleIndex];
		    }
		    totalswaps+=edges-1;
		}
		System.out.println(totalswaps);
	}
}