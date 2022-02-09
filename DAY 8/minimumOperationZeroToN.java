import java.util.*;
public class minimumOperationZeroToN {

    public static void main(String[] args) {
		//Your Code Here
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int count=0;
		if(n==1 || n==2){
		    System.out.println(n);
		    return;
		}
		else{  
		    while(n>2){
		        if(n%2==0){  //we can also check for odd using binary like (n&1)
		            n=n/2;
		        }
		        else{
		            n=n-1;
		        }
                count++; //increasing the count for one operation
		    }
		}
        count=count+2;
		System.out.println(count); //adding two to count as minumum 2 operation is required from 0 to 2 

	}
}