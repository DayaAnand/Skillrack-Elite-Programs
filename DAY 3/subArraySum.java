import java.util.*;
public class subArraySum {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
        }
        int currSum=arr[0];
        int sum=in.nextInt();
        for(int li=0,ri=0;li<N &&ri<N;){
            if(sum==currSum){
                System.out.println("Yes");
                return;
            }
            else if(currSum<sum){
                ri++;
                if(ri<N){ //booundary condition,should not add when reached the end 
                    currSum+=arr[ri];
                }
            }
            else{
                 currSum-=arr[li];
                 li++;
            }
        }
        System.out.println("No");
	}
}