import java.util.*;
class Link{
    int source,dest,dist; //dest- destination, dist-distance
}
public class singleSourceShortestPath { 

    public static void main(String[] args) {
		//Your Code Here
        Scanner in = new Scanner(System.in);
        int N=in.nextInt(),L=in.nextInt(); 
        List<Link> links = new ArrayList<>();
        for(int ctr=1;ctr<=L;ctr++){
            Link link = new Link(); //creating a class and an instance for that class so we can add three attributes to the LIST
            link.source = in.nextInt();
            link.dest = in.nextInt();
            link.dist = in.nextInt();
            links.add(link);
        }
        Integer shortest[]  = new Integer[N+1];//Integer is a wrapper by default java assign all values to null. in case of normal int array it assign all values to zero
        shortest[1]=0; //distance from 1-1 is zero
        boolean relaxed = true; //relaxed means that no values changes after iteration refer photo
        for(int iter=1;iter<N && relaxed;iter++){
            relaxed=false;
            for(Link link:links){
                if(shortest[link.source]==null){ 
                    continue;
                }
                if(shortest[link.dest]==null || shortest[link.source]+link.dist < shortest[link.dest]){
                    shortest[link.dest] = shortest[link.source]+link.dist;
                    relaxed=true;
                }
            }
        }
        for(int city=2;city<=N;city++){ //not including the source so city starts from 2
            System.out.print(shortest[city]+" ");
        }
	}
}
