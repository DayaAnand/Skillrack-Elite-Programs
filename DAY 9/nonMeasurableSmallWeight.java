import java.util.*;
public class nonMeasurableSmallWeight {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int weights[] = new int[N];
        for(int index=0;index<N;index++){
            weights[index]=in.nextInt();
        }
        Arrays.sort(weights);
        int measurement=1;
        for(int index=0;index<N;index++){
            if(weights[index]<=measurement){  
                measurement+=weights[index];
            }
            else{
                break;
            }
        }
        System.out.println(measurement);
	}
}