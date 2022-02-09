import java.util.Scanner;

class climbingstairs{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int l=in.nextInt();
        int leaps[] = new int[l];
        for(int i=0;i<l;i++){
            leaps[i]=in.nextInt();
        }
        long ways[]=new long[n+1];
        ways[0]=1;
        for(int step=1;step<=n;step++){
            for(int i=0;i<l;i++){
                if(step>=leaps[i]){
                    ways[step]+=ways[step-leaps[i]];
                }
            }
        }
        System.out.println(ways[n]);
    }
}