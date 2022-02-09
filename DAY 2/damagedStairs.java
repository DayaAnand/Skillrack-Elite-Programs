import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class damagedStairs{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int l=in.nextInt();
        int t=in.nextInt();
        int leaps[] = new int[l];
        for(int i=0;i<l;i++){
            leaps[i]=in.nextInt();
        }
        List<Integer> damaged =new ArrayList<>();
        for(int ctr=1;ctr<=t;ctr++){
            damaged.add(in.nextInt());
        }
        long ways[]=new long[n+1];
        ways[0]=1;
        for(int step=1;step<=n;step++){
            if(damaged.contains(step)){
                ways[step]=0;
                continue;
            }
            for(int i=0;i<l;i++){
                if(step>=leaps[i]){
                    ways[step]+=ways[step-leaps[i]];
                }
            }
        }
        System.out.println(ways[n]);
    }
}