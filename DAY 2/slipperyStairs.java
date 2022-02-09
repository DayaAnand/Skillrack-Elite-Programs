import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class slipperyStairs{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int l=in.nextInt();
        int t=in.nextInt();
        int leaps[] = new int[l];
        for(int i=0;i<l;i++){
            leaps[i]=in.nextInt();
        }
        List<Integer> slippery =new ArrayList<>();
        for(int ctr=1;ctr<=t;ctr++){
            slippery.add(in.nextInt());
        }
        long ways[]=new long[n+1];
        ways[0]=1;
        for(int step=1;step<=n;step++){
            for(int i=0;i<l;i++){
                if(step>=leaps[i]){
                    ways[step]+=ways[step-leaps[i]];
                }
            }
            if(slippery.contains(step)){
                int  lastNonSlippery = step-1;
                while(slippery.contains(lastNonSlippery)&& lastNonSlippery>0){
                    lastNonSlippery--;
                }
                if(lastNonSlippery>0){
                    ways[lastNonSlippery]+=ways[step];
                }
                ways[step]=0;
            }
        }
        System.out.println(ways[n]);
    }
}