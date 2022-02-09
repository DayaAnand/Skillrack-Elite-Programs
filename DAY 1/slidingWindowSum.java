import java.util.Scanner;

class slidingWindowSum{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int N=in.nextInt();
        int windowSize=in.nextInt();
        int[] arr= new int[N];

        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
        }

        int sum=0;
        for(int i=0;i<windowSize;i++){
            sum=sum+arr[i];
        }
        System.out.print(sum+" ");
        for(int i=1;i<N-windowSize+1;i++){
            sum=sum-arr[i-1]+arr[i+windowSize-1];
            System.out.print(sum+" ");
        }
    }
}