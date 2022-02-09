import java.util.*;
public class singleValueRepeatedOddTimes {

    public static void main(String[] args) {
		//Your Code Here
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
        int oddnum=0;
		int arr[] = new int[N];
        
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
            oddnum=oddnum^arr[i];
        }
        System.out.println(oddnum);
	}
}