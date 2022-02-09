import java.util.*;
public class minimumSwapsAscendingOrder {

    public static void main(String[] args) {
        //Your Code Here
    Scanner in = new Scanner(System.in);
    int N= in.nextInt();
    int arr[] = new int[N+1];
    for(int index=1;index<=N;index++){
        arr[index]=in.nextInt();
    }
    boolean visited[] = new boolean[N+1];
    int totalSwap=0;
    for(int index=1;index<=N;index++){
        if(visited[arr[index]]){    //if already visited
             continue;
        }
        if(arr[index]==index){     //if 2==2 change to true and continue  
            visited[arr[index]]=true;
            continue;
        }
        int edges=0,cycleIndex=index;
        while(!visited[arr[cycleIndex]]){
            visited[arr[cycleIndex]]=true;
            edges++;
            cycleIndex=arr[cycleIndex];
        }
        totalSwap+=edges-1;
    }
    System.out.println(totalSwap);
    } 
}

