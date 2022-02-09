import java.util.Scanner;

public class equalLeftRightSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr= new int[n];
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
    
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1=arr[i]+sum1;
            sum[i]=sum1;
        }
        int lsum,rsum;
        for(int i=0;i<n;i++){
            lsum=sum[i]-arr[i];
            rsum=sum[n-1]-sum[i];
            if(lsum==rsum){
                System.out.print(arr[i]+" ");
            }
        }
    
    }
}
