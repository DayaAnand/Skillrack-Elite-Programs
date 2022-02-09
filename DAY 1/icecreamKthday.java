import java.util.Scanner;

public class icecreamKthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int c[]=new int[n];
        int ic[]=new int[n];
        c[0]=1;
        ic[0]=1;
        int i;
        // int tot[] = new int[n];
        for(i=1;i<n;i++){
            c[i]=c[i-1]+ic[i-1];
            ic[i]=c[i-1];
            if(i%k==0){
                ic[i]+=ic[i-1];
            }
        
        }
        System.out.println(c[n-1]+ic[n-1]);
        
    }
}
