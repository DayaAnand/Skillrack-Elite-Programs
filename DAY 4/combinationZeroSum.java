import java.util.*;
public class combinationZeroSum {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
        }
        int counter=0;
        for(int ctr=1;ctr<(1<<N);ctr++){
            int sum=0;
            for(int bmi=0;bmi<N;bmi++){
                if((ctr&(1<<bmi))!=0){
                    sum+=arr[bmi];
                }
            }
            if(sum==0){
                counter++;
            }
        }
        System.out.println(counter);
	}
}