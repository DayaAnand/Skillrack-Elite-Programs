import java.util.*;
public class stockBuySellOnceMaxProfit {

    public static void main(String[] args) {
		//Your Code Here
		Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int[] prices=new int[N];
        for(int index=0;index<N;index++){
            prices[index]=in.nextInt();
        }
        int minPrice=prices[0],maxProfit=0;
        for(int index=1;index<N;index++){ //starting from index 1 as we have set the minPrice to the first element in the price array
            if(prices[index]<minPrice){
                minPrice=prices[index];
            }
            else{
                int profit = prices[index]-minPrice;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        System.out.println(maxProfit);
	}
}
