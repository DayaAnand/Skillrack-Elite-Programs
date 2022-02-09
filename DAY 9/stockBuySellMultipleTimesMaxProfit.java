import java.util.*;
public class stockBuySellMultipleTimesMaxProfit {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int[] prices = new int[N];
        for(int index=0;index<N;index++){
            prices[index]=in.nextInt();
        }
        int profit=0;
        for(int index=1;index<N;index++){ //starting the index from one as there is no previous element for the 0th element in prices array
            if(prices[index]>prices[index-1]){
                profit+=prices[index]-prices[index-1];
            }
        }
        System.out.println(profit);
	}
}
