import java.util.Scanner;

public class maxSumOfSubarrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		}
		int currSum= arr[0];
		int maxSum=arr[0];
		for(int i=1;i<n;i++){
		    currSum=Math.max(currSum+arr[i],arr[i]);
		    if(currSum>maxSum){
		        maxSum=currSum;
		    }
		}
		System.out.println(maxSum);

    }
}
