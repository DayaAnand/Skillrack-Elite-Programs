import java.util.Scanner;

public class buyChocolateOrIcecreamMethod1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c[]=new int[n];
        int ic[]=new int[n];
        c[0]=1;
        ic[0]=1;
        int i;  
        int tot[] = new int[n];
        for(i=1;i<n;i++){
            c[i]=c[i-1]+ic[i-1];
            ic[i]=c[i-1];
            tot[i]=c[i]+ic[i];
        }
        System.out.println(tot[i-1]);
    }
}
