import java.util.*;
public class BinaryOneCount {
    public static void main(String[] args) {
		//Your Code Here
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int counter=0;
        while(N!=0){
            if((N&1)==1){
                counter++;
            }
            N=N>>1; // n>>1 equivalent to n=n/2
        }
        System.out.println(counter);
	}
}